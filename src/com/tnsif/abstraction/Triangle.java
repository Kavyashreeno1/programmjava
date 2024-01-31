package com.tnsif.abstraction;

public class Triangle extends Shape {
    float l,b;
    
    
	public Triangle(float l, float b) {
		super();
		this.l = l;
		this.b = b;
	}


	@Override
	void displayarea() {
		area=0.5*l*b;
		
	}

}
