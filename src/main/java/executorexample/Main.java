package executorexample;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // a lot of small tasks
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable a = new Runnable() {
            @Override
            public void run() {
                System.out.println("a");
            }
        };

        Runnable b = new Runnable() {
            @Override
            public void run() {
                System.out.println("b");
            }
        };

        Runnable c = new Runnable() {
            @Override
            public void run() {
                System.out.println("c");
            }
        };

        for (int i = 0; i < 100; i++) {
            int random = new Random().nextInt(3);
            if (random == 0) {
                executorService.submit(a);
            } else if (random == 1) {
                executorService.submit(b);
            } else {
                executorService.submit(c);
            }
        }
    }
}
