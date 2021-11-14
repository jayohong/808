package ch7_Working_with_Inheritance;

public class ex4 extends Mid{

	public static void main(String[] args) {
		
		 int n1 = 22, n2 = 2;
	       //ex4 e=new ex4();
		 //Mid e=new ex4();
	       //Mid e =new ex4();
	     
	       int n3=ex4.findMid(n1, n2);
		 
		 
	        System.out.print(n3);
	}

}
class Mid {
	 
    static public int findMid(int n1, int n2) {
        return (n1 + n2) / 2;
    }
}
/*
Given:

class Mid {
 
    public int findMid(int n1, int n2) {
        return (n1 + n2) / 2;
    }
}
 
public class Calc extends Mid {
 
    public static void main(String[] args) {
        int n1 = 22, n2 = 2;
        // insert code here
        System.out.print(n3);
    }
}
Which two code fragments, when inserted at // insert code here, enable the code to compile and print 12?

A.

Calc c = new Calc();
int n3 = c.findMid(n1, n2);
B.

int n3 = super.findMid(n1, n3);
C.

Calc c = new Mid();
int n3 = c.findMid(n1, n2);
D.

Mid m1 = new Calc();
int n3 = m1.findMid(n1, n2);
E.

int n3 = Calc.findMid(n1, n2);


my ans is AD
B:
C:錯在父類別不能轉型子類別
E:除非是static method不然不能這樣用
*/