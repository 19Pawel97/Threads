package exercise5;

import java.util.Scanner;

public class Main2 {
    //   5. Stwórz aplikację "timery". Wątek główny przyjmuje w linii liczbę. Liczba oznacza czas do
    //   wybudzenia. Po wpisaniu liczby (np. 50000) aplikacja ma startować nowy wątek, który ma
    //   się wybudzić za ten czas (np. za 50 s.) i wypisze komunikat: To Twój timer 50 s. - wake up!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        Timer timer = new Timer(time);

        try {
            Thread.sleep(time);
            Thread thread = new Thread(timer);
            thread.start();
        } catch (InterruptedException e) {
        }
    }
}
