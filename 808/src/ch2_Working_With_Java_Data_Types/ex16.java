package ch2_Working_With_Java_Data_Types;

public class ex16 {
	int num;
	 
    public static void graceMarks(ex16 obj4) {
        obj4.num += 10;
    }
 
    public static void main(String[] args) {
       ex16 obj1 = new ex16();
       ex16 obj2 = obj1;
        ex16 obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);
        
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        //System.out.println(obj4);
    }
	 

}
/*
Given:

public class MarkList {
 
    int num;
 
    public static void graceMarks(MarkList obj4) {
        obj4.num += 10;
    }
 
    public static void main(String[] args) {
        MarkList obj1 = new MarkList();
        MarkList obj2 = obj1;
        MarkList obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);
    }
}
How many MarkList instances are created in memory at runtime?

A. 1
B. 2
C. 3
D. 4



Ans is A
實際有new的物件數量
*/