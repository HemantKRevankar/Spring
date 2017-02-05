package com.hemant.spring.model;

public class Triangle implements Shape {
	private String type;
	private Integer height;
	
	public Triangle() {
	}

	public Triangle(String type, Integer height) {
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(this.getType() +" Triangle drawn" + " of height " + this.getHeight());
	}
}
