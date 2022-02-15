package task5.subtask2;

public class Person {
    private String name;
    private Season favoriteSeason;

    public Person(String name, Season favoriteSeason) {
        this.name = name;
        this.favoriteSeason = favoriteSeason;
    }

    public String getName() {
        return name;
    }

    public Season getFavoriteSeason() {
        return favoriteSeason;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", game=" + favoriteSeason.getGameOfSeason() +
                '}';
    }
}
