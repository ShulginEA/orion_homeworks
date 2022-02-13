package task4.subtask1;

public class Apple extends Fruit{
    private String color;

    public Apple(int weight, String color) {
        super(weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
