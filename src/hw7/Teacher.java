package hw7;
import hw7.base.Human;
public class Teacher extends Human{

	private String nameSubTaught;
	private int teacherSkill;
	private int maxTeacherSkill;
	public Student student;
	
	// �����������
	public Teacher(String name, int age, int teacherSkill, String nameSubTaught) {
		super(name, age);
		if (teacherSkill < 0) {
			throw new IllegalArgumentException("����� ����������� �� ����� ���� �������������");
		}
		if (nameSubTaught.length() < 3) {
			throw new IllegalArgumentException("�������� �������������� �������� ����� ���� ������ 3 ��������");
		}
		this.teacherSkill = teacherSkill;
		this.nameSubTaught = nameSubTaught;
		this.maxTeacherSkill = teacherSkill;
	}
	
	public void plusKnowledge(int teacherSkill) {
		if (!isHaveKnowledge()) return;
		this.teacherSkill = Math.min(this.teacherSkill + teacherSkill, maxTeacherSkill);
	}
	
	public boolean isHaveKnowledge() {
		return teacherSkill > 0;
	}

	public String getNameSubTaught() {
		return nameSubTaught;
	}
	
	/*
	//����� �����(���������)
	public void toTeach(Student student) {
		if
	}
	
	public boolean isTeached() {
		return student;
	}
}
*/