package com.tnsif.abstraction;

public abstract class Shape {
	
	protected double area;
	
	abstract void displayarea();
	
	void print() {
		System.out.println("Area is ="+area);
	}

}
