package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();
        Thread thread = new Thread(printer);
        thread.start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.print(line);
        }

    }
}
