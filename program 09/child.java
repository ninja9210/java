class Parent {
    void demo() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.demo();
        obj.show();
    }
}
