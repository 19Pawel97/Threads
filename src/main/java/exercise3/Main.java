package exercise3;

import java.util.Scanner;

public class Main {

    // 3. Stwórz aplikację która co sekundę (w drugim wątku) sprawdza czy w katalogu pojawił się
    // nowy plik. Jeśli pojawił się nowy plik lub jakiś zniknął, to wypisuje stosowny komunikat na
    // ekran. Drugi wątek (główny) ma przyjmować w linii poleceń adres katalogu który jest
    // sprawdzany (możemy zmienic adres czytanego katalogu).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Checker checker = new Checker();
        Thread thread = new Thread(checker);
        checker.setPath(line);
        thread.start();

        while (true) {
            String line1 = scanner.nextLine();
            checker.setPath(line1);
        }
    }
}
