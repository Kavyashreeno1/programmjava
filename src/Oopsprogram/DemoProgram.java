package Oopsprogram;

import java.util.Scanner;

public class DemoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("emter the user name");
		String name = sc.nextLine();
		
		System.out.println("enter the gender");
		String gender = sc.nextLine();
		
		System.out.println("enter the age");
		int age = sc.nextInt();
		
		ProgClass obj= new ProgClass();
		obj.setAge(age);
		obj.setName(name);
		obj.setGender(gender);

	System.out.println(obj);
	}

	
}
