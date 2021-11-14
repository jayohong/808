package ch1_javaBasic;
//sAns C

public class ex39 {

	public static void main(String[] args) {
		int x = 10;
		if (x > 10) {
		    System.out.println(">");
		} else if (x < 10) {
		    System.out.println("<");
		} else {
		    System.out.println("=");
		}
		System.out.println(x>10? ">":x<10? "<":"=");
	}

}
/*
Given:

int x = 10;
if (x > 10) {
    System.out.println(">");
} else if (x < 10) {
    System.out.println("<");
} else {
    System.out.println("=");
}
Which of the following is equivalent to the above code fragment?

A.

System.out.printLn(x > 10 ? ">" : "<" : "=");
B.

System.out.println(x > 10 ? ">" ? "<" : "=");
C.

System.out.println(x > 10 ? ">" : x < 10 ? "<" : "=");
D.

System.out.printLn(x > 10 ? ">" ? "<" ? "=");
E. None of the above


Ans is C
*/