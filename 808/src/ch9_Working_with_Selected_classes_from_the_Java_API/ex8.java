package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex8 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);//""
		System.out.println(sb);
	    String s = "";
	System.out.println(sb.equals(s));
	
	  if (sb.equals(s)) {
	        System.out.println("Match 1");
	    } else if (sb.toString().equals(s.toString())) {
	        System.out.println("Match 2");
	    } else {
	        System.out.println("No Match");
	    }

	}

}
/*
Given the code fragment:

public static void main(String[] args) {
    StringBuilder sb = new StringBuilder(5);
    String s = "";
 
    if (sb.equals(s)) {
        System.out.println("Match 1");
    } else if (sb.toString().equals(s.toString())) {
        System.out.println("Match 2");
    } else {
        System.out.println("No Match");
    }
}

What is the result?

A.

Match 1

B.

Match 2

C.

No Match

D. A NullPointerException is thrown at runtime.



*/