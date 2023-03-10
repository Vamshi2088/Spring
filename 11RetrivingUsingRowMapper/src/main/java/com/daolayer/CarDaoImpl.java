package com.daolayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.pojo.Car;

@Repository("c")
public class CarDaoImpl implements CarsDAO {

	@Autowired
	private JdbcTemplate jttl;

	public void setJttl(JdbcTemplate jttl) {
		this.jttl = jttl;
	}

	static {
		System.out.println("dao....!");
	}

	@Override
	public List<Car> getAll() {
		String getAll = "select * from cars";

		return jttl.query(getAll, new RowMapper<Car>() {

			@Override
			public Car mapRow(ResultSet rs, int rowNum) throws SQLException {

				Car c = new Car();
				c.setId(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setPrice(rs.getDouble(3));
				return c;

			}

		});
	}

	@SuppressWarnings("deprecation")
	@Override
	public Car getById(int id) {
		String getById = "select * from cars where id=?";

		return jttl.queryForObject(getById, new Object[] { id }, new RowMapper<Car>() {

			@Override
			public Car mapRow(ResultSet rs, int id) throws SQLException {
				Car c = new Car();
				c.setId(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setPrice(rs.getDouble(3));
				return c;
			}

		});
	}

	@SuppressWarnings("deprecation")
	@Override
	public Car getByName(String name) {

		String getByName = "select * from cars where name=?";
		return jttl.queryForObject(getByName, new Object[] { name }, new RowMapper<Car>() {

			@Override
			public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
				Car c = new Car();
				c.setId(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setPrice(rs.getDouble(3));
				return c;
			}

		});
	}

}
