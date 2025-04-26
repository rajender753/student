package com.student_service;

import java.util.Objects;



public class Student {

	private Long id;

	private String username;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public Student() {
	}

	public Student(Long id, String username) {
		this.id = id;
		this.username = username;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(this.username);
		System.out.println();
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		System.out.println("Other student name"+ other .username);
		return Objects.equals(id, other.id) && Objects.equals(username, other.username);
	}
	
	
	
	
	
	
	
	
}
