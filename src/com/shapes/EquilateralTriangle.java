package com.shapes;

public class EquilateralTriangle extends RegularPolygon {

//	private double areaCoEfficient = Math.sqrt(3) / 4 ;

	public EquilateralTriangle(double lengthOfEachSide) {
		super(lengthOfEachSide);
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
		this.numberOfSides = 3;
	}
}
