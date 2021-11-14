package ch2_Working_With_Java_Data_Types;

public class ex9 {

	 static double dvalue;
	 static ex9 ref;
	 int i;
	    public static void main(String[] args) {
	        System.out.println(ref);
	        System.out.println(dvalue);
	        
	        ex9 e= new ex9();
	        System.out.println(e.i);
	    }

}

/*
Given:

package p1;
 
public class Test {
 
    static double dvalue;
    static Test ref;
 
    public static void main(String[] args) {
        System.out.println(ref);
        System.out.println(dvalue);
    }
}
What is the result?

A.
p1.Test.class
0.0

B
0.000000

C.
null
0.0

D. Compilation fails
E. A NullPointerException is thrown at runtime


Ans: C
這題考的是static變數沒給值的時候的初始狀態 物件初始是null 基本型態數字類型初始是0 boolean則是false
需注意 是static變數才有初始值 一般field的初始化則是在建立物件的時候
 */
