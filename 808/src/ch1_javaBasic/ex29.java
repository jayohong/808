package ch1_javaBasic;

public class ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given the code in a file Traveler.java:

Traveler.java
class Tours {
 
    public static void main(String[] args) {
        System.out.print("Happy Journey! " + args[1]);
    }
}
 
public class Traveler {
 
    public static void main(String[] args) {
        Tours.main(args);
    }
}
And the commands:

javac Traveler.java
java Traveler Java Duke

What is the result?

A.

Happy Journey! Duke

B.

Happy Journey! Java

C. An exception is thrown at runtime
D. The program fails to execute due to a runtime error

Ans is A
*/