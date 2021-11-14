package ch3_Using_Operators_and_Decision_Constructs;

public class ex3 {
	int num;
    public static void graceMarks(ex3 obj4) {
        obj4.num += 5;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ex3 ob1 = new ex3();
        ex3 ob2 = ob1;
        ex3 ob3 = null;
        ob2.num = 60;
        graceMarks(ob2);
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob3);
       
	}

}
/*
Given:

public class MarkList {
 
    int num;
 
    public static void graceMarks(MarkList obj4) {
        obj4.num += 5;
    }
 
    public static void main(String[] args) {
        MarkList ob1 = new MarkList();
        MarkList ob2 = obj1;
        MarkList ob3 = null;
        obj2.num = 60;
        graceMarks(obj2);
    }
}
How many objects are created in the memory runtime?

A. 4
B. 3
C. 1
D. 2


Ans is C

*/