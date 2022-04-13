package kursach1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Client {
//������ ��������� ������ ���������� � ���������. ������ � ���������: ���, �������, ��� ��������.
	private String name;
	private String surname;
	private LocalDate yearOfBirth;
	
	// ���������� �������
	public Client(String name, String surname, String yearOfBirth) {
		setName(name);
		setSurname(surname);
		setYearOfBirth(yearOfBirth);
	}
	
	// ������� � ������� ��� �����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null || name.length() < 2) {
			throw new IllegalArgumentException("��� ������ ��������� ������ ���� ��������");
		}
		this.name = name;
	}
	
	// ������� � ������� ��� �������
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if (surname == null || surname.length() < 2) {
			throw new IllegalArgumentException("������� ������ ��������� ������ ���� ��������");
		}
		this.surname = surname;
	}
	
	// ������� � ������� ��� ���� ��������
	public LocalDate getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		if (yearOfBirth == null) {
			throw new IllegalArgumentException("������� ���� �������� ���������");
		}
		this.yearOfBirth = LocalDate.parse(yearOfBirth);
	}
	
}
