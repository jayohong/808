package ch8_Handling_Exceptions;

import java.util.ArrayList;

public class ex14 {

	public static void main(String[] args) {
		 ArrayList myList = new ArrayList();
		    String[] myArray;
		    try {
		        while (true) {
		            myList.add("My String");
		        }
		    } catch (RuntimeException re) {
		        System.out.println("Caught a RuntimeException");
		    } catch (Exception e) {
		        System.out.println("Caught a Exception");
		    }
		    System.out.println("Ready to use");

	}

}
/*
Given the code fragment:

public static void main(String[] args) {
    ArrayList myList = new ArrayList();
    String[] myArray;
    try {
        while (true) {
            myList.add("My String");
        }
    } catch (RuntimeException re) {
        System.out.println("Caught a RuntimeException");
    } catch (Exception e) {
        System.out.println("Caught a Exception");
    }
    System.out.println("Ready to use");
}
What is the result?

A. Execution terminates in the first catch statement, and caught a RuntimeException is printed to the console.
B. Execution terminates In the second catch statement, and caught an Exception is printed
to the console.
C. A runtime error is thrown in the thread "main".
D. Execution completes normally, and Ready to use is printed to the console.
E. The code fails to compile because a throws keyword is required.




*/