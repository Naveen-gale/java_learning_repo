import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        v.add("Apple");
        v.add("Banana");
        v.add("Mango");
        System.out.println("Vector: " + v);

        v.add(1, "Orange");
        System.out.println("After insertion: " + v);
        System.out.println("Element at index 2: " + v.get(2));
        System.out.println("Contains Mango: " + v.contains("Mango"));
        System.out.println("Size: " + v.size());
        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());

        v.remove("Banana");
        System.out.println("After removal: " + v);
        System.out.println("Is empty: " + v.isEmpty());
    }
}
