public class UnboxingExample {
    public static void main(String[] args) {
        Integer obj = new Integer(100);

        // Unboxing - Wrapper Object to Primitive
        int num = obj.intValue();

        System.out.println(num + " <--> " + obj);
    }
}
