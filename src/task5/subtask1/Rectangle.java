package task5.subtask1;

public class Rectangle extends Figure {
    private int h;
    private int w;

    public Rectangle(int x, int y, int h, int w) {
        super(x, y);
        this.h = h;
        this.w = w;
    }

    @Override
    public int square() {
        return h * w;
    }

    @Override
    public String toString() {
        return "Rectangle - " + square();
    }
}
