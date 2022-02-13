package task4.subtask1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = getRandomFruit();
            System.out.println(fruits[i]);
        }
    }

    public static Fruit getRandomFruit() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                String color = "";
                switch (random.nextInt(3)) {
                    case 0: color = "красное"; break;
                    case 1: color = "зеленое"; break;
                    case 2: color = "желтое"; break;
                }
                return new Apple(random.nextInt(100), color);
            case 1:
                return new Orange(random.nextInt(100), random.nextInt(20));
            case 2:
                return new Pineapple(random.nextInt(100), random.nextInt(15) + 5);
        }
        return null;
    }
}
