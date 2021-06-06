package exercise2;

public class Printer implements Runnable {
    @Override
    public void run() {
        int counter = 0;
        while (true) {
            for (int i = 0; i < 1; i++) {
                System.out.print(counter + 1 + ". ");
            }
            System.out.print("Hello World");
            for (int i = 0; i < counter + 1; i++) {
                System.out.print("!");
            }
            System.out.print(" - ");
            counter ++;
            try {
                Thread.sleep(5000);
                System.out.println();
            } catch (InterruptedException e) {
            }
        }
    }
}
