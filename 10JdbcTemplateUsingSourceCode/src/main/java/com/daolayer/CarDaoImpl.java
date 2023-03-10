package com.daolayer;

import org.springframework.jdbc.core.JdbcTemplate;

import com.pojo.Car;

public class CarDaoImpl implements CarsDAO {

	private JdbcTemplate jttl;

	public void setJttl(JdbcTemplate jttl) {
		this.jttl = jttl;
	}
	
	static {
		System.out.println("dao....!");
	}
	
	String insert="insert into cars values(?,?,?)";
	String update="update cars set name=?, price=? where id=?";
	String delete="delete from cars where id=?";

	@Override
	public void insert(Car c) {
		
		jttl.update(insert, new Object[] {c.getId(),c.getName(),c.getPrice()});
		
		System.out.println("inserted.....!");
	}

	@Override
	public void update(Car c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
