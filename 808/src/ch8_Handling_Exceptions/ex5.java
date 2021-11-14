package ch8_Handling_Exceptions;
class MyException extends RuntimeException{
    
}

public class ex5 {

	public static void main(String[] args) {
        try {
            method1();
            
        } catch (MyException ne) {
            System.out.print("A");
        }
    }
 
    public static void method1() { // line n1
        try {
            double r = Math.random();
            System.out.println(r);
        	throw r > 0.5 ? new MyException() : new RuntimeException();
           
        } catch (RuntimeException re) {
            System.out.print("B");
        }
    }

}
/*
Given the following code for the classes MyException and Test:

MyException.java
public class MyException extends RuntimeException{
    
}
Test.java
public class Test {
 
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.print("A");
        }
    }
 
    public static void method1() { // line n1
        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        } catch (RuntimeException re) {
            System.out.print("B");
        }
    }
}
What is the result?

A.

A

B.

B

C.

Either A or B

D.

A B

E. A compile time error occurs at line n1



my ans is E
incorrect ans is B

note 
在try-catch時 catch異常的順序通常子類異常寫在父類異常之前
因為一但拋出的子類異常也會被catch父類異常時catch到

*/