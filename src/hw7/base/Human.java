package hw7.base;

abstract public class Human {
	protected String name;
	protected int age;
	// Конструктор
	public Human(String name, int age) {
		if (age < 7) {
			throw new IllegalArgumentException("Возраст должен быть больше 7 лет");
		}
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("Имя должно быть от 3 символов");
		}
		this.name = name;
		this.age = age; 
	}
	

	// Геттеры
	public String getName (String name) {
		return name;		
	}
	
	public int getAge (int age) {
		return age;		
	}
	
}
