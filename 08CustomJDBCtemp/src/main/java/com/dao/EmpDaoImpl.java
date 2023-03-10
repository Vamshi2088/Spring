package com.dao;

import com.entity.Employe;
import com.template.JdbcTemplate;

public class EmpDaoImpl implements EmpDao {

	private JdbcTemplate jt;
	
	
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}



	@Override
	public void save(Employe e) {

		Object b[]= {e.getId(),e.getName(),e.getSalary()};
		
		String insert="insert into employe values(?,?,?)";
		jt.save(insert, b);

	}

}
