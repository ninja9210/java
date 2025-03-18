class StringOperations {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World";
        String third = "World";

        System.out.println("First String: " + first);
        System.out.println("Second String: " + second);

        char ch = first.charAt(0);
        System.out.println("Character at index 0: " + ch);

        String upperStr = first.toUpperCase();
        System.out.println("To Upper Case: " + upperStr);

        String lowerStr = second.toLowerCase();
        System.out.println("To Lower Case: " + lowerStr);

        String joinedStr = first.concat(second);
        System.out.println("Concatenated String: " + joinedStr);

        int length = first.length();
        System.out.println("Length of First String: " + length);

        boolean result1 = first.equals(second);
        System.out.println("Are First and Second Strings Equal? " + result1);

        boolean result2 = second.equals(third);
        System.out.println("Are Second and Third Strings Equal? " + result2);
    }
}
