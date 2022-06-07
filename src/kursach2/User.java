package kursach2;

public class User {

	Command start;
	Command exit;
	Command load;
	Command save;
	
	public User(Command start, Command exit, Command load, Command save) {
		this.start = start;
		this.exit = exit;
		this.save = save;
		this.load = load;
	}
	
	void startMenu() {
		start.execute();
	}
	
	void exitMenu() {
		exit.execute();
	}
	
	void loadMenu() {
		load.execute();
	}
	
	void saveMenu() {
		save.execute();
	}
	
	
}
