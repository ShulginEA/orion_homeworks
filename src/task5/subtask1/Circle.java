package task5.subtask1;

public class Circle extends Figure {
    private int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public int square() {
        return (int) (Math.PI * Math.pow(r, 2));
    }

    @Override
    public String toString() {
        return "Circle - " + square();
    }
}
