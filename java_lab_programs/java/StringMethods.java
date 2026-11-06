public class StringMethods {
    public static void main(String[] args) {
        String s = "Java Programming";

        System.out.println("String: " + s);
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Character at index 2: " + s.charAt(2));
        System.out.println("Substring: " + s.substring(5));
        System.out.println("Replace: " + s.replace("Java", "Python"));
        System.out.println("Contains Java: " + s.contains("Java"));
        System.out.println("Starts with Java: " + s.startsWith("Java"));
        System.out.println("Equals Java Programming: " + s.equals("Java Programming"));
    }
}
