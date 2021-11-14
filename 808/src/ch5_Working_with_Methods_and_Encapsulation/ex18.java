package ch5_Working_with_Methods_and_Encapsulation;

public class ex18 {

	public static void main(String[] args) {
		 //byte x=1; //O
		 //short x=1;//O
		//String x="1";//X
		//long x=1;  //X
		//Double x=1;//X
		Integer x= new Integer("1");
		
		
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;

	}
	}
}
/*
Given the code fragment:

public class Test {
 
    public static void main(String[] args) {
        // line n1
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}
Which three code fragments can be independently inserted at line nl to enable the code to print one?

A.

Byte x = 1;
B.

short x = 1;
C.

String x = "1";
D.

Long x = 1;
E.

Double x = 1;
F.

Integer x = new Integer("1");




Ans is ABF
switch整數可用byte short int這三種 long不行
*/