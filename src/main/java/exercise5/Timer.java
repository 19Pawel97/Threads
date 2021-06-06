package exercise5;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Timer implements Runnable{
    private int time;
    @Override
    public void run() {
        System.out.println("It is ur timer " + time/1000 + " s. - wake up!");
    }
}
