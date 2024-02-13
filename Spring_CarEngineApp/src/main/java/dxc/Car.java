package dxc;

public class Car {

	IEngine eng;

	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
    void drive() {
    	
    	int status = eng.start();
    	
    	if(status>=1) {
    		System.out.println("journey is started");
    	}else {
    		System.out.println("Engine Trouble");
    	}
    
    }
	
	
	
	
}
