package com.daolayer;

import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;

import com.pojo.Person;

public class PrsDaoImpl implements PrsDao {

	static String insert="insert into person values(?,?,?)";
	static String update="update person set name=?,salary=? where id=?";
	static String delete="delete from person where id=?";
	
	static {
		System.out.println("dao....!");
	}
	
	private JdbcTemplate jt;
	
	
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	@Override
	public List<Person> FindAll() {

		return null;
	}
	@Override
	public void insert(Person p) {

		
		jt.update(insert, new Object[] {p.getId(),p.getName(),p.getFee()});
		System.out.println("inserted......!");
		
		
	}

}
