package hw5;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите слово");
		String word = scanner.nextLine();
		String x, y;
		for (int i = 0; i < word.length(); i++) {
			x = word.substring(0, 1).toUpperCase();
			y = word.substring(1).toLowerCase();
			word = x + y;
		}
		
		System.out.println("Преобразованное для вас слово " + word);
		
		
		
	}

}
