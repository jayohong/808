package ch8_Handling_Exceptions;

public class ex9 {

	  static void dispResult(int[] num) {
	        try {
	            System.out.println(num[1] / (num[1] - num[2]));
	        } catch (ArithmeticException e) {
	            System.err.println("First exception");
	        }
	        System.out.println("Done");
	    }
	 
	    public static void main(String[] args) {
	        try {
	            int[] arr = {100, 100};
	            dispResult(arr);
	        } catch (IllegalArgumentException e) {
	            System.err.println("Second exception");
	        } catch (Exception e) {
	            System.err.println("Third exception");
	        }
	    }
	    

}
/*
Given:

public class Test {
 
    static void dispResult(int[] num) {
        try {
            System.out.println(num[1] / (num[1] - num[2]));
        } catch (ArithmeticException e) {
            System.err.println("First exception");
        }
        System.out.println("Done");
    }
 
    public static void main(String[] args) {
        try {
            int[] arr = {100, 100};
            dispResult(arr);
        } catch (IllegalArgumentException e) {
            System.err.println("Second exception");
        } catch (Exception e) {
            System.err.println("Third exception");
        }
    }
}
What is the result?

A.

0
Done

B.

First Exception
Done

C.

Second Exception

D.

Done
Third Exception

E.

Third Exception





*/