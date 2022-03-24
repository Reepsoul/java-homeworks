package hw6.climbers.properties;
import java.util.Arrays;

public class Group {

	public Climber[] climbers = new Climber[10];
	private Mountain mountain;
	
	public Group(Mountain mountain) {
		this.mountain = mountain;
	}
	
	//���������� ���������� 
	public void addClimber(Climber climber) {
		for (int i = 0; i < climbers.length; i++) {
			if (climber == null) {
				climbers[i] = climber;
				System.out.println(climber.getAdress());
				System.out.println(climber.getName());
				return;
			}
			System.out.println("����� ������ ��� ���������� " + climber.getName() + "������������ �� ������ " + climber.getAdress());
		}
	}
	
	//���������� ���������� �����������
	public void addClimber(Climber...climbers) {
		System.out.println(Arrays.toString(climbers));
		for (Climber climber : climbers) {
			addClimber(climber);
		}
		if (i == (this.climbers.length - 1)) {System.out.println("������ �������");}
		if (i < (this.climbers.length - 1)) {System.out.println("����� ��� ����");}

	}
}
