package ch4_Using_Loop_Constructs;

public class ex16_attention {

	public static void doSum(Integer X, Integer Y) {
        System.out.println("Integer sum is " + (X + Y));
    }
 
    public static void doSum(double x, double Y) {
        System.out.println("double sum is " + (x + Y));
    }
    
//    public static void doSum(Double x, Double Y) {
//    	System.out.println("Double sum is " + (x + Y));
//    }
 
    public static void doSum(float x, float Y) {
        System.out.println("float sum is " + (x + Y));
    }
 
  public static void doSum(int x, int Y) {
        System.out.println("int sum is " + (x + Y));
    }
 
    public static void main(String[] args) {
        
    	
    	doSum(10, 20);
        doSum(10.0, 20.0);
    }

}
/*
Given:
public class SumTest {
 
    public static void doSum(Integer X, Integer Y) {
        System.out.println("Integer sum is " + (X + Y));
    }
 
    public static void doSum(double x, double Y) {
        System.out.println("double sum is " + (x + Y));
    }
 
    public static void doSum(float x, float Y) {
        System.out.println("float sum is " + (x + Y));
    }
 
    public static void doSum(int x, int Y) {
        System.out.println("int sum is " + (x + Y));
    }
 
    public static void main(String[] args) {
        doSum(10, 20);
        doSum(10.0, 20.0);
    }
}
What is the result?

A.

int sum is 30
float sum is 30.0

B.

int sum is 30
double sum is 30.0

C.

Integer sum is 30
double sum is 30.0

D.

Integer sum is 30
float sum is 30.0


Ans is B
數值部份會先找"基本類型"所以會找到doSum(int x,int y)這組
那把這組拿掉會找到doSum(Integer x,Integer y)這組嗎?
答案是不會!!他會找到float這組

*/