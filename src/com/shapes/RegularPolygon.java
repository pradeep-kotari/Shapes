package com.shapes;

public abstract class RegularPolygon {

	// public RegularPolygon instance = getInstance();

	protected String name;
	public int numberOfSides;
	private double lengthOfEachSide;
	private double area = calcArea();
	private double perimeter = calcPerimeter();
	public double areaCoEfficient = perimeter / 2 * Math.tan(180 / lengthOfEachSide);

	public RegularPolygon(double lengthOfEachSide) {
		super();
		this.lengthOfEachSide = lengthOfEachSide;
	}

	public double getInteriorAngle() {
		return 360 / numberOfSides;
	}


	public double getPerimeter() {
		return perimeter;
	}

	private final double calcPerimeter() {
		return numberOfSides * lengthOfEachSide;
	}

	public abstract String getName();
	
	public abstract void setName();

	public abstract void setNumberOfSides();

	public double getArea() {
		return area;
	}

	private double calcArea() {
		return areaCoEfficient * lengthOfEachSide * lengthOfEachSide;
	}

}