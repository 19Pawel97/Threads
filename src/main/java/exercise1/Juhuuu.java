package exercise1;

public class Juhuuu implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
        }
        System.out.println("Juhuuuuuu!");
    }
}
