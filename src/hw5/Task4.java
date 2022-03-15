package hw5;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите слово");
		String word = scanner.nextLine();
		String reverse = new StringBuffer(word).reverse().toString();
		System.out.println(reverse);
		
		//Проверка на полиндром
		if (word.equals(reverse)) System.out.println("Полиндром");
		else System.out.println("Не полиндром");;
		

	}

}
