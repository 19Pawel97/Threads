package exercise3;

import lombok.Setter;

import java.io.File;

@Setter
public class Checker implements Runnable {
    private String path;

    @Override
    public void run() {
        while (true) {
            File file = new File(path);
            File[] files = file.listFiles();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            File file1 = new File(path);
            File[] files1 = file1.listFiles();

            if (files1.length > files.length) {
                System.out.println(files1.length - files.length + " files added.");
            } else if (files1.length < files.length) {
                System.out.println(files.length - files1.length + " files deleted.");
            } else {
                System.out.println("No changes detected.");
            }
        }
    }
}
