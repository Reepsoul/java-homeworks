package hw7;
import hw7.base.Human;
public class Director extends Human{
	// �����������
	public Director(String name, int age) {
		super(name, age);
	}
	
	// ������
	//�������� ������ �������() - ����� ���������� � ������
	public void toStartLessons() {
		System.out.println("������� ����������");
	}
	
	//�������� ��������� ������� �������() - ����� ���������� � ������
	public void toFinishLessons() {
		System.out.println("������� �����������");
	}
	
	
}
