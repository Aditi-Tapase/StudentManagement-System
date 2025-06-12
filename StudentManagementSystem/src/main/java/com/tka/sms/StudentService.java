package com.tka.sms;

// perform action using Dao
public class StudentService {
	StudentDao studentDao = new StudentDao();
	
//	public void addStudent(Student s) 
//	{
//		if(s.getId()>0) {
//		int i=studentDao.addStudent(s);
//		
//		
//		if(i>0) {
//			System.out.println(i+"row inserted successfully");
//		}
//		else {
//			System.out.println("no data inserted");
//		}
//		
//	}
//		else {
//			System.out.println("Invalid Id");
//		}
//
//}
	
	public  void deleteStudent(int id) {
		if(studentDao.deleteStudent(id)>0) {
		System.out.println("row deleted");	
		}
	}
}
