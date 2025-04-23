package bai5_2;

public class School {
	public static void main(String[] args) {
		ScoreBroad st1 = new ScoreBroad("Nguyen Thang", 2015);
		Course c1 = new Course(100, "PYTHON", 4);
		Course c2 = new Course(200, "JAVA", 4);
		Course c3 = new Course(250, "SQL SERVER", 3);
		Course c4 = new Course(300, "NETWORKING", 3);
		st1.register(c4);
		st1.register(c1);
		st1.register(c2);
		st1.register(c3);
		
		st1.updateGrade(c1, 5.6);



	}

}
