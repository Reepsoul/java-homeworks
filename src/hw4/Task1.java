package hw4;

public class Task1 {

	public static void main(String[] args) {
		int[] ints1 = {12, 5, 34, 65, 88, 23};
		int minValue = ints1[0];
		int medValue = 0;
		int maxValue = ints1[0];
		
		//минимальное значение
		for (int element: ints1) {
			if (minValue > element) minValue = element;
		}
		System.out.println(minValue);
		
		// среднее значение
		for (int i = 0; i < ints1.length; i++) {
			medValue = medValue + ints1[i];
			}
		double medValuee = medValue/6;
		System.out.println(medValuee);
		
		//максимальное значение
		for (int element: ints1) {
			if (maxValue < element) maxValue = element;
		}
		System.out.println(maxValue);
	}		
}
