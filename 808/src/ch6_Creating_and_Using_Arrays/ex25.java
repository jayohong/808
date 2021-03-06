package ch6_Creating_and_Using_Arrays;

public class ex25 {

	public static void main(String[] args) {
		int num[][] = new int[1][3];
		for (int i = 0; i < num.length; i++) {
		    for (int j = 0; j < num[i].length; j++) {
		        num[i][j] = 10;
		        System.out.printf("num[%d][%d]:",i,j);
		        System.out.println(num[i][j]);
		    }
		}

	}

}
/*
Given the code fragment:

int num[][] = new int[1][3];
for (int i = 0; i < num.length; i++) {
    for (int j = 0; j < num[i].length; j++) {
        num[i][j] = 10;
    }
}
Which option represents the state of the num array after successful completion of the outer loop?

A.

num[0][0]=10
num[0][1]=10
num[0][2]=10

B.

num[0][0]=10
num[1][0]=10
num[2][0]=10

C.

num[0][0]=10
num[0][1]=0
num[0][2]=0

D.

num[0][0]=10
num[0][1]=10
num[0][2]=10
num[0][3]=10
num[1][0]=10
num[1][1]=10
num[1][2]=10
num[1][3]=10


Ans is A

*/