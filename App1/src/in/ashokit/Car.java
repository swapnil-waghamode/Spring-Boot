package in.ashokit;

public class Car extends Engine {

	public void drive() {
		
		// start the engine
		
		int start = super.start();
		
		if(start >= 1) {
			System.out.println("Journey started");
		}
		// start your journey
	}
}
