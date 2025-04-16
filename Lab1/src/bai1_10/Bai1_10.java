package bai1_10;

public class Bai1_10 {  
	 public static void main(String[] args) {
		 Triangle tria = new Triangle(5.0, 4.0, 3.0);
		 if (!tria.isTriangle()) {
	            System.out.println("Đây không là tam giác");
	        } else {
	            System.out.println("Đây là tam giác");
	            System.out.printf("Chu vi = %.2f\n", tria.perimeter());
	            System.out.printf("Diện tích = %.2f\n", tria.area());
	            System.out.printf("Góc A = %.2f độ\n", tria.angleA());
	        }
		
	}
}
	     
	       
	   
