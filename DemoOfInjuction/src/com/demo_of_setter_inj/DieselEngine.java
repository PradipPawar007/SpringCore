package com.demo_of_setter_inj;

public class DieselEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("Diesel Engine Started....");
		return 1;
	}

}
