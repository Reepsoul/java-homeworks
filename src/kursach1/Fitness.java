package kursach1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Fitness {

	// ��������
	private Abonement[] gym = new Abonement[20]; //
	private Abonement[] pool = new Abonement[20];
	private Abonement[] groupLessons = new Abonement[20];
	private final String closeFitness = "22:00";
	
	
	
	// �����������
	public Fitness() {
		
	}
	
	// ����� ��������� ����� ���������, ����� ���� �����������
	public void closeOfFitness(String closeFitness) {
			Arrays.fill(gym, null);
			Arrays.fill(pool, null);
			Arrays.fill(groupLessons, null);
			System.out.println("���� ����������� � 22:00, ������� �������� ����\n" + "����������� ��� " + Arrays.toString(gym) + 
			"\n������� " + Arrays.toString(pool) + "\n��������� ������� " + Arrays.toString(groupLessons));	
		
	}
	
	/*����� ������ �������� � ������ ����, �� �������� �������� ���� � ���������� ���������. 
	������� ����� ����������� � ���� �� ��������, ���������� ��������� ����� �� �� ������� ���������� 
	������ � �������� ����, ���� ���������� �� ����� ������, ���������� �������� ��� �������.

	���������� �� ����� ������:

	���� ��������� ���������,
	���� �� �������� ������ � ����, ������� �� ��������� �� ��� ����������,
	���� � ���� ��� ��������� ����.
	*/
	// add(ab,"gym")
	public void add(Abonement abonement, String zone) { // "gym" "pool" "group"
		if (abonement.getType() == TypeOfAbonements.ONE_TIME && abonement.startOfAbonement.plusDays(1).isAfter(LocalDate.now())) {
			System.out.println("��������� ���������");	
			return;
		} else if (abonement.getType() == TypeOfAbonements.DAY_TIME && abonement.startOfAbonement.plusDays(1).isAfter(LocalDate.now())) {
			System.out.println("��������� ���������");
			return;
		} else if (abonement.getType() == TypeOfAbonements.FULL_TIME && abonement.startOfAbonement.plusDays(31).isAfter(LocalDate.now())) {
			System.out.println("��������� ���������");
			return;
		}// return;
		
		
		if (TypeOfAbonements.ONE_TIME.getStart().isAfter(LocalTime.now()) && TypeOfAbonements.ONE_TIME.getEnd().isBefore(LocalTime.now())) {
			System.out.println("�� ������ �������� ��� � 8:00 ���� �� 22:00 ������");
		}
		else if (TypeOfAbonements.DAY_TIME.getStart().isAfter(LocalTime.now()) && TypeOfAbonements.DAY_TIME.getEnd().isBefore(LocalTime.now())) {
			System.out.println("�� ������ �������� ��� � 8:00 ���� �� 16:00 ������");
		}	
		else if (TypeOfAbonements.FULL_TIME.getStart().isAfter(LocalTime.now()) && TypeOfAbonements.FULL_TIME.getEnd().isBefore(LocalTime.now())) {
			System.out.println("�� ������ �������� ��� � 8:00 ���� �� 22:00 ������");
		}
		
		
		if(zone.equalsIgnoreCase("gym")||zone.equalsIgnoreCase("����������� ���")) {
			for (int i = 0; i < gym.length; i++) {
				if(gym[i] == null) {
					gym[i] = abonement;
					System.out.println(abonement.getClient() + "������ ��������� � ����������� ���");
				}
			}
		} else {
			System.out.println("��� ��������� ����");
			return;
		}
		if(zone.equalsIgnoreCase("pool")||zone.equalsIgnoreCase("�������")) {
			for (int i = 0; i < pool.length; i++) {
				if(pool[i] == null) {
					pool[i] = abonement;
					System.out.println(abonement.getClient() + "������ ��������� � �������");
				}
			}
		} else {
			System.out.println("��� ��������� ����");
			return;
		}
		
		if(zone.equalsIgnoreCase("groupLessons")||zone.equalsIgnoreCase("��������� ������")) {
			for (int i = 0; i < groupLessons.length; i++) {
				if(groupLessons[i] == null) {
					groupLessons[i] = abonement;
					System.out.println(abonement.getClient() + "������ ��������� � ��������� �������");
				}
			}
		} else {
			System.out.println("��� ��������� ����"); return;
		}
		
		
		
	}
	
	
	
	
	
	
	
}
