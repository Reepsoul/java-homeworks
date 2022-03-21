package hw7;
import hw7.base.Human;
public class Director extends Human{
	// Конструктор
	public Director(String name, int age) {
		super(name, age);
	}
	
	// Методы
	//объявить начало занятий() - вывод информации в косоль
	public void toStartLessons() {
		System.out.println("Занятия начинаются");
	}
	
	//объявить окончание занятий занятий() - вывод информации в косоль
	public void toFinishLessons() {
		System.out.println("Занятия закончились");
	}
	
	
}
