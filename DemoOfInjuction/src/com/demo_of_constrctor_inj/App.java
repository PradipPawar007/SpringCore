package com.demo_of_constrctor_inj;

public class App {

	public static void main(String[] args) {
       Car c=new Car(new PetrolEngine());
       c.Drive();
	}

}
