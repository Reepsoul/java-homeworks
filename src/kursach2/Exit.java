package kursach2;

public class Exit implements Command{

	Menu menu;
	
	public Exit(Menu menu) {
		this.menu = menu;
	}

	@Override
	public void execute() {
		menu.exit();
		
	}
	
}
