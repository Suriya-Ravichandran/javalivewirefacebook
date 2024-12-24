package com.facebook.app;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		User u1 =new User();
		while(true) {
		System.out.println("Welcome TO Facebook");
		System.out.println("Press 1 TO LOGIN\nPress 2 to SIGNUP");
		System.out.println("------------------------------------");
//		login code
		int choice=scn.nextInt();
		if(choice==1) {
			System.out.println("-----------Login page----------");
			u1.setname();
			System.out.println("Enter password: ");
			String password=scn.nextLine();
			String verifypassword=u1.getpassword();
//			verify password
			if(password.equals(verifypassword)) {
			System.out.println("Login success");
			System.out.println("------------------------------------");
//			loop start
			while(true) {
			System.out.println("Edit Your profile press 1\nView Profile press 2\nLogout to Press 0");
			int option=scn.nextInt();
			if(option==1) {
				u1.setname();
				u1.setbio();
				u1.setDp();
				System.out.println("Profile edited success");
				
			}
			else if(option==2) {
				System.out.println("-------------User profile-------------");
				u1.getdata();
			}
			else if(option==0) {
				System.out.println("Logout....");
				break;
			}
			else {
				System.out.println("Invaild option");
			}
//			loop end
			}
//			verify password end
			}else {
				System.out.println("Password Incorrect !!");
			}
			
		}
//		sign up code
		else if(choice==2) {
			System.out.println("------------signup page-------------");
			u1.setname();
			u1.setpassword();
			System.out.println("Signup sucess");
		}
		
		}
	}

}
