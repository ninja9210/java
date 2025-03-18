class DefaultConstructor {
    int value1, value2;

    DefaultConstructor() {
        System.out.println("This is a Default Constructor");
        value1 = 10;
        value2 = 20;
    }

    void display() {
        System.out.println("First Value = " + value1);
        System.out.println("Second Value = " + value2);
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        obj.display();
    }
}
