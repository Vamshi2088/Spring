package com.pool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Student;

public class BDS {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		BasicDataSource bds = (BasicDataSource) context.getBean("b");

		Student s=new Student(1, "swamy");
		
		try {
			Connection con=bds.getConnection();
			
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()) {
//				
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//			}
			int i = ps.executeUpdate();
			System.out.println("inserted "+i);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
