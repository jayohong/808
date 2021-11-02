package ch1_javaBasic;
//Ans A
public class ex7 {

	public static void main(String[] args) {
		float x = 22.00f % 3.00f;//1.0
		int y = 22 % 3;//1
		System.out.print(x + ", " + y);

	}

}
/*
Given the code fragment:

float x = 22.00f % 3.00f;
int y = 22 % 3;
System.out.print(x + ", " + y);
What is the result?

A.

1.0, 1

B.

1.0f, 1

C.

7.33, 7

D. Compilation fails
E. An exception is thrown at runtime


*/