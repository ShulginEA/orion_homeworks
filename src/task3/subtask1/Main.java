package task3.subtask1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 50;

        String[] firstNames = new String[a];
        firstNames[0] = "Коля";
        firstNames[1] = "Нина";
        firstNames[2] = "Андрей";
        firstNames[3] = "Женя";
        firstNames[4] = "Саша";

        String[] lastNames = new String[b];
        lastNames[0] = "Александров";
        lastNames[1] = "Коновалов";
        lastNames[2] = "Шестаков";
        lastNames[3] = "Казаков";
        lastNames[4] = "Ефимов";
        lastNames[5] = "Громов";

        Person[] persons = new Person[c];
        for (int i = 0; i < c; i++) {
            persons[i] = new Person(firstNames[new Random().nextInt(a)], lastNames[new Random().nextInt(b)]);
            System.out.printf("Человек № %d - %s, %s %n", i + 1, persons[i].getLastName(), persons[i].getFistName());
        }
    }
}
