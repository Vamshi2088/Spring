package com.pool;

import java.sql.SQLException;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zaxxer.hikari.HikariDataSource;

public class Pool {
	
//	public static String driver="com.mysql.cj.jdbc.Driver";
//	public static String url="jdbc:mysql://localhost:3306/Spring";
//	public static String user="root";
//	public static String ps="9963101639";
	
	public static void main(String[] args) {
	
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		HikariDataSource hds  = (HikariDataSource) ap.getBean("h");
		try {
			System.out.println(hds.getConnection());
		} catch (SQLException e) {
			System.out.println("---------");
			e.printStackTrace();
		}
		
	}

}
