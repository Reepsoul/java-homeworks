package hw5;
import java.util.Arrays;
public class Task3 {

	public static void main(String[] args) {
		
		String sentence = "в предложении все слова разной длины";
		String[] sentences = sentence.split(" ");
		String symbol = "";
		String words = null;
		for (String word: sentences) {
			if(word.length() > symbol.length()) word = symbol;
			words = word;
		}

		System.out.println("Самое длинное слово " + words);
		
		
		
		
		
		
		
		
		}
		
		
		


}
