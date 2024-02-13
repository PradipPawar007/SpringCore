package dxc;

public class Diesel implements IEngine {

	public Diesel() {
		super();
		System.out.println("Diesel Constructor :: 0-param constructor");
	}

	@Override
	public int start() {
        System.out.println("Diesel Engine Started...!");
		return 1;
	}

}
