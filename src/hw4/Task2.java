package hw4;
import java.util.Arrays;
public class Task2 {

	public static void main(String[] args) {
		// отсортировать от 20 до 2
		int[] ints1 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		for (int i = 0; i < ints1.length; i++) {
			ints1[i] *= -1;
			Arrays.sort(ints1);
		}
		for (int i = 0; i < ints1.length; i++) {
			ints1[i] *= -1;
		}
			System.out.println(Arrays.toString(ints1));
	}

}
