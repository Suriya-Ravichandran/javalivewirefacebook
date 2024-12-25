package com.facebook.app;
import java.util.Scanner;

public class Post {
	Scanner scn = new Scanner(System.in);
	private String post;
	
	public  void Addpost() {
		System.out.println("UPload Path : ");
		post=scn.nextLine();
	}
	public void getpost() {
		System.out.println("post: "+post);
	}

}
