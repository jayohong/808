package ch4_Using_Loop_Constructs;

public class ex8 {

	public static void main(String[] args) {
		
		int[] lst = {1, 2, 3, 4, 5, 4, 3, 2, 1};
		int sum = 0;
		for (int frnt = 0, rear = lst.length - 1; frnt < 5 && rear >= 5; frnt++, rear--) {
		    sum = sum + lst[frnt] + lst[rear];
		}
		System.out.print(sum);
		

	}

}
/*
Given the code fragment:

int[] lst = {1, 2, 3, 4, 5, 4, 3, 2, 1};
int sum = 0;
for (int frnt = 0, rear = lst.length - 1; frnt < 5 && rear >= 5; frnt++, rear--) {
    sum = sum + lst[frnt] + lst[rear];
}
System.out.print(sum);
What is the result?

A.

20

B.

25

C.

29

D. Compilation fails
E. An ArrayIndexOutOfBoundsException is thrown at runtime




*/