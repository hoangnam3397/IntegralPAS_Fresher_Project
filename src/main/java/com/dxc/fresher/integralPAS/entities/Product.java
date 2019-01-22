package com.dxc.fresher.integralPAS.entities;

public class Product {
	private int id;
	private String name;
	private String depscription;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String depscription) {
		this.setId(id);
		this.setName(name);
		this.setDepscription(depscription);
	}

	public Product(String name, String depscription) {
		super();
		this.setName(name);
		this.setDepscription(depscription);
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

	public String getDepscription() {
		return depscription;
	}

	public void setDepscription(String depscription) {
		this.depscription = depscription;
	}
	
	
	


}
