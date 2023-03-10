package com.daolayer;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.pojo.Car;

@Repository("c")
public class CarDaoImpl implements CarsDAO {

	
	private NamedParameterJdbcTemplate npjt;
	
	

	
	public void setNpjt(NamedParameterJdbcTemplate npjt) {
		this.npjt = npjt;
	}

	static {
		System.out.println("dao....!");
	}

	@Override
	public void insert01(Car c) {

		String insert="insert into cars values(:id,:name,:price)";
		Map<String, Object> x=new HashMap<String, Object>();
		
		x.put("id", c.getId());
		x.put("name", c.getName());
		x.put("price", c.getPrice());
		
		SqlParameterSource y=new MapSqlParameterSource(x);
		System.out.println("before insert..........!");
		int i = npjt.update(insert, y);
		System.out.println("insert..........!"+i);
		
	}

	@Override
	public void delete(int id) {

		String delete="delete from cars where id=:id";
		SqlParameterSource x=new MapSqlParameterSource("id",id);
		npjt.update(delete, x);
		System.out.println("deleted.....!");
	}

	

	
}
