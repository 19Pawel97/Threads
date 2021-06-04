package races;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Transfer implements Runnable {
    private double amount;
    private Direction direction;
    private BankAccount bankAccount;

    @Override
    public void run() {
        if (direction == Direction.IN) {
            bankAccount.receiveTransfer(amount);
        } else {
            bankAccount.sendTransfer(amount);
        }
    }
}
