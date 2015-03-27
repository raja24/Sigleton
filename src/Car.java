
public class Car {
	
	// // step2: 2. declare Car object as static for access it anywhere
	static Car c = null;
	String name;
	// step1: default constructor is public will create multiple object of the car
	
	public void carName(){
		System.out.println("Car name :" +name);
	}

	// step2: 1. Singleton object by declaring private constructor, 
	// so single car object can created and it is restricted within Car class
	private Car(){
		
	}
	
	// step2: 3. accessing car object out of the Car class
	// no matter how many times you call this function, it will return only one object
	public static Car getInstance(){
		if(c==null)
			c = new Car();
		// else 
		
			return c;
	}
}
