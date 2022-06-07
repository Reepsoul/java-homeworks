package kursach2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveGame implements Command{

	Menu menu;
	
	public static boolean writeToFile(byte[] text, File file) { // ������ ����� ��������?
		boolean result = false;
		try (FileOutputStream fileOutput = new FileOutputStream(file, true)) {
			fileOutput.write(text);
		} catch (FileNotFoundException e) {
			System.out.println("�� ������� ������������ ����");
		} catch (IOException e) { 
			System.out.println("�� ������� �������� ������ � ����");
		}
		return result;	
	}
	
	public SaveGame(Menu menu) {
		this.menu = menu;
	}

	@Override
	public void execute() {
		menu.save();
	}
	
}
