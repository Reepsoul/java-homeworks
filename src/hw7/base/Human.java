package hw7.base;

abstract public class Human {
	protected String name;
	protected int age;
	// �����������
	public Human(String name, int age) {
		if (age < 7) {
			throw new IllegalArgumentException("������� ������ ���� ������ 7 ���");
		}
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("��� ������ ���� �� 3 ��������");
		}
		this.name = name;
		this.age = age; 
	}
	

	// �������
	public String getName (String name) {
		return name;		
	}
	
	public int getAge (int age) {
		return age;		
	}
	
}
