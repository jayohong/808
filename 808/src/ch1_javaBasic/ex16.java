package ch1_javaBasic;

public class ex16 {

	public static void main(String[] args) {
		int var1 = -5;
		int var2 = var1--;//var2=-5
		int var3 = 0;
		if (var2 < 0) {
		    var3 = var2++;//var3=var2;var2=var2+1;-->var3=-5
		} else {
		    var3 = --var2;
		}
		System.out.println(var3);
		
	}

}
/*
Given the code fragment

int var1 = -5;
int var2 = var1--;
int var3 = 0;
if (var2 < 0) {
    var3 = var2++;
} else {
    var3 = --var2;
}
System.out.println(var3);
What is the result?

A.

-6

B.

-4

C.

-5

D.

5

E.

4

F. Compilation fails



*/