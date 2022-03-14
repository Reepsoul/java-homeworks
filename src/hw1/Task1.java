package hw1;

public class Task1 {
	public static void main(String[] args) {
		int sum = 99_000; 
		int cost = 100_000;
		int res = sum > cost ? sum - sum * 10 / 100 : sum;
		System.out.println(res);
	}
}
