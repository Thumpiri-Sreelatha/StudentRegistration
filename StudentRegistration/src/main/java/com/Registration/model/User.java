package com.Registration.model;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Entity
@Table(name = "user")
@Component

public class User {
	
	@Id   //Specifies the primary key of an entity
	@GeneratedValue(strategy = GenerationType.AUTO)   // 
	
	private Integer userId;
	//@Column(name = "uname")
	private String userName;
	private String userPassword;
	private String userGender;
	private String userCity;
	private String userQualification;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date userDate;
	

	
	@Lob
	private byte[] userPic;
	public User () {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer userId, String userName, String userPassword, String userGender, String userCity, String userQualification, Date userDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.userCity = userCity;
		this.userQualification = userQualification;
		this.userDate = userDate;
		
	}

	
	
	public User(Integer userId, String userName, String userPassword, String userGender, String userCity, String userQualification,Date userDate, byte[] userPic) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.userCity = userCity;
		this.userQualification = userQualification;
		this.userDate = userDate;
		this.userPic = userPic;
	}


	

	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserGender() {
		return userGender;
	}


	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}


	public String getUserCity() {
		return userCity;
	}


	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}


	public String getUserQualification() {
		return userQualification;
	}


	public void setUserQualification(String userQualification) {
		this.userQualification = userQualification;
	}
	


	public Date getUserDate() {
		return userDate;
	}

	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}

	public byte[] getUserPic() {
		return userPic;
	}


	public void setUserPic(byte[] userPic) {
		this.userPic = userPic;
	}
	public String getUserPicture() {
		return Base64.encodeBase64String(userPic);
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userGender="
				+ userGender + ", userCity=" + userCity + ", userQualification=" + userQualification + ", userDate="
				+ userDate + ", userPic=" + Arrays.toString(userPic) + "]";
	}
	
	


	
	
	
}
