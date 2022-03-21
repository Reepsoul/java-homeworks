package hw7;
import hw7.base.Human;
public class Student extends Human {

	private String nameSubStudied;
	private int knowledgeLevel;
	// Конструктор
	public Student(String name, int age, int knowledgeLevel, String nameSubStudied) {
		super(name, age);
		if (knowledgeLevel < 0) {
			throw new IllegalArgumentException("уровень знаний не может быть отрицательным");
		}
		if (nameSubStudied.length() < 3) {
			throw new IllegalArgumentException("название предмета долно быть больше 3 символов");
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
		
		// учиться(навык_учителя) - уровень знаний ученика повышается на рандомное значение в диапазоне [0, навык_учителя]
		public void toStudy(int teacherSkill) {
			this.knowledgeLevel = knowledgeLevel + (int)(Math.random()*teacherSkill);
		}
		

}
