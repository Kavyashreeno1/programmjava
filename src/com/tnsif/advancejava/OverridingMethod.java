package com.tnsif.advancejava;

public class OverridingMethod {

	public static void main(String[] args) {
		RBI  rbi;
		
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterst());
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterst());
		
	

	}



	
}
