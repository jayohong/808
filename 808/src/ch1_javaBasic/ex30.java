package ch1_javaBasic;

public class ex30 {

	public static void main(String[] args) {
		int a = -10;
		int b = 17;
		int c = ++a;
		int d =b--;
		c++;
		d--;
		System.out.print(c + ", " + d);

	}

}
/*
Given the code fragment:

int a = -10;
int b = 17;
int c = expression1;
int d = expression2;
c++;
d--;
System.out.print(c + ", " + d);
What could expression1 and expression2 be, respectively, in order to produce output -8, 16?

A.
++a, --b
B.
++a, b--
C.
a++, --b
D.
a++, b--


Ans is B
*/