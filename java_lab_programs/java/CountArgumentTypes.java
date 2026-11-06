public class CountArgumentTypes {
    public static void main(String[] args) {
        int strings = 0;
        int integers = 0;
        int floats = 0;

        for (String value : args) {
            try {
                Integer.parseInt(value);
                integers++;
                continue;
            } catch (NumberFormatException e) {
            }

            try {
                Float.parseFloat(value);
                floats++;
            } catch (NumberFormatException e) {
                strings++;
            }
        }

        System.out.println("Strings: " + strings);
        System.out.println("Integers: " + integers);
        System.out.println("Float values: " + floats);
    }
}
