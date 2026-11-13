class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Number thread interrupted.");
            }
        }
    }
}

class LetterThread extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Letter thread: " + ch);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Letter thread interrupted.");
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        LetterThread t2 = new LetterThread();
        t1.start();
        t2.start();
    }
}
