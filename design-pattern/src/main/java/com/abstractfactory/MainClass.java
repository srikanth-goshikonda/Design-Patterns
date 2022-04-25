package com.abstractfactory;

public class MainClass {
	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory("Shape");
		Shape shape = factory.getShape("Rectangle");
		shape.draw();

		AbstractFactory factory2 = FactoryProducer.getFactory("Color");
		Color color = factory2.getColor("RED");
		color.fill();

	}
}
