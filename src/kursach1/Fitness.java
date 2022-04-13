package kursach1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Fitness {

	// —войства
	private Abonement[] gym = new Abonement[20]; //
	private Abonement[] pool = new Abonement[20];
	private Abonement[] groupLessons = new Abonement[20];
	private final String closeFitness = "22:00";
	
	
	
	//  онструктор
	public Fitness() {
		
	}
	
	// ћетод покидани€ клуба клиентами, когда клуб закрываетс€
	public void closeOfFitness(String closeFitness) {
			Arrays.fill(gym, null);
			Arrays.fill(pool, null);
			Arrays.fill(groupLessons, null);
			System.out.println(" луб закрываетс€ в 22:00, клиенты покинули клуб\n" + "“ренажерный зал " + Arrays.toString(gym) + 
			"\nЅассейн " + Arrays.toString(pool) + "\n√рупповые зан€ти€ " + Arrays.toString(groupLessons));	
		
	}
	
	/* огда клиент приходит в фитнес клуб, он сообщает желаемую зону и показывает абонемент. 
	ѕоэтому перед добавлением в один из массивов, необходимо проверить можно ли по данному абонементу 
	пройти в желаемую зону, если посетитель не может пройти, необходимо сообщить ему причину.

	ѕосетитель не может пройти:

	если абонемент просрочен,
	если он пытаетс€ пройти в зону, котора€ не разрешена по его абонементу,
	если в зоне нет свободных мест.
	*/
	// add(ab,"gym")
	public void add(Abonement abonement, String zone) { // "gym" "pool" "group"
		if (abonement.getType() == TypeOfAbonements.ONE_TIME && abonement.startOfAbonement.plusDays(1).isAfter(LocalDate.now())) {
			System.out.println("јбонемент просрочен");	
			return;
		} else if (abonement.getType() == TypeOfAbonements.DAY_TIME && abonement.startOfAbonement.plusDays(1).isAfter(LocalDate.now())) {
			System.out.println("јбонемент просрочен");
			return;
		} else if (abonement.getType() == TypeOfAbonements.FULL_TIME && abonement.startOfAbonement.plusDays(31).isAfter(LocalDate.now())) {
			System.out.println("јбонемент просрочен");
			return;
		}// return;
		
		
		if (TypeOfAbonements.ONE_TIME.getStart().isAfter(LocalTime.now()) && TypeOfAbonements.ONE_TIME.getEnd().isBefore(LocalTime.now())) {
			System.out.println("¬ы можете посещать зал с 8:00 утра до 22:00 вечера");
		}
		else if (TypeOfAbonements.DAY_TIME.getStart().isAfter(LocalTime.now()) && TypeOfAbonements.DAY_TIME.getEnd().isBefore(LocalTime.now())) {
			System.out.println("¬ы можете посещать зал с 8:00 утра до 16:00 вечера");
		}	
		else if (TypeOfAbonements.FULL_TIME.getStart().isAfter(LocalTime.now()) && TypeOfAbonements.FULL_TIME.getEnd().isBefore(LocalTime.now())) {
			System.out.println("¬ы можете посещать зал с 8:00 утра до 22:00 вечера");
		}
		
		
		if(zone.equalsIgnoreCase("gym")||zone.equalsIgnoreCase("тренажерный зал")) {
			for (int i = 0; i < gym.length; i++) {
				if(gym[i] == null) {
					gym[i] = abonement;
					System.out.println(abonement.getClient() + "можете проходить в тренажерный зал");
				}
			}
		} else {
			System.out.println("Ќет свободных мест");
			return;
		}
		if(zone.equalsIgnoreCase("pool")||zone.equalsIgnoreCase("бассейн")) {
			for (int i = 0; i < pool.length; i++) {
				if(pool[i] == null) {
					pool[i] = abonement;
					System.out.println(abonement.getClient() + "можете проходить в бассейн");
				}
			}
		} else {
			System.out.println("Ќет свободных мест");
			return;
		}
		
		if(zone.equalsIgnoreCase("groupLessons")||zone.equalsIgnoreCase("групповые занти€")) {
			for (int i = 0; i < groupLessons.length; i++) {
				if(groupLessons[i] == null) {
					groupLessons[i] = abonement;
					System.out.println(abonement.getClient() + "можете проходить в групповые зан€ти€");
				}
			}
		} else {
			System.out.println("Ќет свободных мест"); return;
		}
		
		
		
	}
	
	
	
	
	
	
	
}
