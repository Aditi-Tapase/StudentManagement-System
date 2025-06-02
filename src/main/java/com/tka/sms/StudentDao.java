package com.tka.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// perform db operation
public class StudentDao {
	private static final String url="jdbc:mysql://localhost:3306/203_J2EE";
	private static final String username="root";
	private static final String password="aditi@2003";
	private Connection con=null;
	public  Connection getDbConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
//	public int addStudent(Student s) {
//		int i=0;
//		try {
//			String sql="insert into student values(?,?,?)";
//			PreparedStatement pstmt=getDbConnection().prepareStatement(sql);
//			pstmt.setInt(1, s.getId());
//			pstmt.setString(2,s.getName());
//			pstmt.setInt(3, s.getAge());
//			i=pstmt.executeUpdate();
//		} catch(SQLException e) {
//			e.printStackTrace();
//			
//		}
//		return i;
//		
//	}
	
	public int deleteStudent(int id) {
		int i=0;
		String sql="delete from student where id=?";
		try {
		
		PreparedStatement pstmt=getDbConnection().prepareStatement(sql);
		pstmt.setInt(1, id);
		i=pstmt.executeUpdate();
	}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return i;
		}
}
	
	 

