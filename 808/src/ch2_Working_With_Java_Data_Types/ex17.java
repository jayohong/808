package ch2_Working_With_Java_Data_Types;

public class ex17 {
	 int x;
	    int y;
	 
	    public void doStuff(int x, int y) {
	        this.x = x;
	        y = this.y;
	    }
	 
	    public void display() {
	        System.out.print(x + " " + y + " : ");
	    }
	 
	    public static void main(String[] args) {
	        ex17 m1 = new ex17();
	        m1.x = 100;
	        m1.y = 200;
	        ex17 m2 = new ex17();
	        m2.doStuff(m1.x, m1.y);
	        m1.display();
	        m2.display();
	    }

	 

}
/*
Given:

public class TestField {
 
    int x;
    int y;
 
    public void doStuff(int x, int y) {
        this.x = x;
        y = this.y;
    }
 
    public void display() {
        System.out.print(x + " " + y + " : ");
    }
 
    public static void main(String[] args) {
        TestField m1 = new TestField();
        m1.x = 100;
        m1.y = 200;
        TestField m2 = new TestField();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();
    }
}
What is the result?

A.

100 200 : 100 200 :

B.

100 0 : 100 0 :

C.

100 200 : 100 0 :

D.

100 0 : 100 200 :



Ans is C
此題重點在this代表的意義
y = this.y 等同於 this.y = this.y就是沒改變
m2.y初始值是0
*/