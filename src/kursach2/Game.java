package kursach2;

	import java.io.Serializable;

	public class Game implements Serializable{
		
		private String text;
		private int first;
		private int second;
		
		public Game(int first, int second, String text) {
			setText(text);
			setFirst(first);
			setSecond(second);
		}
		
		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public int getFirst() {
			return first;
		}

		public void setFirst(int first) {
			this.first = first;
		}

		public int getSecond() {
			return second;
		}

		public void setSecond(int second) {
			this.second = second;
		}

		@Override
		public String toString() {
			return "Text [text=" + text + ", first=" + first + ", second=" + second + "]";
		}

		
	} 