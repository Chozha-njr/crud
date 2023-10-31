package javaproject1;

public class Throws {
	 public void divide(int a, int b) throws ArithmeticException {
	        if (b == 6) {
	            throw new ArithmeticException("Division by zero");
	        }
	        int result = a / b;
	        System.out.println("Result: " + result);
	    }

	    public static void main(String[] args) {
	        Throws example = new Throws();
	        try {
	            example.divide(10, 0);
	        } catch (ArithmeticException e) {
	            System.out.println("Caught exception: " + e.getMessage());
	        }
	    }

}
