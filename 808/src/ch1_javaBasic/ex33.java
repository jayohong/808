package ch1_javaBasic;

public class ex33 {

	 void main() {
	        System.out.println("one");
	    }
	 
	    static void main(String args) {
	        System.out.println("two");
	    }
	 
	    public static void main(String[] args) {
	        System.out.println("three");
	    }
	 
	    void mina(Object[] args) {
	        System.out.println("four");
	    }
	

}
/*
Given:

public class MainMethod {
 
    void main() {
        System.out.println("one");
    }
 
    static void main(String args) {
        System.out.println("two");
    }
 
    public static void main(String[] args) {
        System.out.println("three");
    }
 
    void mina(Object[] args) {
        System.out.println("four");
    }
}
What is printed out when the program is excuted?

A.

one

B.

two

C.

three

D.

four



Ans is C
*/