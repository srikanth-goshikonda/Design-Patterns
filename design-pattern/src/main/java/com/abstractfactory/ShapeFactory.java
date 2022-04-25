package com.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		} else if (shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
