class CommandLineDemo {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Please provide two arguments.");
            return;
        }

        System.out.println("Argument one = " + args[0]);
        System.out.println("Argument two = " + args[1]);
    }
}
