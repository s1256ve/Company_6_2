package org.model;

public class Member_6_2 {
	private Integer id;
	private String name,password;
	public Member_6_2() {
		
	}
	public Member_6_2(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
