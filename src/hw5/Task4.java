package hw5;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �����");
		String word = scanner.nextLine();
		String reverse = new StringBuffer(word).reverse().toString();
		System.out.println(reverse);
		
		//�������� �� ���������
		if (word.equals(reverse)) System.out.println("���������");
		else System.out.println("�� ���������");;
		

	}

}
