package com.tnsif.abstraction;

public class Rectangle extends Shape {
	float l,b;

	
	public Rectangle(float l, float b) {
		super();
		this.l = l;
		this.b = b;
	}


	@Override
	void displayarea() {
		area=l*b;
		
		
	}

}
