package task5.subtask1;

public abstract class Figure {
    int x;
    int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract int square();

    public Quadrant getQuadrant() {
        if (x > 0 && y > 0) {
            return Quadrant.I;
        } else if (x < 0 && y > 0) {
            return Quadrant.II;
        } else if (x < 0 && y < 0) {
            return Quadrant.III;
        } else if (x > 0 && y < 0) {
            return Quadrant.IV;
        }
        return Quadrant.CENTER;
    }
}
