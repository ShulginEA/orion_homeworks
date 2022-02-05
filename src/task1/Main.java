package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numArr = new Integer[2];
        int counter = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                numArr[counter] = scanner.nextInt();
                counter++;
            } else {
                System.out.println("Нужно ввести число");
                scanner.next();
            }
            if (counter >= 2) {
                break;
            }
        }

        if (numArr[0] > numArr[1]) {
            System.out.printf("Число %s больше %s %n", numArr[0], numArr[1]);
        } else if (numArr[0] < numArr[1]) {
            System.out.printf("Число %s меньше %s %n", numArr[0], numArr[1]);
        }
        System.out.println("Сумма: " + (numArr[0] + numArr[1]));
    }
}
