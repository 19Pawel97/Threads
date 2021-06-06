package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 2. Stwórz aplikację a w niej wątek który raz na 5 sekund wypisuje na ekran:
        // 1. Hello World! -
        // 2. Hello World!! -
        // 3. Hello World!!! -
        // Główny wątek powinien przyjmować tekst który ma występować po hello world. np. jeśli
        // wpisze:
        // "Michałki"
        // wątek powinien wypisywać
        // 4. Hello World!!!! - Michałki

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
