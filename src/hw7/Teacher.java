package hw7;
import hw7.base.Human;
public class Teacher extends Human{

	private String nameSubTaught;
	private int teacherSkill;
	private int maxTeacherSkill;
	public Student student;
	
	// Конструктор
	public Teacher(String name, int age, int teacherSkill, String nameSubTaught) {
		super(name, age);
		if (teacherSkill < 0) {
			throw new IllegalArgumentException("навык преподавани не может быть отрицательным");
		}
		if (nameSubTaught.length() < 3) {
			throw new IllegalArgumentException("название преподаваемого предмета долно быть больше 3 символов");
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
	//метод учить(обучаемый)
	public void toTeach(Student student) {
		if
	}
	
	public boolean isTeached() {
		return student;
	}
}
*/