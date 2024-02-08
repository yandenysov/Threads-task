package app;

import app.threads.FruitsThread;
import app.threads.VegetablesThread;

public class Main {
    public static void main(String[] args) {
        Thread fruitsThread = new FruitsThread();
        Thread vegetablesThread = new VegetablesThread();
    }
}
