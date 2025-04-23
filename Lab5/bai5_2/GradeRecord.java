package bai5_2;

public class GradeRecord {
	private Course course;
	private double grade;
	
	
	
	public GradeRecord(Course course, double grade) {
		super();
		this.course = course;
		this.grade = grade;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public double getGrade() {
		return grade;
	}



	public void setGrade(double grade) {
		this.grade = grade;
	}



	public String toString() {
		return getCourse() + " - "+getGrade();
	}
	
	
}
