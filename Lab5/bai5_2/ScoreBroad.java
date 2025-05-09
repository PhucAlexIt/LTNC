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
		System.out.println(this.name+" đã đăng ký môn học: "+course.getNumberCourse()+ " - "+course.getTitleCourse()+" - "+course.getCredit());
	}
	//c. Viết phương thức updateGrade(Course course, double grade) để cập nhật điểm số grade cho môn học course của một sinh viên.
	public void updateGrade(Course course, double grade) {
		for (GradeRecord gradeRecord : grades) {
			if(gradeRecord.getCourse().equals(course)) {
				gradeRecord.setGrade(grade);
				System.out.println("Kết quả điểm cập nhật: "+course.getNumberCourse()+ " - "+course.getTitleCourse()+" - "+course.getCredit()+ " - "+gradeRecord.getGrade());
				return;
				}
			}
		System.out.println("Không tìm thấy");

		}
	//d. Viết phương thức howManyCredits để tính tổng số tín chỉ trong bảng điểm mà sinh viên đã đạt được.
	public int howManyCredits() {
		int sumCredits = 0;
		for(GradeRecord gradeRecord: grades) {
			if(gradeRecord.getGrade() >= 4.0) {
				sumCredits+= gradeRecord.getCourse().getCredit();
			}
		}
		return sumCredits;
	}
	//e. 	Viết phương thức gradeAverage để tính điểm trung bình của sinh viên bằng tổng của tích điểm số từng môn với số tín chỉ chia cho tổng số tín chỉ.
	public double gradeAverage() {
		double totalGrades = 0.0;
		int totalCredits = 0;
		for(GradeRecord gd: grades) {
			totalGrades += (gd.getGrade() * gd.getCourse().getCredit());
			totalCredits += gd.getCourse().getCredit();
		}
		if(totalCredits == 0) return 0.0;
		return totalGrades/totalCredits;
	}
	}
	
	

