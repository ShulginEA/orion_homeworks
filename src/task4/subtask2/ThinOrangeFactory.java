package task4.subtask2;

import task4.subtask1.Fruit;
import task4.subtask1.Orange;

import java.util.Random;

public class ThinOrangeFactory extends AbstractFabric {

    @Override
    Fruit makeFruit() {
        Random random = new Random();
        return new Orange(random.nextInt(100),random.nextInt(5) + 1);
    }
}
