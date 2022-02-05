package task2;

import java.util.Random;

public class SubTask1 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        Random random = new Random();

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = random.nextInt();
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
        System.out.println("Сумма: " + sum(numArr));
        int[] minArr = findMinInArr(numArr);
        System.out.printf("Минимальное число индекс и его значение: %d %d %n", minArr[0], minArr[1]);
    }

    public static int sum(int[] numArr) {
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        return sum;
    }

    public static int[] findMinInArr(int[] numArr) {
        int[] result = new int[2];
        result[1] = numArr[0];

        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] < result[1]) {
                result[1] = numArr[i];
                result[0] = i;
            }
        }
        return result;
    }
}
