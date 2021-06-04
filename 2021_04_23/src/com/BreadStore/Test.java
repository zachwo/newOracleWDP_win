package com.BreadStore;

public class Test {
    public static void main(String[] args) {
        BreadHut breadHut = new BreadHut();
        ProduceBread producer = new ProduceBread();
        producer.breadHut = breadHut;
        ConsumeBread consumer = new ConsumeBread();
        consumer.breadHut = breadHut;

        producer.start();
        consumer.start();

    }
}
