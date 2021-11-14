package ch2_Working_With_Java_Data_Types;

public class ex18_attention {
	 char c;
	 boolean b;
	 float f;
	 
	    void printAll() {
	        System.out.println("c = " + c);
	        System.out.println("c = " + b);
	        System.out.println("c = " + f);
	    }
	 
	    public static void main(String[] args) {
	        ex18_attention f = new ex18_attention();
	        f.printAll();
	    }

	

}

/*
Given:

public class FieldInit {
 
    char c;
    boolean b;
    float f;
 
    void printAll() {
        System.out.println("c = " + c);
        System.out.println("c = " + b);
        System.out.println("c = " + f);
    }
 
    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        f.printAll();
    }
}
What is the result?

A.

c = null
b = false
f = 0.0F

B.

c = 0
b = false
f = 0.0f

C.

c = null
b = true
f = 0.0

D.

c =
b = false
f = 0.0




Ans is D
note: 
char的初始值是空格
物件的初始值才是null

Data Type				Default Value (for fields)
-------------------------------------------------------
byte	 				0
short					0
int						0
long					0L
float					0.0f
double					0.0d
char					'\u0000'
String(or any object)  	null
boolean					false

*/