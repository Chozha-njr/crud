package javaproject1;

public class ImplicitExplicit {
	 public static void main(String[] args) {
		        //implicit type
		        int intValue = 78;
		        double DoubleValue1 = intValue; 
		        System.out.println("Implicit Type Casting :");
		        System.out.println("int to double: " + DoubleValue1);

		        // Explicit Type 
		        double DoubleValue2 = 20000.5;
		        int IntValue2 = (int) DoubleValue2; 
		        System.out.println("Explicit Type Casting :");
		        System.out.println("double to int: " + IntValue2);
		    }
		}
