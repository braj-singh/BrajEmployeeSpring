package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Id
	private String id;
	private String name;
	private String description;

	public Employee(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Employee() {

	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}

