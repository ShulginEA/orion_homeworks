package task4.subtask2;

import task4.subtask1.Fruit;
import task4.subtask1.Pineapple;

import java.util.Random;

public class LongPinepplesFactory extends AbstractFabric {

    @Override
    Fruit makeFruit() {
        Random random = new Random();
        return new Pineapple(random.nextInt(100),random.nextInt(10) + 10);
    }
}
