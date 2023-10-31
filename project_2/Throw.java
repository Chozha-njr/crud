package javaproject1;

public class Throw {
	public static void main(String[] args) {
        try {
            throw new ArithmeticException("This is a custom exception.");
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

}
