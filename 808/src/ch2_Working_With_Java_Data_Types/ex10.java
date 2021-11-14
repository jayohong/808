package ch2_Working_With_Java_Data_Types;

public class ex10 {
	static int i = 7;
	 
    public static void main(String[] args) {
        ex10 obj = new ex10();
        obj.i++;
        ex10.i++;
        obj.i++;
        System.out.println(ex10.i + " " + obj.i);
    }
}
/*
Given:

class StaticField {
 
    static int i = 7;
 
    public static void main(String[] args) {
        StaticField obj = new StaticField();
        obj.i++;
        StaticField.i++;
        obj.i++;
        System.out.println(StaticField.i + " " + obj.i);
    }
}
What is the result?

A.

10 10

B.

8 9

C.

9 8

D.

7 10


Ans:A

note 
static 變數是共用的
不管是物件呼叫或class呼叫都是改同一個
*/