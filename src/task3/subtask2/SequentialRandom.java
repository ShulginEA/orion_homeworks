package task3.subtask2;

import java.util.Random;

public class SequentialRandom {
    private static int number = -1;

    public SequentialRandom() {
        if (SequentialRandom.number == -1) {
            resetRandom();
        }
        SequentialRandom.number++;
    }

    public static int getNumber() {
        return number;
    }

    public static void resetRandom() {
        SequentialRandom.number = new Random().nextInt(100);
    }
}
