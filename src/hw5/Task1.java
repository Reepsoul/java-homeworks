package hw5;
import java.util.Scanner;
import java.util.Arrays;
public class Task1 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите слово");
		String word;
        String[] arr = {"книга", "кино", "лампа", "свет"};
        for (int i = 0; i < arr.length; i++) {	
        	word = scanner.nextLine();
        	if (word.equalsIgnoreCase(arr[i])) break;;
        	arr[i] += i + " "; 
        }
        System.out.println(Arrays.toString(arr));
	}

}