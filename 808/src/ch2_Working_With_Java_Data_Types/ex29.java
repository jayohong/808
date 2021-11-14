package ch2_Working_With_Java_Data_Types;

public class ex29 {

	 private int i;
	 
	    void disp() {
	        while (i <= 5) {
	            for (int i = 1; i <= 5;) {
	                System.out.print(i + " ");
	                i++;
	            }
	            System.out.println();
	            i++;
	        }
	    }
	 
	    public static void main(String[] args) {
	        new ex29().disp();
	    }

}
/*
Given:

public class Natural {
 
    private int i;
 
    void disp() {
        while (i <= 5) {
            for (int i = 1; i <= 5;) {
                System.out.print(i + " ");
                i++;
            }
            i++;
        }
    }
 
    public static void main(String[] args) {
        new Natural().disp();
    }
}
What is the result?

A. Prints 1 2 3 4 5 once
B. Prints 1 3 5 once
C. Prints 1 2 3 4 5 five times
D. Prints 1 2 3 4 5 six times
E. Compilation fails



Ans is D
note 
初始值是0
for迴圈的i是區域變數與物件的i不是同一個
需注意 for迴圈內也不一定都是區域變數 需依照題意去判斷
*/