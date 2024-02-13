package com.demo_of_setter_inj;

public class App {

	public static void main(String[] args) {
       Car c=new Car();
       c.setEng(new DieselEngine());
       c.Drive();
	}

}
