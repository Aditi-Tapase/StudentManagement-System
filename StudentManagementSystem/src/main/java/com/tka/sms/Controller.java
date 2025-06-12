package com.tka.sms;

import java.util.Scanner;

// use to call the services
public class Controller {
	public static void main(String[] args) {
StudentService studentservice = new StudentService();
//Student s1=new Student(501, "Anushka", 22);
//studentservice.addStudent(s1);

Scanner sc=new Scanner(System.in);

//for(int i=1;i<=3; i++) {
//	System.out.println("enter a id, name, age");
//	Student s1=new Student(sc.nextInt(),sc.next(),sc.nextInt());
//
//	studentservice.addStudent(s1);
//}

studentservice.deleteStudent(501);

	}

}
