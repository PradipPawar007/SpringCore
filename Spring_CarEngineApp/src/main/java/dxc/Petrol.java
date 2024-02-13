package dxc;

public class Petrol implements IEngine {

	public Petrol() {
		super();
		System.out.println("Petrol Constructor :: 0-param constructor");
	}

	@Override
	public int start() {
		System.out.println("Petrol Engine Started.....");
		return 1;
	}

}
