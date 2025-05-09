package bt4_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Bai4_1 {
	
	//1. Cho 2 chuỗi s và s1. Tìm vị trí đầu tiên chuỗi s1 xuất hiện trong chuỗi s. 
	public static int findString(String s, String s1) {
        
        int sLength = s.length();
        int s1Length = s1.length();
        
        for (int i = 0; i <= sLength - s1Length; i++) {
            		int j;
            for (j = 0; j < s1Length; j++) {
                if (s.charAt(i + j) != s1.charAt(j)) {
                    break;
                }
            }
            if (j == s1Length) {
                return i;
            }
        }
        
        return -1;
    }
	 public static void main(String[] args) {
	        String s = "Neu lu la toi sieu nhan la hoc vien";
	        String s1 = "la";

	        int position = findString(s, s1);

	        if (position != -1) {
	            System.out.println("Chuỗi s1 xuất hiện đầu tiên ở vị trí: " + position);
	        } else {
	            System.out.println("Chuỗi s1 không xuất hiện trong chuỗi s.");
	        }
	    }
				
	 @Test	
	public void checkfindString() {
		  String s = "Hoc sinh la hoc sinh gioi";
	      String s1 = "hoc";
		 assertEquals(findString(s, s1), 12);
	 }
	
	
}
