package kursach2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StartGame extends Menu {
	private Game gameObject;


    public StartGame(Game gameObject) {
        this.gameObject = gameObject;
    }

    @Override
    public void execute() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("save"))) {
            this.gameObject= (Game) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        new StartGame(gameObject).execute();
    }
}

