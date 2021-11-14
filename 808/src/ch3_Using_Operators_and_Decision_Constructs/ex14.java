package ch3_Using_Operators_and_Decision_Constructs;

public class ex14 {
	 private String name;
	    private boolean pass;
	 
	    public static void main(String[] args) {
	        ex14 wb = new ex14();
	        System.out.print("name = " + wb.name);
	        System.out.print(",pass = " + wb.pass);
	    }

}
/*
Given:

public class Whizlabs {
 
    private String name;
    private boolean pass;
 
    public static void main(String[] args) {
        Whizlabs wb = new Whizlabs();
        System.out.print("name = " + wb.name);
        System.out.print(",pass = " + wb.pass);
    }
}
What would be the output, if it is executed as a program?

A.

name =, pass =

B.

name = null, pass = null

C.

name = null, pass = false

D.

name = null pass = true

E. Compile error.


Ans is C
*/