package kursach2;

public class Game {

	private Text text;
		
		
	public Game() {
		
	}
		
	public Text getText() {
		return text;
	}
		
	public void setText(Text text) {
		this.text = text;
	}
		
	public void start() {
		getText();
	}
		
}



//нужно создать класс игра, где будет ссылка на текущий параграф
		// в методе старт у текущего параграфа вызвать гет текст
		// если поьзователь выбирает 1, то текущий параграф ферст - у него вызывается мтод гет текст
		// если 2- секонд и у него вызывается гет текст
		// а если пользоваетль введет 3 - то выход в меню