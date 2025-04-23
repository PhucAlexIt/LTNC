package bai5_2;

import java.util.ArrayList;
import java.util.List;

public class ScoreBroad {
	private String name;
	private int course;
	private List <GradeRecord> grades;
	public ScoreBroad(String name, int course) {
		super();
		this.name = name;
		this.course = course;
		this.grades = new ArrayList<GradeRecord>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int  course) {
		this.course = course;
	}
	public List<GradeRecord> getGrades() {
		return grades;
	}
	public void setGrades(List<GradeRecord> grades) {
		this.grades = grades;
	}
	
	
	//b. Viết phương thức register(Course course) để cho một sinh viên đăng ký học một course cho trước.
	public void register(Course course) {
		grades.add(new GradeRecord(course, 0.0));
		System.out.println("Bạn đã đăng ký môn học: "+course.getNumberCourse()+ " - "+course.getTitleCourse()+" - "+course.getCredit());
	}
	//c. Viết phương thức updateGrade(Course course, double grade) để cập nhật điểm số grade cho môn học course của một sinh viên.
	public void updateGrade(Course course, double grade) {
		
	}
	
	
}
