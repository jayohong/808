package ch5_Working_with_Methods_and_Encapsulation;

public class ex2 {

	
    public static void main(String[] args) {
        
    }

}
/*
Given:

class Overloading {
 
    int x(double d) {
        System.out.println("one");
        return 0;
    }
 
    String x(double d) {
        System.out.println("two");
        return null;
    }
 
    double x(double d) {
        System.out.println("three");
        return 0.0;
    }
 
    public static void main(String[] args) {
        new Overloading().x(4.0);
    }
}


What is the result?

A.

One

B.

Two

C.

Three

D. Compilation fails.





Ans is D
overloading時()內引數不能相同
*/