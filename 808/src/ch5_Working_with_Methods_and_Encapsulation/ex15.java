package ch5_Working_with_Methods_and_Encapsulation;

public class ex15 extends Base{

	 public static void main(String[] args) {
	        System.out.println("Overriden " + args[1]);
	    }

}
class Base {
	 
    public static void main(String[] args) {
        System.out.println("Base " + args[2]);
    }
}
/*

Given:

class Base {
 
    public static void main(String[] args) {
        System.out.println("Base " + args[2]);
    }
}
 
public class Sub extends Base {
 
    public static void main(String[] args) {
        System.out.println("Overriden " + args[1]);
    }
}
And the commands:

javac Sub.java
java Sub 10 20 30

What is the result?

A.

Base 30

B.

Overridden 20

C.

Overridden 20
Base 30

D.

Base 30
Overridden 20


*/