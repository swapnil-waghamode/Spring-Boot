package in.ashokit.LooselyCoupling;

public class Car {

	private IEngine engine;
	
//	public void setEngine(IEngine engine) {
//		this.engine = engine;
//	}
//	
//	public Car(IEngine engine) {
//		this.engine = engine;
//	}
	
	public void drive() {
		
		int start = engine.start();  
		
		if(start >=1 ) {
			System.out.println("Journey Started");
		}else {
			System.out.println("Engine in trouble");
		}
		
	}
}
