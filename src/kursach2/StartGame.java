package kursach2;

import java.util.Scanner;

public class StartGame implements Command{

	Menu menu;
	private Text text; 
	
	public StartGame(Menu menu) {
		this.menu = menu;
	}
	
	@Override
	public void execute() {
		menu.start();
	}
	
	
	
/*
	public void startGame() {
		System.out.println("Выберите пункт"
				+ "\n1. Начать игру" 
				+ "\n2. Загрузить игру" 
				+ "\n3. Выход");
		Scanner scanner = new Scanner(System.in);
		int userNum = scanner.nextInt();
		if (userNum == 1) {
			Game game = new Game();
			Text text = new Text();
			game.setText();
		}
		
	*/	
}
	

