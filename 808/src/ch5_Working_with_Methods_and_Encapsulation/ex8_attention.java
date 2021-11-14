package ch5_Working_with_Methods_and_Encapsulation;

public class ex8_attention {
	int x,y,z;
	void method1(int x,int y,int z) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex8_attention obj= new ex8_attention();
		obj.method1(10,20,30);
	}

}
/*

A method is declared to take three arguments.
A program calls this method and passes only two arguments. What is the results?

A. Compilation fails.
B. The third argument is given the value null.
C. The third argument is given the value void.
D. The third argument is given the value zero.
E. The third argument is given the appropriate falsy value for its declared type. 
F) An exception occurs when the method attempts to access the third argument.


Ans is A
*/