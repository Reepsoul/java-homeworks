package hw3;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
	
	// Пользователь загадывает число в диапазоне [2:100]
	Scanner in = new Scanner(System.in);
	System.out.println("Введите число в диапазоне от 2 до 100");
	int userNum = in.nextInt();

	int number = (int) (Math.random()*(101-2))+2; // Программа загадывает	
	
	int first = 2;
	int last = 100;
	while (number != userNum) {
		if (number > userNum) {
			int x = number / 2;
			}
		else if (number < userNum) {
			int x = 100 / 2;
			
		}
		}
		
	}
}


	
