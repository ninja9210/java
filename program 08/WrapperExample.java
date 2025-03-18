public class WrapperExample {
    public static void main(String[] args) {
        int num = 100;

        // Boxing - Primitive to Wrapper Object
        Integer obj = Integer.valueOf(num);

        System.out.println(num + " <--> " + obj);
    }
}
