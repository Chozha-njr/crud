package javaproject1;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
        try {
            int[] numbers = {4, 6, 8};
            int result = divide(10, numbers);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
    }

    public static int divide(int numerator, int[] numbers) {
        try {
            int denominator = numbers[3];
            return numerator / denominator;
        } catch (ArithmeticException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

}
