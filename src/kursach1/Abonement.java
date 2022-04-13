package kursach1;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.*;
public class Abonement {
	
	// Свойства
	TypeOfAbonements type;
	private Client client;
	LocalDate startOfAbonement;
	private static LocalDate endOfAbonement;
	
	// Конструктор
	public Abonement (TypeOfAbonements type, Client client) {
		setType(type);
		setClient(client);
		setStartOfAbonement();
		setEndOfAbonement();
		
	}

	
	// Старт абонемента
	public LocalDate getStartOfAbonement() {
		return startOfAbonement;
	}

	public void setStartOfAbonement() {
		this.startOfAbonement = LocalDate.now();
	}
	
	
	// Окончание абонемента
	public static LocalDate getEndOfAbonement() {
		return endOfAbonement;
	}

	public void setEndOfAbonement() {
		//this.endOfAbonement = LocalDate.parse(endOfAbonement);
		if (type == TypeOfAbonements.ONE_TIME) {
			this.endOfAbonement = this.startOfAbonement.plusDays(1);
		} else if (type == TypeOfAbonements.DAY_TIME) {
			this.endOfAbonement = this.startOfAbonement.plusDays(1);
		} else if (type == TypeOfAbonements.FULL_TIME) {
			this.endOfAbonement = this.startOfAbonement.plusDays(31);
		}
	}

	
	// Тип абонемента
	public TypeOfAbonements getType() {
		return type;
	}

	public void setType(TypeOfAbonements type) {
		this.type = type;
	}

	
	// Клиент
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	private String type;
	private int time;
	private int start = 8;
	private int end1 = 16;
	private int end2 = 22;
	private Client client;
	private int localDate;
	private LocalDate startAbonement;
	private LocalDate endAbonement;
	
	public Abonement(String type, int time) {
		setType(type);
		setTime(time);
	}
	// Геттеры и сеттеры
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if ((time >= 8 && time <= 22) && (start == 8 && end2 == 22)) {
			this.type = "Разовый абонемент";
		}
		if ((time >= 8 && time <= 16) && (start == 8 && end1 == 16)) {
			this.type = "Дневной абонемент";
		}
		if ((time >= 8 && time <= 22)&& (start == 8 && end2 == 22))
			this.type = "Полный абонемент";		
	}
	
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time; 
	}
	
	/*public void nowLocalDate(int localDate) {
		localDate = LocalDate();
	}
	
	public LocalDate getStartAbonement() {
		return startAbonement;
	}

	public void setStartAbonement(LocalDate startAbonement) {
		this.startAbonement = startAbonement;
	}

	public LocalDate getEndAbonement() {
		return endAbonement;
	}

	public void setEndAbonement(LocalDate endAbonement) {
		this.endAbonement = endAbonement;
	}
	
	
}
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public String getOneTimeAbonement() {
		return oneTimeAbonement;
	}
	public void setOneTimeAbonement(String oneTimeAbonement) {
		if (oneTimeAbonement != null) {
			System.out.println("По разовому абонементу клиенты могут посещать "
					+ "бассейн и тренажерный зал с 8 до 22 часов.");	
		}
		this.oneTimeAbonement = oneTimeAbonement;	
	}
	
	public String getDayAbonement() {
		return dayAbonement;
	}
	public void setDayAbonement(String dayAbonement) {
		if (dayAbonement != null) {
			System.out.println("По данному абонементу клиенты могут посещать "
					+ "тренажерный зал и групповые занятия (но не бассейн) с 8 до 16 часов.");
		}
		this.dayAbonement = dayAbonement;
		
	}
	
	public String getFullAbonement() {
		return fullAbonement;
	}
	public void setFullAbonement(String fullAbonement) {
		if (fullAbonement != null) {
			System.out.println("По данному абонементу клиенты могут посещать"
					+ " тренажерный зал, бассейн и групповые занятия с 8 до 22 часов.");
		}
		this.fullAbonement = fullAbonement;
	}
	
	//
	*/
}
