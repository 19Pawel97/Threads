package exercise1;

public class Main {
    public static void main(String[] args) {

        //   Stwórz aplikację, w niej uruchom wątek, którego zadaniem jest po 30 sekundach wypisać
        //   komunikat "Juhuuuu!". Po tej czynności aplikacja ma się zamknąć.

        Juhuuu juhuuu = new Juhuuu();
        Thread thread = new Thread(juhuuu);
        thread.start();

    }
}
