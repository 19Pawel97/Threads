package threadsexample;

public class Main {
    public static void main(String[] args) {
        Screamer screamerA = new Screamer("AAAAA");
        Screamer screamerB = new Screamer("BBBBB");

        Thread threadA = new Thread(screamerA);
        threadA.start();
        Thread threadB = new Thread(screamerB);
        threadB.start();
        System.out.println("Ok, going home.");
    }
}
