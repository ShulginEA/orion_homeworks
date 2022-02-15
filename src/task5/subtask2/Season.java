package task5.subtask2;

public enum Season {
    WINTER(Games.SNOWBALLS),
    SPRING(Games.SHIPS),
    SUMMER(Games.TAKE_AND_EAT_BERRIES),
    AUTUMN(Games.CHECK_A_PUDDLE);
    private Games game;

    Season(Games game) {
        this.game = game;
    }

    public Games getGameOfSeason() {
        return game;
    }
}
