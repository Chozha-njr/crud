package javaproject1;
public class Bike {
 
    String make;
    String model;
    int year;

    // Constructor
    public Bike(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the bike
    public void displaybikeInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

	public static void main(String[] args) {
		 Bike bike1 = new Bike("kawasaky", "ninja-900z", 2022);
	        Bike bike2 = new Bike("yamaha", "R-15", 2023);

	       
	        bike1.year = 2023;
	        bike2.model = "R-1";

	       
	        bike1.displaybikeInfo();
	        bike2.displaybikeInfo();
	    }
	}
	

