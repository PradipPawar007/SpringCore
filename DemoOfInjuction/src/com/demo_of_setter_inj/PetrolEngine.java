package com.demo_of_setter_inj;

public class PetrolEngine implements IEngine{

	@Override
	public int start() {
		System.out.println("Petrol Engine Started....");
		return 1;
	}

}
