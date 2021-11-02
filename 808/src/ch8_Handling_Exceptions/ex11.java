package ch8_Handling_Exceptions;
class SpecialException extends Exception {
	 
    public SpecialException(String message) {
        super(message);
        System.out.println(message);
    }
}

public class ex11 {

	 public static void main(String[] args) {
	        try {
	            doSomething();
	        } catch (SpecialException e) {
	            System.out.println(e);
	        }
	    }
	    static void doSomething() throws SpecialException {
	        int[] ages = new int[4];
	        ages[4] = 17;
	        doSomethingElse();
	    }
	    static void doSomethingElse() throws SpecialException {
	        throw new SpecialException("Thrown at end of doSomething() method");
	    }

}
/*
class SpecialException extends Exception {
 
    public SpecialException(String message) {
        super(message);
        System.out.println(message);
    }
}
 
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (SpecialException e) {
            System.out.println(e);
        }
    }
    static void doSomething() throws SpecialException {
        int[] ages = new int[4];
        ages[4] = 17;
        doSomethingElse();
    }
    static void doSomethingElse() throws SpecialException {
        throw new SpecialException("Thrown at end of doSomething() method");
    }
}
What will be the output?

A.

SpecialException: Thrown at end of doSomething() method

B.

Error in thread "main" java.lang.ArrayIndexOutOfBoundsError

C.

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
at ExceptionTest.doSomething(ExceptionTest.java:13)
at ExceptionTest.main(ExceptionTest.java:4)

D.

SpecialException: Thrown at end of doSomething() method
at ExceptionTest.doSomethingElse(ExceptionTest.java:16)
at ExceptionTest.doSomething(ExceptionTest.java:13)
at ExceptionTest.main(ExceptionTest.java:4)


*/