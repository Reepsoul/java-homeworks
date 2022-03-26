package hw6.task3.properties;

public class Cat {

	private String name;
	private int speed;
	private int weight;
	private int caughtMouse;
	public Mouse[] mouses = new Mouse[100];

	
	public Cat(String name, int speed, int weight) {
		setName(name);
		setSpeed(speed);
		setWeight(weight);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	
//	public void setCaughtMouse(int caughtMouse) {
//		if (caughtMouse <= 100 && caughtMouse > 0) {
//			throw new IllegalArgumentException("Кот хранит информацию о пойманных мышах (маскимум 100)");
//		}
//		this.caughtMouse = caughtMouse;
//	}
	
	public int getCaughtMouse() {
		return caughtMouse;
	}
	
	//Метод ловли мыши
	public void catchingMouse(Mouse mouse) {
		for (int i = 0; i < mouses.length; i++) {
		if (mouse.getSpeed() < this.speed) {
			mouses[i] = mouse;
			caughtMouse += 1;
			System.out.println("Мышь поймана");
			return;
		}	
		
		}	
	}
	
	//Метод драки котов
	public void battleCats(Cat cat) {
		if (this.weight > cat.weight) {
			System.out.println("Кот победил");
			for (int i = 0; i < cat.mouses.length; i++) {
				if (cat.mouses[i] != null) {
					catchingMouse(cat.mouses[i]);
					cat.mouses[i] = null;
					System.out.println("Кот победил, мышь поймана");
				}			
			}
		} else {
			System.out.println("Кот проиграл");
		}
		
	}
	
	
}
