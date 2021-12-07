package com.Registration.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.Registration.dao.UserDao;
import com.Registration.model.User;

@Controller
public class UserController {
	
	@Autowired
	User user;
	
	@Autowired
	UserDao userDao;
	
	String msg;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("user", user);
		model.addAttribute("msg", msg);
		return "index";
	}
	
	
	@RequestMapping("validate")
	public String validateUser(@ModelAttribute("user") User user,  Model mv) {
		
		User user1 = userDao.validateUser(user);
		if(user1!=null) {
			msg = "Login Successfull";
			System.out.println("Login Successfull");
			return "redirect:/home";
		}else {
			System.out.println("Login Failed");
			msg = "Login Failed";
			return "redirect:/";
		}
		
	}
	@RequestMapping("/home")
	public String Homepage (Model model) {
		model.addAttribute("user",user);
		return "home";
	}

	@RequestMapping("/Registration")
	public String showRegisterationForm(Model model) {
		model.addAttribute("user", user);
		return "Registration";
	}
	
	@RequestMapping("submitform")
	public ModelAndView saveUser(@ModelAttribute("user") User user, ModelAndView mv, @RequestParam("pic") MultipartFile file) throws IOException {
		
		System.out.println("In Save User");
		byte[] userPic = file.getBytes();
		user.setUserPic(userPic);
		userDao.addUser(user);
		mv.addObject("msg", "User Added Successfully");
		//mv.addObject("user", user);
		mv.setViewName("Registration");
		return mv;
	}
	
	@RequestMapping("getall")
	public ModelAndView getAllUser(ModelAndView mv) {
		List<User> userList = userDao.getAllUser();
		mv.addObject("users", userList);
		mv.addObject("msg", msg);
		System.out.println(user.getUserId());
		mv.setViewName("viewuser");
		return mv;
	}
	
	@RequestMapping("getuserform")
	public String getUserForm() {
		return "getuser";
	}
	
	@RequestMapping("getbyid")
	public ModelAndView getById(@RequestParam("userId") int userId, ModelAndView mv) {
		User user = userDao.getUserById(userId);
		mv.addObject("user", user);
		mv.setViewName("showuser");
		return mv;
	}
	
	@RequestMapping("updateuser/{userId}")
	public String getUpdateUser(@PathVariable int userId, Model m) {
		
		User user = userDao.getUserById(userId);
		System.out.println("In Controller : "+user);
		m.addAttribute("user", user);
		return "Upadateform";
		
	}
	
	@RequestMapping("saveupdate")
	public String saveUpdate(@ModelAttribute("user") User user, @RequestParam("pic") MultipartFile file) throws IOException {
		byte[] userPic = file.getBytes();
		user.setUserPic(userPic);
		userDao.updateUser(user);
		return "redirect:/getall";
		
	}
	
	@RequestMapping("deleteuser/{userId}")
	public String deleteUser(@PathVariable int userId) {
		userDao.deleteUser(userId);
		return "redirect:/getall";
	}
	

}
