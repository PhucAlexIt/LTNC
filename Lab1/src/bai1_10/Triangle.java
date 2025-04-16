package bai1_10;

public class Triangle {
	private double a, b, c; 
    
	   public Triangle(double a, double b, double c) { 
	      this.a = a; 
	      this.b = b; 
	      this.c = c; 
	   } 
	 
	   public boolean isTriangle() { 
	      if(a + b > c && b + c > a && c + a > b) return true; 
	      else return false; 
	   } 
	    
	   public double perimeter() { 
	      return a + b + c; 
	   } 
	 
	   public double area() { 
	      double p = (a + b + c) / 2; 
	      return Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
	   } 
	    
	   public double angleA() { 
	      double cosA = (b*b + c*c - a* a)/(2*b*c); 
	      double tgA = Math.sqrt(1/(cosA*cosA) - 1); 
	      return (Math.atan(tgA) * 180) / Math.PI; 
	   } 
}
