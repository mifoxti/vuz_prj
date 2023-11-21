package upd_20;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 1, 2};
        MinMax<Integer> minMax = new MinMax<>(intArray);

        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());

        double num1 = 10.5;
        double num2 = 5.2;
        System.out.println("Sum: " + Calculator.sum(num1, num2));
        System.out.println("Multiply: " + Calculator.multiply(num1, num2));
        System.out.println("Divide: " + Calculator.divide(num1, num2));
        System.out.println("Subtraction: " + Calculator.subtraction(num1, num2));
    }
}