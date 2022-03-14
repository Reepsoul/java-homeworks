package hw4;

public class Task3 {
	public static void main(String[] args) {
		
		int[] arr = new int[11];
		for (int i = 0;i < 11; i++){
			arr[i] = (int) (Math.random()*3 + (-1));
			
		}
		System.out.println(arr);
	}

}
