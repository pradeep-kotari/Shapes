package com.shapes;

public class PolygonDemo {

	public static void main(String[] args) {
		ColorSquare RED = ColorSquare.valueOf("RED_SQUARE");
		Square s1 = new Square(100);
		System.out.println(s1.toString());
		Square redSquare = RED.getSquare(10);
		System.out.println(redSquare.toString());
		System.out.println(RED);
		
		for(ColorSquare colorSquare: ColorSquare.values()){
			System.out.println(colorSquare.equals(RED));
			System.out.println(colorSquare);
		}

	}

}
