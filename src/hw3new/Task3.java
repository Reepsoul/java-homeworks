package hw3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		int number = (int) (Math.random()*(10-1))+1;
		Scanner in = new Scanner(System.in);
       
        int userNum;
		do {
        	System.out.println("������� ����� ��� 0 ��� ������ �� ���������");
        	userNum = in.nextInt();
        	if (userNum > number) System.out.println("���������� ����� ������");
        	if (userNum < number) System.out.println("���������� ����� ������");
        	if (userNum == number) System.out.println("�� ������� �����");
        } while (userNum != 0);
	}

}
