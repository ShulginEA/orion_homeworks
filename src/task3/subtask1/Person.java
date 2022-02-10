package task3.subtask1;

public class Person {
    String fistName;
    String lastName;

    public Person(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return  lastName + ", " + fistName;
    }
}
