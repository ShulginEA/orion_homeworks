package task2;

import java.util.Arrays;
import java.util.Random;

public class SubTask3 {
    public static void main(String[] args) {
        int size = 7;
        int[] numArrPositive = new int[size];
        int[] numArrNegative = new int[size];
        numArrPositive = fillArr(numArrPositive.length, true);
        numArrNegative = fillArr(numArrNegative.length, false);

        System.out.println("Массив со значениями > 0: " + Arrays.toString(numArrPositive));
        System.out.println("Массив со значениями < 0: " + Arrays.toString(numArrNegative));

        int[] numArrSum = new int[size];

        for (int i = 0; i < numArrSum.length; i++) {
            numArrSum[i] = numArrPositive[i] + numArrNegative[i];
        }

        System.out.println("Результирующий массив: " + Arrays.toString(numArrSum));

    }

    public static int[] fillArr(int size, boolean positive) {
        Random random = new Random();
        int length = size;
        int rnd = 0;
        int[] result = new int[length];
        while(length > 0) {
            rnd = random.nextInt();
            if ( rnd == 0) {
                continue;
            } else if (rnd > 0 ^ positive) {
                result[length - 1] = rnd;
                length--;
            }
        }
        return result;
    }
}
