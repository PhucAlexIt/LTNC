package bt4_2;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Bai4_2 {
	 public static String Replace(String s, String s1, String s2) {   
	        String result = "";
	        int i = 0;
	        
	        while (i < s.length()) {
	            if (i <= s.length() - s1.length() && matchSubstring(s, i, s1)) {
	                result += s2;
	                i += s1.length();
	            } else {
	                result += s.charAt(i);
	                i++;
	            }
	        }
	        
	        return result;
	    }
	    
	    private static boolean matchSubstring(String s, int index, String pattern) {
	        if (index + pattern.length() > s.length()) {
	            return false;
	        }
	        
	        for (int i = 0; i < pattern.length(); i++) {
	            if (s.charAt(index + i) != pattern.charAt(i)) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	    
	    public static void main(String[] args) {
	        String s = "hello java";
	        String s1 = "hello";
	        String s2 = "xin chao";
	        
	        String result = Replace(s, s1, s2);
	        System.out.println("Chuỗi ban đầu: " + s);
	        System.out.println("Chuỗi sau khi thay thế: " + result);
	    }
	  
	    @Test
	    public void checkReplaceString() {
	    	 	String s = "Ai tren 2.8 GPA moi la gioi";
		        String s1 = "tren";
		        String s2 = "duoi";
		        
		       assertEquals(Replace(s, s1, s2),"Ai duoi 2.8 GPA moi la gioi");
	    }
}
