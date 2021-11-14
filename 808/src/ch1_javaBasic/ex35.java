package ch1_javaBasic;

public class ex35 {

	public static void main(String[] args) {
		int b = 3;
		if (!(b > 3)) {
		    System.out.println("square ");
		}
		
		
		{
		    System.out.println("circle ");
		}
		
		
		System.out.println("...");

	}

}
/*
Given the code fragment:

int b = 3;
if (!(b > 3)) {
    System.out.println("square ");
}{
    System.out.println("circle ");
}
System.out.println("...");
What is the result?

A.

square
...

B.

circle
...

C.

square
circle
...

D. Compilation fails.


Ans is C
陷阱:if後面沒接else 所以全部會執行
*/