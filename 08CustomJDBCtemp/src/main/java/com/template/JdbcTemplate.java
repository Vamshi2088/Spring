package com.template;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class JdbcTemplate {

	private static BasicDataSource basicDataSource;
	private static Connection con;
	private static PreparedStatement ps;
	
	
	
	public static void setBasicDataSource(BasicDataSource basicDataSource) {
		JdbcTemplate.basicDataSource = basicDataSource;
	}



	public void save(String query,Object [] params) {
		
		try {
			con=basicDataSource.getConnection();
			ps=con.prepareStatement(query);
			int i=1;
			for (Object object : params) {
				
				ps.setObject(i, object);
				i++;
			}
			int j = ps.executeUpdate();
			System.out.println("inserted "+j);
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
	
	}
	
	
}
