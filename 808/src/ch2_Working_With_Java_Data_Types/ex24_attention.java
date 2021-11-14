package ch2_Working_With_Java_Data_Types;

public class ex24_attention {

	public static void main(String[] args) {
		Short s1 = 200;
	    Integer s2 = 400;
	    Long s3 = (long) s1 + s2; // line n1
	   //String s4 = (String) (s3 * s2); // line n2
	    
	    //可以寫成這樣
	    String s4=String.valueOf(s3*s2);
	    System.out.println("Sum is " + s4);
		

	}

}
/*
Given the code fragment:

public static void main(String[] args) {
    Short s1 = 200;
    Integer s2 = 400;
    Long s3 = (long) s1 + s2; // line n1
    String s4 = (String) (s3 * s2); // line n2
    System.out.println("Sum is " + s4);
}
What is the result?

A. Sum is 600
B. Compilation fails at line n1.
C. Compilation fails at line n2.
D. A ClassCastException is thrown at line n1.
E. A ClassCastException is thrown at line n2.

ans is C


*/