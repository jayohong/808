package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex7 {

	public static void main(String[] args) {
		String str = " ";
	   // System.out.println(str.trim().length());
	    str=str.trim();
	    System.out.println(str.length());
	    System.out.println(str.equals("") + " " + str.isEmpty());

	}

}
/*
Given the code fragment:

public static void main(String[] args) {
    String str = " ";
    str.trim();
    System.out.println(str.equals("") + " " + str.isEmpty());
}

What is the result?

A.

true true

B.

true false

C.

false false

D.

false true



*/