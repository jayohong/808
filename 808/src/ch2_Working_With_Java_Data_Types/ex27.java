package ch2_Working_With_Java_Data_Types;

public class ex27 {

	public static void main(String[] args) {
		System.out.println("5 + 2 = " + 3 + 4);
		System.out.println("5 + 2 = " + (3 + 4));
		System.out.println(5+2+3+4);

	}

}
/*

Given:

System.out.println("5 + 2 = " + 3 + 4);
System.out.println("5 + 2 = " + (3 + 4));
What is the result?

A.

5 + 2 = 34
5 + 2 = 34

B.

5 + 2 + 3 + 4
5 + 2 = 7

C.

7 = 7
7 + 7

D.

5 + 2 = 34
5 + 2 = 7

Ans is D
都是數字就是數字加法
只要有一個文字 就是文字加
*/