class StudentInfo {
    public static void main(String[] args) {
        String names[] = { "Rajesh", "Suresh", "Ramesh", "Kamlesh", "Vignesh" };
        int rollNo[] = { 1, 2, 3, 4, 5 };
        int marks[] = { 45, 78, 83, 77, 93 };
        char div[] = { 'A', 'B', 'A', 'A', 'B' };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " roll no " + rollNo[i] + " in div " + div[i] + " got " + marks[i] + " marks.");
        }
    }
}
