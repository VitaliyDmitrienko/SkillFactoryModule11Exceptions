// Module 11. Exceptions. Exercise 11.2.1. "Unchecked exceptions"
public class Main1121 {
    public static void main(String[] args) {
        // ArithmeticException
        // Выполнение арифметических операций (например, деление на ноль).
        int a = 10, b = 0;
        try {
            int c = a/b;
        }
        catch (ArithmeticException e) {
            System.out.print ("ArithmeticException: try zero divide.");
        }
// It is not right! :)



    }
}
