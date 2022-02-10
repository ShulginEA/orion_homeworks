package task3.subtask2;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new SequentialRandom();
            System.out.println(SequentialRandom.getNumber());
            if (i % 5 == 0 && i != 0) {
                System.out.println("Вызов resetRandom()");
                SequentialRandom.resetRandom();
            }
        }
    }
}
