package kursach;

import java.time.LocalTime;


public enum TypeOfAbonements {

	ONE_TIME("8:00", "22:00", true, true, false), DAY_TIME("8:00", "16:00", true, false, true), FULL_TIME("8:00", "22:00", true, true, true);
	
	// ��������
	private LocalTime start;
	private LocalTime end;
	private boolean gym;
	private boolean pool;
	private boolean groupLessons;
	
	//����������
	TypeOfAbonements(String start, String end, boolean gym, boolean pool, boolean groupLessons) {
		setStart(start);
		setEnd(end);
		this.gym = gym;
		this.pool = pool;
		this.groupLessons = groupLessons;
	}
	// ����� �������
	public LocalTime getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = LocalTime.parse(start);
	}
	
	// ����� �������
	public LocalTime getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = LocalTime.parse(end);
	}
	
	// ����������� ���
	public boolean isGym() {
		return gym;
	}
	public void setGym(boolean gym) {
		this.gym = gym;
	}
	
	// �������
	public boolean isPool() {
		return pool;
	}
	public void setPool(boolean pool) {
		this.pool = pool;
	}
	
	// ��������� �������
	public boolean isGroupLessons() {
		return groupLessons;
	}
	public void setGroupLessons(boolean groupLessons) {
		this.groupLessons = groupLessons;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
