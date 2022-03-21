package hw7;
import hw7.base.Human;
public class Student extends Human {

	private String nameSubStudied;
	private int knowledgeLevel;
	// �����������
	public Student(String name, int age, int knowledgeLevel, String nameSubStudied) {
		super(name, age);
		if (knowledgeLevel < 0) {
			throw new IllegalArgumentException("������� ������ �� ����� ���� �������������");
		}
		if (nameSubStudied.length() < 3) {
			throw new IllegalArgumentException("�������� �������� ����� ���� ������ 3 ��������");
		}
		this.setKnowledgeLevel(knowledgeLevel);
		this.setNameSubStudied(nameSubStudied);
	}


		public int getKnowledgeLevel() {
			return knowledgeLevel;
		}

		public void setKnowledgeLevel(int knowledgeLevel) {
			this.knowledgeLevel = knowledgeLevel;
		}

		public String getNameSubStudied() {
			return nameSubStudied;
		}

		public void setNameSubStudied(String nameSubStudied) {
			this.nameSubStudied = nameSubStudied;
		}
		
		// �������(�����_�������) - ������� ������ ������� ���������� �� ��������� �������� � ��������� [0, �����_�������]
		public void toStudy(int teacherSkill) {
			this.knowledgeLevel = knowledgeLevel + (int)(Math.random()*teacherSkill);
		}
		

}
