package ch2_Working_With_Java_Data_Types;

public class ex19 {
	 public static void main(String[] args) {
	        X xRef = new Y();
	        Y yRef = (Y)xRef;//new Y();
	        System.out.println(xRef);
	        System.out.println(yRef);
	        yRef.mY();
	        xRef.mX();
	    }

}
class Y extends X {
	 
    public void mX() {
        System.out.println("Xm2");
    }
 
    public void mY() {
        System.out.println("Ym");
    }
}
class X {
	 
    public void mX() {
        System.out.println("Xm1");
    }
}
/*
Given:

class X {
 
    public void mX() {
        System.out.println("Xm1");
    }
}
 
class Y extends X {
 
    public void mX() {
        System.out.println("Xm2");
    }
 
    public void mY() {
        System.out.println("Ym");
    }
}
 
public class Test {
 
    public static void main(String[] args) {
        X xRef = new Y();
        Y yRef = (Y)xRef;//new Y();
        yRef.mY();
        xRef.mX();
    }
}
What is the result?

A.

Ym
Xm2

B.

Ym
Xm1

C. Compilation fails
D. A ClassCastException is thrown at runtime




*/