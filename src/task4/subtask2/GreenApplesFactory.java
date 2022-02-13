package task4.subtask2;

import task4.subtask1.Apple;
import task4.subtask1.Fruit;

import java.util.Random;

public class GreenApplesFactory extends AbstractFabric{
    @Override
    Fruit makeFruit() {
        return new Apple(new Random().nextInt(100), "зеленое");
    }
}
