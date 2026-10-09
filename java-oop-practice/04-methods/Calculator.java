public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Sum = " + calc.add(7, 3));
        System.out.println("Product = " + calc.multiply(7, 3));
        
        System.out.println("Difference = " + calc.subtract(7, 3));
        System.out.println("Division = " + calc.divide(7, 3));
    }
}