package ch2_Working_With_Java_Data_Types;

public class ex12 {

	 private boolean flag;
	 
	    public void displaySeries() {
	        int num = 2;
	        System.out.println(flag);
	        while (flag) {
	            if (num % 7 == 0) {
	                flag = false;
	            }
	            System.out.print(num);
	            num += 2;
	        }
	    }
	 
	    public static void main(String[] args) {
	        new ex12().displaySeries();
	    }

}
/*
public class Series {
 
    private boolean flag;
 
    public void displaySeries() {
        int num = 2;
        while (flag) {
            if (num % 7 == 0) {
                flag = false;
            }
            System.out.print(num);
            num += 2;
        }
    }
 
    public static void main(String[] args) {
        new Series().displaySeries();
    }
}
What is the result?

A.

2 4 6 8 10 12

B.

2 4 6 8 10 12 14

C. Compilation fails
D. The program prints multiple of 2 infinite times
E. The program prints nothing



Ans is E

note:
boolean初始值是false
所以並沒有進入while迴圈

*/