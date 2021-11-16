package ch5_Working_with_Methods_and_Encapsulation;


public class ex1_attention {

	public static void main(String[] args) {
		
	}

}

/*
Given:
class Base {
    // insert code here
}
 
public class Derived extends Base {
 
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.setNum(3);
        System.out.println("Square = " + obj.getNum() * obj.getNum());
    }
}
Which two options, when inserted independently inside class Base, ensure that the class is being properly encapsulated and allow the program to execute and print the square of the number?

A.

private int num;
 
public int getNum() {
    return num;
}
 
public void setNum(int num) {
    this.num = num;
}
B.

public int num;
 
protected public int getNum() {
    return num;
}
 
protected public void setNum(int num) {
    this.num = num;
}
C.

private int num;
 
public int getNum() {
    return num;
}
 
private void setNum(int num) {
    this.num = num;
}
D.

protected int num;
 
public int getNum() {
    return num;
}
 
public void setNum(int num) {
    this.num = num;
}
E.

protected int num;
 
private int getNum() {
    return num;
}
 
public void setNum(int num) {
    this.num = num;
}

Ans is  AD (D有一個前提 在不同的package沒有繼承關西時才看得protected效果)
//public作用範圍    同一類別 同一套件(資料夾) 不同套件的子類別(繼承) 不同套件且非子類別
//protected作用範圍 同一類別 同一套件(資料夾) 不同套件的子類別(繼承)
//"預設"作用範圍     同一類別 同一套件(資料夾) 
//private作用範圍   同一類別 

*/