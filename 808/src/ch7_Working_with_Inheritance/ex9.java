package ch7_Working_with_Inheritance;

public class ex9 extends Vehicle{
	String trans;
	 
    ex9(String trans) { // line n1
        this.trans = trans;
    }
 
    ex9(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        //this(trans); //line n2
    	this.trans= trans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex9 c1 = new ex9("Auto");
	    ex9 c2 = new ex9("4W", 150, "Manual");
	    System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
	    System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
	}

}
class Vehicle {
	 
    String type = "4W";
    int maxSpeed = 100;
 
    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
    Vehicle(){//line n1
    	
    }
}
/*
Given:

class Vehicle {
 
    String type = "4W";
    int maxSpeed = 100;
 
    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}
 
class Car extends Vehicle {
 
    String trans;
 
    Car(String trans) { // line n1
        this.trans = trans;
    }
 
    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        this(trans); //line n2
    }
}
And given the code fragment:

public static void main(String[] args) {
    Car c1 = new Car("Auto");
    Car c2 = new Car("4W", 150, "Manual");
    System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
    System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
}
What is the result?

A.

4W 100 Auto
4W 150 Manual

B.

null 0 Auto
4W 150 Manual

C. Compilation fails only at line n1
D. Compilation fails only at line n2
E. Compilation fails at both line n1 and line n2


my ans is A
incorrect, ans is E
note
n1錯在父類別沒有無引數建構子
n2錯在建構子引用必須放在第一行 不管是super or this, 所以一個建構式同時引用super(...) this(...)是不可能的
*/