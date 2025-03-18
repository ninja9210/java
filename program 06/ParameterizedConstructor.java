class ParameterizedConstructor {
    int sum;

    // Parameterized Constructor
    ParameterizedConstructor(int a, int b) {
        sum = a + b;
        System.out.println("This is a Parameterized Constructor");
    }

    void display() {
        System.out.println("Addition = " + sum);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(10, 20);
        obj.display();
    }
}
