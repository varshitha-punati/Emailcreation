package com.varshi.sample;

import java.util.Scanner;
import java.util.Random;

public class Emailcreation {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//object creation
		Emailcreation obj=new Emailcreation();
		obj.generateEmail(sc);
		obj.randomPassword();
		obj.changePassword(sc);
		
	}
	public static  void generateEmail(Scanner sc) {
		
		System.out.println("enter firstname");
		String firstname=sc.next();
		System.out.println("enter lastname");
		String lastname=sc.next();
		//System.out.println("enter department");
		String department=departmentName(sc);
		System.out.println("enter company");
		String company=sc.next();
		System.out.println("Gmail:"+firstname+"."+lastname+"@"+department+"."+company+"."+"com");			
	}
	public static String departmentName(Scanner sc) {
		System.out.println("enter department");
		String department=sc.next();

		if((department.equals("sales"))||(department.equals("accounting"))||(department.equals("development"))) {
			return department;
		}
		return " ";
		
	}
	public static void randomPassword() {
	
	String password="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; 	
	Random random=new Random();
	StringBuilder s1=new StringBuilder();
	int length = 7;

    for(int i = 0; i < length; i++) {

      int index = random.nextInt(password.length());
      char randomChar = password.charAt(index);
      s1.append(randomChar);
	}
    String randomString = s1.toString();
    System.out.println("Password:"+randomString);
	}
	public static void changePassword(Scanner sc) {
		System.out.print("if you want to generate new password generate yes otherwise no:");
		String option=sc.next();
		if(option.equals("yes")){
			System.out.print("generate new password:");
			String password=sc.next();	
			System.out.println("password:"+password);
		}
	}
}



