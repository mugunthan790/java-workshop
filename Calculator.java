public class Calculator {
    public static void main(String[] args) {
     Calculator calculator = new Calculator();
     int a = 5;
     int b = 10;
     System.out.println("addition: " + calculator.add(a, b));
     System.out.println("subtraction: " + calculator.subtract(b, a));
     System.out.println("multiplication: " + calculator.multiply(a, b));
     System.out.println("division: " + calculator.divide(b, a));
    
      
    }
}