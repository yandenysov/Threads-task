package app.threads;

public class FruitsThread extends Thread {
    private static String[] FRUITS = {"Pineapple", "Orange", "Apple", "Banana"};

    public FruitsThread() {
        start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            for (String fruit : FRUITS) {
                System.out.println(fruit);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e);
        }
    }
}
