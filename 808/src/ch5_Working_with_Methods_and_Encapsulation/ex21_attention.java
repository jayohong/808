package ch5_Working_with_Methods_and_Encapsulation;

public class ex21_attention {

	 static void doubling(Integer ref, int pv) {
	        ref = 20;
	        pv = 20;
	    }
	 
	    public static void main(String[] args) {
	        Integer iQbj = new Integer(10);
	        int iVar = 10;
	        doubling(iQbj++, iVar++);
	        System.out.println(iQbj + "," + iVar);
	    }

}
/*
Given:

public class Test1 {
 
    static void doubling(Integer ref, int pv) {
        ref = 20;
        pv = 20;
    }
 
    public static void main(String[] args) {
        Integer iQbj = new Integer(10);
        int iVar = 10;
        doubling(iQbj++, iVar++);
        System.out.println(iQbj + "," + iVar);
    }
}
What is the result?

A.

11, 11

B.

10, 10

C.

21, 11

D.

20, 20

E.

11, 12




Ans is A
*/