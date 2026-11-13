import java.util.Scanner;

public class CountArgumentTypes {
    public static void main(String[] args) {
        int strings = 0;
        int integers = 0;
        int floats = 0;

        for (String value : args) {
            Scanner scanner = new Scanner(value);

            if (scanner.hasNextInt()) {
                integers++;
            } else if (scanner.hasNextFloat()) {
                floats++;
            } else {
                strings++;
            }

            scanner.close();
        }

        System.out.println("Strings: " + strings);
        System.out.println("Integers: " + integers);
        System.out.println("Float values: " + floats);
    }
}
