package in.ashokit.LooselyCoupling;

import java.lang.reflect.Field;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		
/*		Setter Injection
		Creating target class Object
		Car c = new Car(); 
		
		// Injecting dependent object into target class through setter
		c.setEngine(new PetrolEngine()); 
		
		c.drive();
		
*/
		
	/* Constructor Injection
		
		Car c = new Car(new PetrolEngine());
		c.drive();
		*/
		
		
//		Field Injection
		
		Class<?> clz = Class.forName("in.ashokit.LooselyCoupling.Car");
		
		Field declaredField = clz.getDeclaredField("engine");
		declaredField.setAccessible(true);
		
		Object obj = clz.newInstance();
		Car car = (Car)obj;
		
		declaredField.set(car, new PetrolEngine());
		
		car.drive();
		
		
	}

}
