
public class TestCar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* step 1		  
		 
		Car C1 = new Car();
		Car C2 = new Car();
		Car C3 = new Car();
		Car C4 = new Car();
		
		C1.name = "A";
		C2.name = "B";
		C3.name = "C";
		C4.name = "D";
		
		C1.carName();
		C2.carName();
		C3.carName();
		C4.carName();
		*/ 
		/* outcome A B C D */
		
		
		
		// step 2: 
		Car c1 = Car.getInstance();
		Car c2 = Car.getInstance();
		Car c3 = Car.getInstance();
		Car c4 = Car.getInstance();
		c1.name = "BMW";
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c3.name);
		System.out.println(c4.name);
		
		/* outcome BMW BMW BMW BMW */
		
	}

}
