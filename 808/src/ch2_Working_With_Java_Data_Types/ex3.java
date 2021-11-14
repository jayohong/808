package ch2_Working_With_Java_Data_Types;
//sAns ABC
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class ComputeSum {
	 
    public int x;
    public int y;
    public int sum;
 
    public ComputeSum(int nx, int ny) {
        x = nx;//當引數找不到x 就會找到方法外層的int x 以此類推
        y = ny;
        updateSum();
    }
 
    public void setX(int nx) {
        x = nx;
        updateSum();
    }
 
    public void setY(int ny) {
        x = ny;
        updateSum();
    }
 
    void updateSum() {
        sum = x + y;
    }
}


/*
Given:

public class ComputeSum {
 
    public int x;
    public int y;
    public int sum;
 
    public ComputeSum(int nx, int ny) {
        x = nx;
        y = ny;
        updateSum();
    }
 
    public void setX(int nx) {
        x = nx;
        updateSum();
    }
 
    public void setY(int ny) {
        x = ny;
        updateSum();
    }
 
    void updateSum() {
        sum = x + y;
    }
}


This class needs to protect an invariant(不變的) on the sum field.

Which three members must have the private access modifier to ensure that this invariant is maintained?

A. The x field
B. The y field
C. The sum field
D. The ComputerSum ( ) constructor
E. The setX ( ) method
F. The setY ( ) method


Ans is ABC

*/
