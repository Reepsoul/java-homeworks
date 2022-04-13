package kursach1;

public class Application {

	public static void main(String[] args) {
		
		Client client1 = new Client("Андрей", "Павлов","04.11.1999");
		Client client2 = new Client("Егор", "Герасимов","05.02.1999");
		Client client3 = new Client("Вячеслав", "Шестопалов", "26.11.1998");
		Client client4 = new Client("Ильнур", "Миннигалиев", "02.07.1999");
		
		Abonement abonement1 = new Abonement(TypeOfAbonements.ONE_TIME, client1);
		Abonement abonement2 = new Abonement(TypeOfAbonements.FULL_TIME, client2);
		Abonement abonement3 = new Abonement(TypeOfAbonements.DAY_TIME, client3);
		Abonement abonement4 = new Abonement(TypeOfAbonements.ONE_TIME, client4);
		
		Fitness fitness = new Fitness();
		
		fitness.add(abonement1, "групповые занятия");
		fitness.add(abonement2, "тренажерный зал");
		fitness.add(abonement3, "бассейн");
		fitness.add(abonement4, "тренажерный зал");
	}
	
}
