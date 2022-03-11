package hw3;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.println("¬ведите целое положительное число");
        int userNum = in.nextInt();
        int a, b, c;
		while (userNum > 0) {
			a = userNum / 10;
			b = userNum % 10;
			c = a + b;
			System.out.println("—умма цифр введенного числа " + c);
			break;
	}
	}

}
