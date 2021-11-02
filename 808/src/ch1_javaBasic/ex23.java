package ch1_javaBasic;

public class ex23 {

	public static void main(String[] args) {
		Integer aVar=9;
		if (aVar++ < 10) {//avar<10;avar=aver+1;
		    System.out.println(aVar + " Hello World!");
		} else {
		    System.out.println(aVar + " Hello Universe!");
		}
	}

}
/*
Given the code fragment:

if (aVar++ < 10) {
    System.out.println(aVar + " Hello World!");
} else {
    System.out.println(aVar + " Hello Universe!");
}
What is the result if the integer aVar is 9?

A.

10 Hello World!

B.

Hello Universe!

C.

Hello World!

D. Compilation fails.


*/