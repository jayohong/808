package ch7_Working_with_Inheritance;

public class ex1_attention {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
}
/*
Given the code fragment:
abstract class Planet {
 
    protected void revolve() { // line n1
 
    }
 
    abstract void rotate(); // line n2
}
 
class Earth extends Planet {
 
    void revolve() { // line n3
 
    }
 
    protected void rotate() { // line n4
 
    }
}

Which two modifications, made independently, enable the code to compile?

A. Make the method at line n1 public.
B. Make the method at line n2 public.
C. Make the method at line n3 public.
D. Make the method at line n3 protected.
E. Make the method at line n4 public.


Ans is CD
此題考的是子類別繼承後 override方法權限必須高於或等於父類別
*/