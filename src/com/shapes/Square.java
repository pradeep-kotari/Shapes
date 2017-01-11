package com.shapes;

public class Square extends RegularPolygon {

	public Square(double lengthOfEachSide) {
		super(lengthOfEachSide);
	}

	@Override
	public String toString() {
		return "Square [name=" + name + ", numberOfSides=" + numberOfSides + ", areaCoEfficient=" + areaCoEfficient
				+ "]";
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(){
		name = Square.class.getName();
	}

	@Override
	public final void setNumberOfSides() {
		this.numberOfSides = 4;
	}

}
