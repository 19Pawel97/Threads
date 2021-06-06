package exercise5;

import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    //    5. Stwórz aplikację "timery". Wątek główny przyjmuje w linii liczbę. Liczba oznacza czas do
    //    wybudzenia. Po wpisaniu liczby (np. 50000) aplikacja ma startować nowy wątek, który ma
    //    się wybudzić za ten czas (np. za 50 s.) i wypisze komunikaty: To Twój timer 50 s. - wake up!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("It is ur timer " + time/1000 + " s. - wake up!");
            }
        };

        Future<?> future = executorService.scheduleWithFixedDelay(runnable,time,time, TimeUnit.MILLISECONDS);
    }
}
