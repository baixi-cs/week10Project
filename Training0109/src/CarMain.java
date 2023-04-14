import Car.java;
import Vehicle.java;

public class CarMain {
	public static void main() {
		Vehicle v = new Vehicle("white", "Van",2008);
		System.out.println(v.year);
		Car c = new Car("red","Honda",2003 );
		c.process();
		
		v.process();
	}

}
