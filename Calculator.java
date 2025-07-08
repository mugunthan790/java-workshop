public class Calculator {
    public static void main(String[] args) {
     Calculator calculator = new Calculator();
     int a = 5;
     int b = 10;
     System.out.println("addition: " + calculator.add(a, b));
     System.out.println("subtraction: " + calculator.subtract(b, a));
     System.out.println("multiplication: " + calculator.multiply(a, b));
     System.out.println("division: " + calculator.divide(b, a));
       public int divide(int a, int b) {

        try {
            if (b == 0) {
                throw new ArithmeticException("cannot divisible by zero (0)");

            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
        return a / b;
    }
    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        Calculatorexample calculator = new Calculatorexample();
        System.out.println("Division: " + calculator.divide(6, 2));
         System.out.println("Addition :"+ calculator.add(6, 3));
        // System.out.println("Subtraction: " + calculator.subtract(10, 4));

    }

}
    
