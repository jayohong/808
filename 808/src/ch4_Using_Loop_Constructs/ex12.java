package ch4_Using_Loop_Constructs;

public class ex12 {

	public static void main(String[] args) {
		int[] x = {6, 7, 8};
        for (int i : x) {
            System.out.print(i + " ");
            i++;
           
        }
		

	}

}

/*
Given:

public class MyFor1 {
    public static void main(String[] args) {
        int[] x = {6, 7, 8};
        for (int i : x) {
            System.out.print(i + " ");
            i++;
            
        }
    }
}
What is the result?

A.

6 7 8

B.

7 8 9

C.

0 1 2

D.

6 8 10

E. Compilation fails


Ans is A

*/