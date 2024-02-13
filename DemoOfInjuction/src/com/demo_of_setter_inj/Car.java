package com.demo_of_setter_inj;

public class Car {
    private IEngine eng;
  
	public void setEng(IEngine eng) {
		this.eng = eng;
	}

	public void Drive(){
		int status = eng.start();
		
	    if(status>=1) {
	    	System.out.println("journey is started");
	    }else {
	    	System.out.println("Engine Trouble");
	    }
	} 
	
}
