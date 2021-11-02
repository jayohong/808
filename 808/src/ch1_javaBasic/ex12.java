package ch1_javaBasic;

public class ex12 {
	 private int x = 0;
	    private int y = 0;
	 
	    public static void main(String[] args) {
	        ex12 accApp = new ex12();
	        accApp.printThis(1, 2);
	        accApp.printThat(3, 4);
	    }
	 
	    public void printThis(int x, int y) {
	        x = x;
	        y = y;
	        System.out.println("x:" + this.x + " y:" + this.y);
	    }
	 
	    public void printThat(int x, int y) {
	        this.x = x;
	        this.y = y;
	        System.out.println("x:" + this.x + " y:" + this.y);
	    }
	 

}


/*
Given:

public class Access {
 
    private int x = 0;
    private int y = 0;
 
    public static void main(String[] args) {
        Access accApp = new Access();
        accApp.printThis(1, 2);
        accApp.printThat(3, 4);
    }
 
    public void printThis(int x, int y) {
        x = x;
        y = y;
        System.out.println("x:" + this.x + " y:" + this.y);
    }
 
    public void printThat(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x:" + this.x + " y:" + this.y);
    }
}

What is the result?

A.

x:1 y:2
x:3 y:4

B.

x:0 y:0
x:3 y:4

C.

x:1 y:2
x:0 y:0

D.

x:0 y:0
x:0 y:0


*/