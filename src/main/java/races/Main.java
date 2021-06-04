package races;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                bank.sendTransferOfAmount(10);
            } else {
                bank.receiveTransferOfAmount(10);
            }
        }

        Scanner scanner = new Scanner(System.in);
        String line = null;
        do {
            System.out.println("Enter instructions: ");
            line = scanner.nextLine();
            if (line.startsWith("balance")) {
                bank.printBalance();
            }
        } while (!line.equalsIgnoreCase("quit"));
    }
}
