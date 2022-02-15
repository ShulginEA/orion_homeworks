package task5.subtask2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[]{"Маша","Паша","Саша","Миша","Гриша"};
        Person[] persons = new Person[10];
        Random random = new Random();

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(names[random.nextInt(5)], Season.values()[random.nextInt(4)]);
            System.out.println(persons[i]);
        }
    }
}
