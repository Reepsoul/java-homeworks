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


	/* ����� 
	private final String lisenok = "������ ���� ������ ����������, ��������� � ��� ��������� � ����������. "
			+ "\n��� ���� �� ���� �����������. ������ ������ �� �� ������� ����� �������, �� ��������� ��� �� ����. "
			+ "\n������ ����, ����, �� ��� � �� ���� ��������� ������ �����."
			+ "\n\"��������� �� ��������� ��� �� ����� �������, ����� �� ����� � ����.\""
			+ " - ������� ������. ��� ��������� �������?"; 
	private final String backHome = "���������� �����, ������ ����� ��� ���������. "
			+ "\n���������, ��� ��������� ������ �� ����� ������� ������ � ������ ��� ��� ������� ����. "
			+ "\n�� �������� ������������ �� ���� ������, �� ��� �����������. "
			+ "\n�������-�� ������ ����� ���� �����! ���� ����������� �������";
	private final String goInSearch = "��� ������ ������ ���� ������ ������ ������ � �� �������� �������� �� ������ � ��� ��������. "
			+ "\n�� ����� ��� ������ ����� ���������... ������ �� ����, ��� ��� ������. �������� ���."; 
	private final String findAboutBelchonka = "���� ������ �������� �������, ������ ������ ��������� ��� ����. "
			+ "\n�������� ������ ���� � ����. "
			+ "\n�� � ���� ������ �������� � �������, � ���� ����� ������ ����������� ��-�� ����������. ���� �������?";
	private final String lookForBelchonka = "������ ������� ����� ������ �� ���� � ������� ����� � ��� �� �������, ��� ����������. "
			+ "\n������ ��� ������ ����� ������. ���� ����������� ��������";
	private final String askOwl = "���� ����� �� ������ ��������, �� � ����� �������, ��� ������ ����������� ���������, ��������� ������ ����. "
			+ "\n��� ������ ������ �����, ��� � ������� ���� ������, ���� ��������� ���, ��� ������ ����� ������.";
	private final String askWolf = "���� �������� ������ �����������, �� ������ �� ����. "
			+ "\n���� ������, ��� ���������� ������� �� ����� ������� �� ���� ������. � ��� ������ ���������?";
	private final String  believeOwlGoForest = "� ������� ���� ������ �������� ����������. "
			+ "\n������� ���������� ��� ����� ���������� ���, ��� �����, ���� ������ ������� ��� ���.";
	private final String getSomeHoney = "������ ������ ����� ��, �� ������ ����� ��� ������� ����. "
			+ "\n������ ������ ������ ����, �� � �� ����� ����� �� ���� ������.";
	private final String wait = "������ �������� �������, � ����� �����������. "
			+ "\n������ ��� ������� ������ ���. ����� �� �����, ��� ����� �������. ��� �� ������?";
	private final String honeyImmediately = "��� ���� �� ������ ����. ����� �������� ������, ������ ��� ������ ����� ������. "
			+ "\n���� ����������� ��������";
	private final String eatAndRest = "���� ������ ��, ������� ����� ��������� � �������� ���. "
			+ "\n������ ����� ������, �� �� ������ ���������� ������. ���� ����������� ��������";
	private final String honeyToBear = "��������� ���������� ��������� ������, ��� ����� ������ ����� ����� ����� � ������, ��� ��������� ������� �� ����� �� � ����� ����. "
			+ "\n�� ������� ������, ��� ����� �� �������� � ������������, � ��� ����� ������ ������, �� ����� ���������� ������ ��������� �����.";
	private final String menu = "����� � ����";
	
	
	// �������
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
	
	// ������
	public String StartGame() {
		System.out.println(lisenok);
		System.out.println("\n1. ��������� �����");
		System.out.println("2. ����������� �� ������");
		System.out.println("3. ����� � ����");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n�������� ������� ������");
		int userNum = scanner.nextInt();
		if(userNum == 1) return backHome;
		else if (userNum == 2) return goInSearch;
		else return menu;	
	}
	
	public String IterTwo() {
		System.out.println(goInSearch);
		System.out.println("\n1. ����������� ����");
		System.out.println("2. ����������� �����");
		System.out.println("3. ����� � ����");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n�������� ������� ������");
		int userNum = scanner.nextInt();
		if(userNum == 1) return askOwl;
		else if (userNum == 2) return askWolf;
		else return menu;	
	}
	
	
	public String IterThree() {
		System.out.println(askOwl);
		System.out.println("\n1. �������� ���� � ����������� ������ ����");
		System.out.println("2. ���� �� ����� ������ -> ������ ��������� � ��������");
		System.out.println("3. ����� � ����");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n�������� ������� ������");
		int userNum = scanner.nextInt();
		if(userNum == 1) return believeOwlGoForest;
		else if (userNum == 2) return lookForBelchonka;
		else return menu;	
	}
	
	public String IterFour() {
		System.out.println(askWolf);
		System.out.println("\n1. ���� ���� -> ��������� �����");
		System.out.println("2. -> ������ ��������� � ��������");
		System.out.println("3. ����� � ����");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n�������� ������� ������");
		int userNum = scanner.nextInt();
		if(userNum == 1) return backHome;
		else if (userNum == 2) return lookForBelchonka;
		else return menu;	
	}
	
	public String IterFive() {
		System.out.println(believeOwlGoForest);
		System.out.println("\n1. ���, ��������� ������� ����� �������, ����� ���� ������ "
				+ "-> ������ ��������� � ��������");
		System.out.println("2. ����� ��������������� ������ � ��������� ��");
		System.out.println("3. ����� � ����");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n�������� ������� ������");
		int userNum = scanner.nextInt();
		if(userNum == 1) return lookForBelchonka;
		else if (userNum == 2) return getSomeHoney;
		else return menu;	
	}
	
	public String IterSix() {
		System.out.println(getSomeHoney);
		System.out.println("\n1. ���������, ����� ����� ������");
		System.out.println("2. ����� ���������� �������� �� ����������");
		System.out.println("3. ����� � ����");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n�������� ������� ������");
		int userNum = scanner.nextInt();
		if(userNum == 1) return wait;
		else if (userNum == 2) return honeyImmediately;
		else return menu;	
	}
	
	public String IterSeven() {
		System.out.println(wait);
		System.out.println("\n1. ������ ������� � �����������");
		System.out.println("2. ������ ������� �� ����������");
		System.out.println("3. ����� � ����");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n�������� ������� ������");
		int userNum = scanner.nextInt();
		if(userNum == 1) return eatAndRest;
		else if (userNum == 2) return honeyToBear;
		else return menu;	
	}
	
	public String IterEight() {
		System.out.println(honeyToBear);
		System.out.println("\n1. ���������� ������ �� �����, ����� ���������� ������ -> ������ ��������� � ��������");
		System.out.println("2. ����� ���� �� ���� � ������ ������ �������� -> ��������� �����");
		System.out.println("3. ����� � ����");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n�������� ������� ������");
		int userNum = scanner.nextInt();
		if(userNum == 1) return lookForBelchonka;
		else if (userNum == 2) return backHome;
		else return menu;	
	}

	
	*/
}
