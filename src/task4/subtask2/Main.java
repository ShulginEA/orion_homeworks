package task4.subtask2;

import task4.subtask1.Fruit;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AbstractFabric[] fabrics = new AbstractFabric[10];
        Random random = new Random();

        for (int i = 0; i < fabrics.length; i++) {
            switch (random.nextInt(4)) {
                case 0: fabrics[i] = new GreenApplesFactory(); break;
                case 1: fabrics[i] = new LongPinepplesFactory(); break;
                case 2: fabrics[i] = new RedApplesFactory(); break;
                case 3: fabrics[i] = new ThinOrangeFactory(); break;
            }
        }

        Fruit[] fruits = new Fruit[20];

        for (int i = 0; i < fabrics.length; i++) {
            for (int j = i * 2; j < (i * 2) + 2; j++) {
                fruits[j] = fabrics[i].makeFruit();
            }
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
