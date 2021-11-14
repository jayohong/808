package ch5_Working_with_Methods_and_Encapsulation;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	        DoClass doi = new DoClass(100); // line n4
	        doi.method1(100);
	        doi.method2(100);
	    

	}

}
interface DoInterface {
	 
    void method1(int n1); // line n1
}

class DoClass implements DoInterface {
	 
    public DoClass(int p1) {
    }
 
    public void method1(int p1) {} // line n2
 
    public void method2(int p1) {} // line n3
}
/*
DoInterface.java
package p1;
 
public interface DoInterface {
 
    void method1(int n1); // line n1
}

Test.java
package p3;
 
import p1.DoInterface;
 
class DoClass implements DoInterface {
 
    public DoClass(int p1) {
    }
 
    public void method1(int p1) {} // line n2
 
    private void method2(int p1) {} // line n3
}
 
public class Test {
 
    public static void main(String[] args) {
        DoClass doi = new DoClass(100); // line n4
        doi.method1(100);
        doi.method2(100);
    }
}

Which change will enable the code to compile?

A. Adding the public modifier to the declaration of method1 at line n1
B. Removing the public modifier from the definition of method1 at line n2
C. Changing the private modifier on the declaration of method 2 public at line n3
D. Changing the line n4 DoClass doi = new DoClass();

Ans is C
*/