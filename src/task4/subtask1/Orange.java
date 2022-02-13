package task4.subtask1;

public class Orange extends Fruit{
    private int skinThickness;

    public Orange(int weight, int skinThickness) {
        super(weight);
        this.skinThickness = skinThickness;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                ", skinThickness=" + skinThickness +
                '}';
    }

}
