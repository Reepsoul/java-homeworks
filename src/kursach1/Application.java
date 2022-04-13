package kursach1;

public class Application {

	public static void main(String[] args) {
		
		Client client1 = new Client("������", "������","04.11.1999");
		Client client2 = new Client("����", "���������","05.02.1999");
		Client client3 = new Client("��������", "����������", "26.11.1998");
		Client client4 = new Client("������", "�����������", "02.07.1999");
		
		Abonement abonement1 = new Abonement(TypeOfAbonements.ONE_TIME, client1);
		Abonement abonement2 = new Abonement(TypeOfAbonements.FULL_TIME, client2);
		Abonement abonement3 = new Abonement(TypeOfAbonements.DAY_TIME, client3);
		Abonement abonement4 = new Abonement(TypeOfAbonements.ONE_TIME, client4);
		
		Fitness fitness = new Fitness();
		
		fitness.add(abonement1, "��������� �������");
		fitness.add(abonement2, "����������� ���");
		fitness.add(abonement3, "�������");
		fitness.add(abonement4, "����������� ���");
	}
	
}
