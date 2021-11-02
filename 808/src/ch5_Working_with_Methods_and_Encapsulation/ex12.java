package ch5_Working_with_Methods_and_Encapsulation;

public class ex12 {

	public static void main(String[] args) {
		
		String[] x= {"12345"};
		Integer num = Integer.parseInt(x[1]);
	        System.out.println("Number is : " + num);

	}

}
/*
Given:

public class Test {
 
    public static void main(String[] args) {
        Integer num = Integer.parseInt(args[1]);
        System.out.println("Number is : " + num);
    }
}
And the commands:

javac Test.java
java Test 12345

What is the result?

A.

Number us : 12345

B. A NullPointerException is thrown at runtime
C. A NumberFormatException is thrown at runtime
D. An ArrayIndexOutOfBoundException is thrown at runtime.



*/