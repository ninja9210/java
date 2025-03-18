public class UnboxingExample {
    public static void main(String[] args) {
        Integer obj = new Integer(100);

        int num = obj.intValue();

        System.out.println(num + " <--> " + obj);
    }
}
