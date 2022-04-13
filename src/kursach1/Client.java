package kursach1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Client {
//Каждый абонемент хранит информацию о владельце. Данные о владельце: имя, фамилия, год рождения.
	private String name;
	private String surname;
	private LocalDate yearOfBirth;
	
	// конструтор Клиента
	public Client(String name, String surname, String yearOfBirth) {
		setName(name);
		setSurname(surname);
		setYearOfBirth(yearOfBirth);
	}
	
	// Геттеры и сеттеры для имени
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null || name.length() < 2) {
			throw new IllegalArgumentException("Имя должно содержать больше двух символов");
		}
		this.name = name;
	}
	
	// Геттеры и сеттеры для фамилии
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if (surname == null || surname.length() < 2) {
			throw new IllegalArgumentException("Фамилия должна содержать больше двух символов");
		}
		this.surname = surname;
	}
	
	// Геттеры и сеттеры для даты рождения
	public LocalDate getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		if (yearOfBirth == null) {
			throw new IllegalArgumentException("Введите дату рождения корректно");
		}
		this.yearOfBirth = LocalDate.parse(yearOfBirth);
	}
	
}
