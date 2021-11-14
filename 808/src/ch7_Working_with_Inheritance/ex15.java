package ch7_Working_with_Inheritance;

public class ex15 {

	 
	 
	    public static void main(String[] args) {
	        Base b1 = new DerivedB();
	        Base b2 = new DerivedA();
	        Base b3 = new DerivedB();
	        b1 = (Base) b3;
	        Base b4 = (DerivedA) b3;
	        
	        b1.test();
	        b4.test();
	    }

}
class Base {
	 
    public void test() {
        System.out.println("Base ");
    }
}
class DerivedA extends Base {
	 
    public void test() {
        System.out.println("DerivedA");
    }
}
class DerivedB extends Base {
	 
    public void test() {
        System.out.println("DerivedB");
    }
 
   /* public static void main() {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
    }*/
}
/*
Given:

Base.java
class Base {
 
    public void test() {
        System.out.println("Base ");
    }
}
DerivedA.java
class DerivedA extends Base {
 
    public void test() {
        System.out.println("DerivedA");
    }
}
DerivedB.java
class DerivedB extends Base {
 
    public void test() {
        System.out.println("DerivedB");
    }
 
    public static void main() {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
    }
}
What is the result?

A.

Base
DerivedA

B.

Base
DerivedB

C.

DerivedB
DerivedB

D.

DerivedB
DerivedA

E. A classcast Except ion is thrown at runtime.


my ans is C
incorrect,ans is E

note 
DerivedA與DerivedB之間並沒有直接的繼承關西
所以不能轉型
*/