package races;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {
    private final BankAccount bankAccount = new BankAccount();
    private final ExecutorService executorService = Executors.newFixedThreadPool(4);

    public void sendTransferOfAmount(double amount) {
        executorService.submit(new Transfer(amount, Direction.OUT, bankAccount));
    }

    public void receiveTransferOfAmount(double amount) {
        executorService.submit(new Transfer(amount, Direction.IN, bankAccount));
    }

    public void printBalance() {
        bankAccount.displayBalance();
    }
}
