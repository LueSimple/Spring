package com.spring403.domain;

public class User {
     private int userID;
     private String userName;
     private String userPWD;
     private int userTele;
     private String email;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPWD() {
		return userPWD;
	}
	public void setUserPWD(String userPWD) {
		this.userPWD = userPWD;
	}
	public int getUserTele() {
		return userTele;
	}
	public void setUserTele(int userTele) {
		this.userTele = userTele;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userPWD=" + userPWD + ", userTele=" + userTele
				+ ", email=" + email + "]";
	}
	

}
