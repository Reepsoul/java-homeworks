package kursach2;

public class Play extends Menu {
    private Game gameObject;

    public void StartGame(Game gameObject) {
        this.gameObject = gameObject;
    }

    public void execute() {
        Text gameList = new Text();
        Text.game(gameObject);
    }
}