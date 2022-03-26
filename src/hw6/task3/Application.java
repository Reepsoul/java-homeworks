package hw6.task3;

import hw6.task3.properties.Cat;
import hw6.task3.properties.Mouse;

public class Application {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat ("Вася", 50, 7);
		Cat cat2 = new Cat ("Бася", 45, 6);
		
		Mouse mouse1 = new Mouse(66);
		Mouse mouse2 = new Mouse(46);
		Mouse mouse3 = new Mouse(34);
		Mouse mouse4 = new Mouse(22);
		Mouse mouse5 = new Mouse(51);
		
		
		cat1.catchingMouse(mouse3);
		
		cat1.battleCats(cat2);
		
		System.out.println(cat1);
		
	}

}
