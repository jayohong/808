package ch3_Using_Operators_and_Decision_Constructs;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		A a = new A();
		B b = new B(x);
		

	}
	

}
class A{
		
	}
class B extends A{
	public B(int a) {
		super();//不寫出來也是可以
	}
}
/*
Which statement is true about the default constructor of a top-level class?

A. It can take arguments.
B. It has private access modifier in its declaration.
C. It can be overloaded.
D. The default constructor of a subclass always invokes the no-argument constructor of its superclass.



Ans is D
預設建構式是沒寫建構式系統自動產生的建構式
並不是指不代引數的建構式
雖然預設建構式確實也是不帶引數


*/