package ch7_Working_with_Inheritance;

public class ex11_attention {

	public static void main(String[] args) {
		// C c = new C();
//		A a = new A();
//		System.out.println("");
//		B b = new B();
//		System.out.println("");
		C c = new C();
	}

}

class A {

	public A() {//------1
		System.out.print("A ");
	}
}

class B extends A {

	
	public B() {//-------2
		super();
		System.out.print("B ");
	}
}

class C extends B {

	public C() {//---------3
		super();
		System.out.print("C ");
	}

}
/*
 * class A {
 * 
 * public A() { System.out.print("A "); } }
 * 
 * class B extends A {
 * 
 * public B() { System.out.print("B "); } }
 * 
 * class C extends B {
 * 
 * public C() { System.out.print("C "); }
 * 
 * public static void main(String[] args) { C c = new C(); } } What is the
 * result?
 * 
 * A.
 * 
 * C B A
 * 
 * B.
 * 
 * C
 * 
 * C.
 * 
 * A B C
 * 
 * D. Compilation fails at line n1 and line n2
 * 
 * 
 * 
 * 
 *Ans is C
 * 子類別的建構式會自動繼承父類別的建構式內容 super雖然沒寫但存在
 * 執行時會從最前面的父類別執行起
 */