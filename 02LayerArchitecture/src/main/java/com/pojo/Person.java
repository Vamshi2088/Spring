package com.pojo;

public class Person {
	
	private int id;
	
	private String name;
	
	private Address add;
	
	

	public Person(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	

}
