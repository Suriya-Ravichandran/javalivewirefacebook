package com.facebook.app;

import java.util.Scanner;
public class Video {
	Scanner scn=new Scanner(System.in);
	public String upload() {
		System.out.print("Enter video name: ");
		String video=scn.next(); 
		System.out.println("Video upload successfully "+video);
		return video;
	}
	public void delete(String name) {
		String name1=name;
		System.out.println("Video delete successfully "+name1);
	}
	public String edit(String name) {
		String name1=name;
		System.out.println(name1);
		System.out.println("Enter new name");
		name1=scn.next();
		System.out.println("Video edit successfully "+name1);
		return name1;
		
	}

}
