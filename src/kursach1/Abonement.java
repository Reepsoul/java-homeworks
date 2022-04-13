package kursach1;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.*;
public class Abonement {
	
	// ��������
	TypeOfAbonements type;
	private Client client;
	LocalDate startOfAbonement;
	private static LocalDate endOfAbonement;
	
	// �����������
	public Abonement (TypeOfAbonements type, Client client) {
		setType(type);
		setClient(client);
		setStartOfAbonement();
		setEndOfAbonement();
		
	}

	
	// ����� ����������
	public LocalDate getStartOfAbonement() {
		return startOfAbonement;
	}

	public void setStartOfAbonement() {
		this.startOfAbonement = LocalDate.now();
	}
	
	
	// ��������� ����������
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

	
	// ��� ����������
	public TypeOfAbonements getType() {
		return type;
	}

	public void setType(TypeOfAbonements type) {
		this.type = type;
	}

	
	// ������
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
	// ������� � �������
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if ((time >= 8 && time <= 22) && (start == 8 && end2 == 22)) {
			this.type = "������� ���������";
		}
		if ((time >= 8 && time <= 16) && (start == 8 && end1 == 16)) {
			this.type = "������� ���������";
		}
		if ((time >= 8 && time <= 22)&& (start == 8 && end2 == 22))
			this.type = "������ ���������";		
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
			System.out.println("�� �������� ���������� ������� ����� �������� "
					+ "������� � ����������� ��� � 8 �� 22 �����.");	
		}
		this.oneTimeAbonement = oneTimeAbonement;	
	}
	
	public String getDayAbonement() {
		return dayAbonement;
	}
	public void setDayAbonement(String dayAbonement) {
		if (dayAbonement != null) {
			System.out.println("�� ������� ���������� ������� ����� �������� "
					+ "����������� ��� � ��������� ������� (�� �� �������) � 8 �� 16 �����.");
		}
		this.dayAbonement = dayAbonement;
		
	}
	
	public String getFullAbonement() {
		return fullAbonement;
	}
	public void setFullAbonement(String fullAbonement) {
		if (fullAbonement != null) {
			System.out.println("�� ������� ���������� ������� ����� ��������"
					+ " ����������� ���, ������� � ��������� ������� � 8 �� 22 �����.");
		}
		this.fullAbonement = fullAbonement;
	}
	
	//
	*/
}
