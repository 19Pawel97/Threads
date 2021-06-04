package threadsexample;

public class Screamer implements Runnable {
    private String scream;
    private boolean isScreaming;

    public Screamer(String scream) {
        this.scream = scream;
        this.isScreaming = true;
    }

    public void scream() {
        System.out.println(System.currentTimeMillis() + " " + scream + "!!!");
    }

    @Override
    public void run() {
        while (isScreaming) {
            scream();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }

    public void stopScreaming() {
        this.isScreaming = false;
    }
}
