package ch2_Working_With_Java_Data_Types;

public class ex13 {

	public static void main(String[] args) {
		
		float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 14_56.02f;
		float var2 = var1 + 1024;
		System.out.print(var2);
	}

}
/*
Given the fragment:

float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 14_56.02f;
float var2 = var1 + 1024;
System.out.print(var2);
What is the result?

A.

13480.0

B.

13480.02

C. Compilation fails
D. An exception is thrown at runtime




*/