package hw4;
import java.util.Arrays;
public class Task4 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int plus = 0, minus = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				plus ++; 
				}
			else {
				minus ++;
				}
		int[] arr1 = new int[plus];
		System.out.println(Arrays.toString(arr1));
			
		for (int j = 0, i1 = 0; j < plus; j++, i1++) {
			if (arr[i] % 2 == 0) arr[i] = arr1[j];
			else j--;
		Arrays.sort(arr1);
		
		int[] arr2 = new int[minus];
	    for (int k = 0, i2 = 0; k < minus; k++ , i2++){
	    	if (arr[i] % 2!=0) arr2[k] = arr[i2];
	    	else k--;
	    	}
	        Arrays.sort(arr2);
	    System.out.println(Arrays.toString(arr2));
		}
		
	}
	}
}
