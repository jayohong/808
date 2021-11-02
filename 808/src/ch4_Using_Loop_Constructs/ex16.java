package ch4_Using_Loop_Constructs;

public class ex16 {

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




*/