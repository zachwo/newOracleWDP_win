package com.BreadStore;

import java.util.Random;

public class ConsumeBread extends Thread {
    BreadHut breadHut;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(new Random().nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            breadHut.saleBread();
        }
    }
}
