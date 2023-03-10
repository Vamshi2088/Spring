package com.util;

import java.sql.Connection;


import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zaxxer.hikari.HikariDataSource;

public class Conn {
	
	public static String driver="com.mysql.cj.jdbc.Driver";
	public static String url="jdbc:mysql://localhost:3306/Spring";
	public static String user="root";
	public static String ps="9963101639";
	public static void main(String[] args) {
		
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName(driver);
		bds.setUrl(url);
		bds.setUsername(user);
		bds.setPassword(ps);
		System.out.println(bds);
		
//		try {
//			Connection con=bds.getConnection();
//			System.out.println(con);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ComboPooledDataSource cpds=new ComboPooledDataSource();
		cpds.setDataSourceName(driver);
		cpds.setJdbcUrl(url);
		cpds.setUser(user);
		cpds.setPassword(ps);
		
//		System.out.println(cpds);
		
//		try {
//			Connection con=cpds.getConnection();
//			System.out.println(con);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		HikariDataSource x=new HikariDataSource();
//		x.setDriverClassName(driver);
//		x.setUsername(user);
//		x.setPassword(ps);
//		x.setJdbcUrl(url);
//		try {
//			Connection co = x.getConnection();
//			System.out.println(co);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
		
	}

}
