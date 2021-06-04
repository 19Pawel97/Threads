package races;

import lombok.Getter;

public class BankAccount {
    private double balance = 0.0;
    private final Object lock = new Object();

    // synchronized - only one thread can do a particular block of code (no help - two functions/blocks of codes in this case)
    public /*synchronized*/ void receiveTransfer(double amount) {
        synchronized (lock) {
            balance += amount;
        }
    }

    public /*synchronized*/ void sendTransfer(double amount) {
        synchronized (lock) {
            balance -= amount;
        }
    }

    public void displayBalance() {
        System.out.println(balance);
    }
}
