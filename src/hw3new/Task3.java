package hw3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		int number = (int) (Math.random()*(10-1))+1;
		Scanner in = new Scanner(System.in);
       
        int userNum;
		do {
        	System.out.println("Введите число или 0 для выхода из программы");
        	userNum = in.nextInt();
        	if (userNum > number) System.out.println("Загаданное число меньше");
        	if (userNum < number) System.out.println("Загаданное число больше");
        	if (userNum == number) System.out.println("Вы угадали число");
        } while (userNum != 0);
	}

}
