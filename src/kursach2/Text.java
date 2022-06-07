package kursach2;

import java.util.Scanner;

public class Text {
	
	private String text;
	private Text first;
	private Text second;
	
	public Text(String text) {
		setText(text);
	}
	
	//public Text(Text first, Text second) {
	//	setFirst(first);
	//	setSecond(second);
	//}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Text getFirst() {
		return first;
	}

	public void setFirst(Text first) {
		this.first = first;
	}

	public Text getSecond() {
		return second;
	}

	public void setSecond(Text second) {
		this.second = second;
	}


	/* текст 
	private final String lisenok = "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. "
			+ "\nЭто утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. "
			+ "\nЛисёнок ждал, ждал, но так и не смог дождаться своего друга."
			+ "\n\"Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду.\""
			+ " - подумал Лисёнок. Как поступить Лисенку?"; 
	private final String backHome = "Вернувшись домой, Лисёнок нашёл там Бельчонка. "
			+ "\nОказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. "
			+ "\nОн поспешил предупредить об этом Лисёнка, но они разминулись. "
			+ "\nНаконец-то друзья нашли друг друга! Игра завершилась успехом";
	private final String goInSearch = "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. "
			+ "\nНо вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему."; 
	private final String findAboutBelchonka = "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. "
			+ "\nОстались только Сова и Волк. "
			+ "\nНо у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?";
	private final String lookForBelchonka = "Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. "
			+ "\nТеперь его самого нужно искать. Игра завершилась неудачей";
	private final String askOwl = "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса. "
			+ "\nВсе лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.";
	private final String askWolf = "Волк оказался вполне дружелюбным, но помочь не смог. "
			+ "\nЛишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?";
	private final String  believeOwlGoForest = "В глубине леса Лисёнок встретил Медвежонка. "
			+ "\nЛенивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.";
	private final String getSomeHoney = "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. "
			+ "\nЛисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.";
	private final String wait = "Лисёнок подождал немного, и пчёлы разлетелись. "
			+ "\nЛисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?";
	private final String honeyImmediately = "Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. "
			+ "\nИгра завершилась неудачей";
	private final String eatAndRest = "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. "
			+ "\nЛисёнку нужна помощь, он не сможет продолжить поиски. Игра завершилась неудачей";
	private final String honeyToBear = "Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. "
			+ "\nОн заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.";
	private final String menu = "Выход в меню";
	
	
	// Геттеры
	/*public String getLisenok() {
		System.out.println(lisenok);
	}
	public String getBackHome() {
		return backHome;
	}
	public String getGoInSearch() {
		return goInSearch;
	}
	public String getFindAboutBelchonka() {
		return findAboutBelchonka;
	}
	public String getLookForBelchonka() {
		return lookForBelchonka;
	}
	public String getAskOwl() {
		return askOwl;
	}
	public String getAskWolf() {
		return askWolf;
	}
	public String getBelieveOwlGoForest() {
		return believeOwlGoForest;
	}
	public String getGetSomeHoney() {
		return getSomeHoney;
	}
	public String getWait() {
		return wait;
	}
	public String getHoneyImmediately() {
		return honeyImmediately;
	}
	public String getEatAndRest() {
		return eatAndRest;
	}
	public String getHoneyToBear() {
		return honeyToBear;
	}
	public String getMenu() {
		return menu;
	}
	
	Scanner scanner = new Scanner(System.in);
	int userNum = scanner.nextInt();
	
	// Методы
	public String StartGame() {
		System.out.println(lisenok);
		System.out.println("\n1. Вернуться домой");
		System.out.println("2. Отправиться на поиски");
		System.out.println("3. Выход в меню");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nВыберите вариант ответа");
		int userNum = scanner.nextInt();
		if(userNum == 1) return backHome;
		else if (userNum == 2) return goInSearch;
		else return menu;	
	}
	
	public String IterTwo() {
		System.out.println(goInSearch);
		System.out.println("\n1. Расспросить сову");
		System.out.println("2. Расспросить волка");
		System.out.println("3. Выход в меню");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nВыберите вариант ответа");
		int userNum = scanner.nextInt();
		if(userNum == 1) return askOwl;
		else if (userNum == 2) return askWolf;
		else return menu;	
	}
	
	
	public String IterThree() {
		System.out.println(askOwl);
		System.out.println("\n1. Поверить Сове и отправиться вглубь леса");
		System.out.println("2. Сове не стоит верить -> Искать Бельчонка в одиночку");
		System.out.println("3. Выход в меню");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nВыберите вариант ответа");
		int userNum = scanner.nextInt();
		if(userNum == 1) return believeOwlGoForest;
		else if (userNum == 2) return lookForBelchonka;
		else return menu;	
	}
	
	public String IterFour() {
		System.out.println(askWolf);
		System.out.println("\n1. Волк прав -> Вернуться домой");
		System.out.println("2. -> Искать Бельчонка в одиночку");
		System.out.println("3. Выход в меню");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nВыберите вариант ответа");
		int userNum = scanner.nextInt();
		if(userNum == 1) return backHome;
		else if (userNum == 2) return lookForBelchonka;
		else return menu;	
	}
	
	public String IterFive() {
		System.out.println(believeOwlGoForest);
		System.out.println("\n1. Нет, потрачено слишком много времени, нужно идти дальше "
				+ "-> Искать Бельчонка в одиночку");
		System.out.println("2. Нужно воспользоваться шансом и раздобыть мёд");
		System.out.println("3. Выход в меню");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nВыберите вариант ответа");
		int userNum = scanner.nextInt();
		if(userNum == 1) return lookForBelchonka;
		else if (userNum == 2) return getSomeHoney;
		else return menu;	
	}
	
	public String IterSix() {
		System.out.println(getSomeHoney);
		System.out.println("\n1. Подождать, вдруг пчёлы улетят");
		System.out.println("2. Нужно попытаться выкрасть мёд немедленно");
		System.out.println("3. Выход в меню");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nВыберите вариант ответа");
		int userNum = scanner.nextInt();
		if(userNum == 1) return wait;
		else if (userNum == 2) return honeyImmediately;
		else return menu;	
	}
	
	public String IterSeven() {
		System.out.println(wait);
		System.out.println("\n1. Поесть немного и передохнуть");
		System.out.println("2. Скорее отнести мёд Медвежонку");
		System.out.println("3. Выход в меню");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nВыберите вариант ответа");
		int userNum = scanner.nextInt();
		if(userNum == 1) return eatAndRest;
		else if (userNum == 2) return honeyToBear;
		else return menu;	
	}
	
	public String IterEight() {
		System.out.println(honeyToBear);
		System.out.println("\n1. Медвежонок ничего не знает, нужно продолжить поиски -> Искать Бельчонка в одиночку");
		System.out.println("2. Может быть он прав и Лисёнок просто паникует -> Вернуться домой");
		System.out.println("3. Выход в меню");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nВыберите вариант ответа");
		int userNum = scanner.nextInt();
		if(userNum == 1) return lookForBelchonka;
		else if (userNum == 2) return backHome;
		else return menu;	
	}

	
	*/
}
