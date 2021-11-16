package ch6_Creating_and_Using_Arrays;

public class ex11 {

	public static void main(String[] args) {
        ex11 ts = new ex11();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }
 
    public static boolean doStuff() {
        return !isAvailable;
    }
    static boolean isAvailable = false;
 
   

}
/*
Given:

public class Test {
 
    public static void main(String[] args) {
        Test ts = new Test();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }
 
    public static boolean doStuff() {
        return !isAvailable;
    }
    static boolean isAvailable = false;
}
What is the result?

A.

true true

B.

true false

C.

false true

D.

false false

E. Compilation fails

Ans is C
*/