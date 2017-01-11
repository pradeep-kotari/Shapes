package com.shapes;

public enum ColorSquare implements SquareInterface {

	RED_SQUARE, BLUE_SQUARE, GREEN_SQUARE;

	@Override
	public Square getSquare(double lengthOfEachSide) {
		Square square = new Square(lengthOfEachSide);
		return square;
	}

	@Override
	public ColorSquare getInstanceFromColor(String color) {

		for (ColorSquare instance : ColorSquare.values()) {
			if (instance.name().startsWith(color)) {
				return instance;
			}
		}
		return null;
	}

	@Override
	public String getName() {
		return this.name();
	}

	@Override
	public void setNumberOfSides() {
		// TODO Auto-generated method stub

	}

	@Override
	public com.shapes.Square Square1(double lengthOfEachSide) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getColor() {
		String instanceName = this.name();
		String color = instanceName.substring(0, instanceName.indexOf("_"));
		return color;
	}

	public String getColor(ColorSquare colorSquare) {
		String instanceName = colorSquare.name();
		String color = instanceName.substring(0, instanceName.indexOf("_"));
		return color;
	}

	public String[] getColorsfromInstances() {
		int size = ColorSquare.values().length;
		String[] colors = new String[size];
		int index = 0;
		for (ColorSquare instance : ColorSquare.values()) {
			String color = getColor(instance);
			colors[index++] = color;
		}

		return colors;
	}

}