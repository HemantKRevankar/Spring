package com.hemant.spring.model;

public class Triangle implements Shape {
	private String type;
	/*private Integer height;*/
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle() {
	}

	/*public Triangle(String type, Integer height) {
		this.type = type;
		this.height = height;
	}*/
	public Triangle(String type, Point pointA, Point pointB, Point pointC) {
		this.type = type;
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	/*public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}*/

	/*public void draw() {
		System.out.println(this.getType() +" Triangle drawn" + " of height " + this.getHeight());
	}*/
	
	public void draw() {
		System.out.println(this.getType()+ " Triangle drawn, using points with coordinates as shown below:");
		System.out.println("PointA {" + this.getPointA().getX() + ", " + this.getPointA().getY() + "}");
		System.out.println("PointB {" + this.getPointB().getX() + ", " + this.getPointB().getY() + "}");
		System.out.println("PointC {" + this.getPointC().getX() + ", " + this.getPointC().getY() + "}");
	}
}
