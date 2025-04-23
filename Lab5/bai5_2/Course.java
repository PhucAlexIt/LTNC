package bai5_2;

public class Course {
	private int numberCourse;
	private String titleCourse;
	private int credit;
	public Course(int numberCourse, String titleCourse, int credit) {
		super();
		this.numberCourse = numberCourse;
		this.titleCourse = titleCourse;
		this.credit = credit;
	}
	public int getNumberCourse() {
		return numberCourse;
	}
	public void setNumberCourse(int numberCourse) {
		this.numberCourse = numberCourse;
	}
	public String getTitleCourse() {
		return titleCourse;
	}
	public void setTitleCourse(String titleCourse) {
		this.titleCourse = titleCourse;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	


}
