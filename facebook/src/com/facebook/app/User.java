package com.facebook.app;

import java.util.Scanner;
public class User {
	
	private String name;
	private String bio;
	private String Dp;
	private String password;
	Scanner scn =new Scanner(System.in);
	
//	set name function 
	public void setname() {
		System.out.println("Enter User Name: ");
		name=scn.nextLine();
	}
//	set bio function 
	public void setbio() {
		System.out.println("Enter User Bio: ");
		bio=scn.nextLine();
	}
	
//	set dp function 
	public void setDp() {
		System.out.println("UPload Path : ");
		Dp=scn.nextLine();
	}
	
	//set password function 
	public void setpassword() {
		System.out.println("Enter password : ");
		password=scn.nextLine();
		
	}
//	get all user data function
	public void getdata() {
		System.out.println("Name: "+name);
		System.out.println("Bio: "+bio);
		System.out.println("DP: "+Dp);
	}
//	get password function
	public String getpassword() {
		return password;
	}
	
	
}
