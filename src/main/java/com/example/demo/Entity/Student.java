package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stuid;
	private String name;
	private String branch;
	public Long getStuid() {
		return stuid;
	}
	public void setStuid(Long stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student(Long stuid, String name, String branch) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.branch = branch;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
