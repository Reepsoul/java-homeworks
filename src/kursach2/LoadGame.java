package kursach2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoadGame implements Command{

	Menu menu;
	
	public static byte[] readToFile(File file) {
		byte[] result = null;
		try (FileInputStream fileInput = new FileInputStream(file)) {
			result = fileInput.readAllBytes();
		} catch (FileNotFoundException e) {
			System.out.println("Не удалось использовать файл");
		} catch (IOException e) { 
			System.out.println("Не удалось прочитать данные в файл");
		}
			return result;
	}
	
	
	public LoadGame(Menu menu) {
		this.menu = menu;
	}
	
	@Override
	public void execute() {
		menu.load();
	}

}
