package exercise1;

public class Main {
    public static void main(String[] args) {

        Juhuuu juhuuu = new Juhuuu();
        Thread thread = new Thread(juhuuu);
        thread.start();

    }
}
