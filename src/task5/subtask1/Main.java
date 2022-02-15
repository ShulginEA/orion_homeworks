package task5.subtask1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Circle(4, 5, 7);
        figures[1] = new Rectangle(-2, 5,10,8);
        figures[2] = new Rectangle(-1, -9,2,10);
        figures[3] = new Rectangle(1, 30,7,20);
        figures[4] = new Circle(-10, -30, 10);

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i]);
        }
    }
}
