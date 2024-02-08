package app.threads;

public class VegetablesThread extends Thread{
    private static String[] VEGETABLES = {"Tomato", "Potato", "Cucumber", "Beetroot"};

    public VegetablesThread() {
        start();
    }

    @Override
    public void run() {
        for (String vegetable : VEGETABLES) {
            System.out.println(vegetable);
        }
    }
}
