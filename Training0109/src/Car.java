

public class Car extends Vehicle{
	public Car(String color, String brand, int year) {
		super(color, brand, year);
		// TODO Auto-generated constructor stub
	}

	public void process() {
		int [] arr = {1,2,3,4,5};
		
		for (int i= 0; i< 5; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Car");
	}

}

