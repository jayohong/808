package ch1_javaBasic;
// s ans E
public class ex27 {

	public static void main(String[] args) {
		
	}

}
/*
Given the code fragment:

int x = 100;
int a = x++;
int b = ++x;
int c = x++;
int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;
System.out.println(d);
What is the result?

A.

100

B.

101

C.

102

D.

103

E. Compilation fails


Ans is E
三元運算子出錯
*/