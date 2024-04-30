package in.ashokit.beans;

public class Car {
	
	private DieselEngine dieselEngine;

	public Car() {
		System.out.println("-- Car class constructor --");
	}
	

//	constructor
	public Car(DieselEngine dieselEngine) {
		super();
		this.dieselEngine = dieselEngine;
	}


	// byName and byTYpe
//	public void setDieselEngine(DieselEngine dieselEngine) {
//		this.dieselEngine = dieselEngine;
//	}
	
	public void drive() {
		int start = dieselEngine.start();
		
		if(start >= 1) {
			System.out.println("Engine started Journey started");
		}else {
			System.out.println("Engine faled to start");
		}
	}
	
	
	
	
	
}
