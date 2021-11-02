package ch8_Handling_Exceptions;

public class ex10 {

	
 
    public static void main(String[] args) {
       
    }

}
/*
Given the code fragment:

public class Test {
 
    void readCard(int carNo) throws Exception {
        System.out.println("Reading Card");
    }
 
    void checkCard(int carNo) throws Exception {
        System.out.println("Checking Card");
    }
 
    public static void main(String[] args) throws RuntimeException { // line n1
        Test ex = new Test();
        int carNo = 12344;
        ex.checkCard(carNo); // line n2
        ex.readCard(carNo); // line n3
    }
}
What is the result?

A.

Reading Card
Checking Card

B. Compilation fails only at line n1.
C. Compilation fails only at line n2.
D. Compilation fails only at line n3.
E. Compilation fails at both line n2 and line n3.



*/