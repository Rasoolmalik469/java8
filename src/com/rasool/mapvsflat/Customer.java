package com.rasool.mapvsflat;

import java.util.List;

public class Customer {
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private String email;
	private List<String> pnumbers;
	public Customer(int id, String name, String email, List<String> pnumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pnumbers = pnumbers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPnumbers() {
		return pnumbers;
	}
	public void setPnumbers(List<String> pnumbers) {
		this.pnumbers = pnumbers;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", pnumbers=" + pnumbers + "]";
	}
	
	

}
