public class JavaExceptionHandling {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
            System.out.println("Result: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program execution continues...");
    }
}
