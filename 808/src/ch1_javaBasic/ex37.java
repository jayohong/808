package ch1_javaBasic;

public class ex37 {
	
	 void verify(int marks) throws IndexOutOfBoundsException {
	        if (marks > 100) {
	            throw new MarksOutOfBoundsException();
	        }
	        if (marks > 50) {
	            System.out.print("Pass");
	        } else {
	            System.out.print("Fail");
	        }
	    }
	 
	    public static void main(String[] args) {
	        int marks = 104;
	        try {
	            new ex37().verify(marks);
	        } catch (Exception e) {
	            System.out.print(e.getClass());
	        }
	    }
}
class MarksOutOfBoundsException extends IndexOutOfBoundsException {
}

/*
Given:

class MarksOutOfBoundsException extends IndexOutOfBoundsException {
}
 
public class GradingProcess {
 
    void verify(int marks) throws IndexOutOfBoundsException {
        if (marks > 100) {
            throw new MarksOutOfBoundsException();
        }
        if (marks > 50) {
            System.out.print("Pass");
        } else {
            System.out.print("Fail");
        }
    }
 
    public static void main(String[] args) {
        int marks = Integer.parseInt(args[2]);
        try {
            new GradingProcess().verify(marks);
        } catch (Exception e) {
            System.out.print(e.getClass());
        }
    }
}
And the command line invocation:

java GradingProcess 89 50 104

What is the result?

A.

Pass

B.

Fail

C. Class MarketOutOfBoundsException
D. Class IndexOutOfBoundsException
E. Class Exception


Ans is C
類似多型概念
*/