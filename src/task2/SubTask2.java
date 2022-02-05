package task2;

import java.util.Arrays;
import java.util.Random;

public class SubTask2 {
    public static void main(String[] args) {
        int[] numArr = new int[5];
        Random random = new Random();

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = random.nextInt(10);
            System.out.print(numArr[i] + " ");
        }
        System.out.println();

        int evenArrLng = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                evenArrLng++;
            }
        }

        int oddArrLng = numArr.length - evenArrLng;
        int[] evenArr = new int[evenArrLng];
        int[] oddArr = new int[oddArrLng];

        evenArrLng = 0;
        oddArrLng = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                evenArr[evenArrLng] = numArr[i];
                evenArrLng++;
            } else {
                oddArr[oddArrLng] = numArr[i];
                oddArrLng++;
            }
        }

        System.out.println("Массив четных: " + Arrays.toString(evenArr));
        System.out.println("Массив нечетных: " + Arrays.toString(oddArr));

        System.out.print("Среднее в четном массиве: ");
        printAverageInArr(evenArr);
        System.out.print("Среднее в нечетном массиве: ");
        printAverageInArr(oddArr);


    }

    public static double calculateAverage(int[] numArr) {
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        return (double) sum / numArr.length;
    }

    public static void printAverageInArr(int[] numArr) {
        if (numArr.length != 0) {
            System.out.println(calculateAverage(numArr));
        } else {
            System.out.println("нет элементов");
        }
    }

}
