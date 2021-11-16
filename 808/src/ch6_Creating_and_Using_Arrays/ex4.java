package ch6_Creating_and_Using_Arrays;

public class ex4 {

	public static void main(String[] args) {
		int[] intArr = {8, 16, 32, 64, 128};
		
		/*for (int i : intArr) {
		    System.out.print(i + " ");
		}*/
		for (int i = 0; i < intArr.length; i++) {
		    System.out.print(intArr[i] + " ");
		}

	}

}
/*
Given the following array:

int[] intArr = {8, 16, 32, 64, 128};
Which two code fragments, independently, print each element in this array?

A.

for (int i : intArr) {
    System.out.print(intArr[i] + " ");
}
B.

for (int i : intArr) {
    System.out.print(i + " ");
}
C.

for (int i = 0; intArr) {
    System.out.print(intArr[i] + " ");
    i++;
}
D.

for (int i = 0; i < intArr.length; i++) {
    System.out.print(i + " ");
}
E.

for (int i = 0; i < intArr.length; i++) {
    System.out.print(intArr[i] + " ");
}

Ans is BE
*/