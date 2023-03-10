package com.ciq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ciq.pojo.Student;
import com.zaxxer.hikari.HikariDataSource;

public class DaoImpl implements Dao {

	
	private HikariDataSource hds;
	
	private static Connection con=null;
    private static PreparedStatement ps=null;
    private static ResultSet rs=null;
	

	public void setHds(HikariDataSource hds) {
		this.hds = hds;
	}


	@Override
	public List<Student> getAll() {
		
		List<Student> list=new ArrayList<>();
		try {
			con=hds.getConnection();
			ps=con.prepareStatement("select * from student");
			rs=ps.executeQuery();
			while(rs.next()) {
				
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setFee(rs.getDouble(3));
				
				list.add(s);
				
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null && ps!=null && rs!=null) {
				try {
					rs.close();
					con.close();
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return null;
	}


	@Override
	public void save(Student std) {

		try {
			con=hds.getConnection();
			ps=con.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, std.getId());
			ps.setString(2, std.getName());
			ps.setDouble(3, std.getFee());
			int i = ps.executeUpdate();
			System.out.println("updated "+i);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}


	@Override
	public void delete(int id) {

		try {
			con=hds.getConnection();
			ps=con.prepareStatement("delete from student where id=?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			System.out.println("deleted "+i);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void update(Student s) {

		try {
			con=hds.getConnection();
			ps=con.prepareStatement("update student set name=?,fee=? where id=?");
			ps.setString(1, s.getName());
			ps.setDouble(2, s.getFee());
			ps.setInt(3, s.getId());
			int i = ps.executeUpdate();
			System.out.println("update "+i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
