package kursach4;

import java.util.Arrays;

import hw6.climbers.properties.Climber;
import hw6.climbers.properties.Mountain;

public class Group {

	public Climber[] climbers = new Climber[10];
	private Mountain mountain;
	
	public Group(Mountain mountain) {
		this.mountain = mountain;
	}
	
	//���������� ���������� 
	public void addClimber(Climber climber) {
		for (int i = 0; i < climbers.length; i++) {
			if (i == (this.climbers.length - 1)) {System.out.println("������ �������"); return;}
			if (i < (this.climbers.length - 1)) {System.out.println("����� ��� ����");}
			if (climber == null) {
				climbers[i] = climber;
				System.out.println(climber.getAdress());
				System.out.println(climber.getName());
				return;
			}
		}
		System.out.println("����� ������ ��� ���������� " + climber.getName() + "������������ �� ������ " + climber.getAdress());

	}
	
	//���������� ���������� �����������
	public void addClimbers(Climber...climbers) {
		System.out.println(Arrays.toString(climbers));
		for (Climber climber : climbers) {
			addClimber(climber);
		}
		

	}
}
