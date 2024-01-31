package com.tnsif.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
	    Shape s;
	    s=new Rectangle(2.3f, 4.2f);
	    s.displayarea();
	    s.print();
	    
	    s=new Triangle(2.3f,6.7f);
	    s.displayarea();
	    s.print();
	    

	}

}
