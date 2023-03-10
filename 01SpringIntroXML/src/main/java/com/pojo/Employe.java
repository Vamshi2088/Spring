package com.pojo;

public class Employe {

	private int id;
	private String place;
	
	
	
public Employe() {
		
	}

public Employe(int id, String place) {
		this.id = id;
		this.place = place;
	}




	@Override
	public String toString() {
		return "Employe [id=" + id + ", place=" + place + "]";
	}
}
