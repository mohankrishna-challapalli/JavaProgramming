//
//public class ObjectDemo {
//		
//		static void method() {
//			System.out.println("Hello ");
//		}
//		public void method2() {
//			System.out.println("Hello ");
//		}
//		public static void main(String [] args) {
//			method();
//			ObjectDemo a=new ObjectDemo();
//			a.method2();
//		}
//		
//	}


class Car {
    // Attributes of the Car class
    String make;
    String model;
    int year;

    // Constructor to initialize Car object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display Car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

public class ObjectDemo{
    public static void main(String[] args) {
        // Creating objects using the constructor
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        // Calling method to display details of each car
        System.out.println("Details of Car 1:");
        car1.displayDetails();

        System.out.println("\nDetails of Car 2:");
        car2.displayDetails();
    }
}
