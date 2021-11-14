package ch8_Handling_Exceptions;

public class ex1 {

	 public static void main(String[] args) throws Exception{
	        ex1 t = new ex1();
	        try {
	            t.doPrint();
	            t.doList();
	        } catch (Exception e2) {
	            System.out.println("Caught " + e2);
	        }

	    }
	    public void doList() throws Exception {
	        throw new Error("Error");
	    }
	    public void doPrint() throws Exception {
	        throw new RuntimeException("Exception");
	    }
    

}
/*
Given:
TestApp.java
public class TestApp {
    public static void main(String[] args) {
        TestApp t = new TestApp();
        try {
            t.doPrint();
            t.doList();
        } catch (Exception e2) {
            System.out.println("Caught " + e2);
        }
    }
    public void doList() throws Exception {
        throw new Error("Error");
    }
    public void doPrint() throws Exception {
        throw new RuntimeException("Exception");
    }
}
What is the result?

A.

Caught java.lang.RuntimeException: Exception
Exception in thread "main" java.lang.Error: Error
at TestApp.doList(TestApp.java: 14)
at TestApp.main(TestApp.java: 6)

B.

Exception in thread "main" java.lang.Error: Error
at TestApp.doList(TestApp.java: 14)
at TestApp.main(TestApp.java: 6)

C.

Caught java.lang.RuntimeException: Exception
Caught java.lang.Error: Error

D.

Caught java.lang.RuntimeException: Exception


my ans is D
*/