package hw7;

public class School {
 
	private String nameSchool = "Лицей";
	public Director director;
	public Teacher[] teachers = new Teacher[2];
	public Student[] students = new Student[30];
	
	public void addTeacher(Teacher teacher) {
		for (int i = 0; i < teacher.length; i++) {
			if (teachers[i] == null) teachers[i] = teacher;
			return;
		}
		System.out.println("Учителей достаточно");
		
		
	public void addStudent(Student student) {
		for (int i = 0; i < student.length; i++) {
			if (students[i] == null) students[i] = student;
			return;
		}
		System.out.println("Учениов достаточно");
	}
	
	
	
	//ПРОПИСАТЬ МЕТОД
	/*
	public void daySchool() {
		toStartLessons();
		
		toFinishlessons();
	}
	
	*/
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	public String getNameSchool() {
		return nameSchool;
	}

	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
}
