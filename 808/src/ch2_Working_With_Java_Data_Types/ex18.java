package ch2_Working_With_Java_Data_Types;

public class ex18 {
	 char c;
	    boolean b;
	    float f;
	 
	    void printAll() {
	        System.out.println("c = " + c);
	        System.out.println("c = " + b);
	        System.out.println("c = " + f);
	    }
	 
	    public static void main(String[] args) {
	        ex18 f = new ex18();
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




*/