public class FibonacciCommandLine {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FibonacciCommandLine <number_of_terms>");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
            return;
        }

        if (n <= 0) {
            System.out.println("Enter a positive number of terms.");
            return;
        }

        long first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first);
            if (i < n) System.out.print(" ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
