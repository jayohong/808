package ch5_Working_with_Methods_and_Encapsulation;

public class ex20 extends Root{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Root r = new ex20();
		//System.out.println(r.method1()); // line n1
        System.out.println(r.method2()); // line n2
		
	}

}
class Root {
	 
    private static final int MAX = 20000;
 
    private int method1() {
        int a = 100 + MAX;  // line n3
        return a;
    }
 
    protected int method2() {
        int a = 200 + MAX;  // line n4
        return a;
    }
}
/*

public class TestA extends Root {
 
    public static void main(String[] args) {
        Root r = new TestA();
        System.out.println(r.method1()); // line n1
        System.out.println(r.method2()); // line n2
    }
}
 
class Root {
 
    private static final int MAX = 20000;
 
    private int method1() {
        int a = 100 + MAX;  // line n3
        return a;
    }
 
    protected int method2() {
        int a = 200 + MAX;  // line n4
        return a;
    }
}
Which line causes a compilation error?

A. Line n1
B. Line n2
C. Line n3
D. Line n4


Ans is A
*/