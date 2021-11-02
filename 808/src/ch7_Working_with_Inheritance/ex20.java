package ch7_Working_with_Inheritance;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given:

class Vehicle {
 
    int x;
 
    Vehicle() {
        this(10); // line n1
    }
 
    Vehicle(int x) {
        this.x = x;
    }
}
 
class Car extends Vehicle {
 
    int y;
 
    Car() {
        super();
        this(20); // line n2
    }
 
    Car(int y) {
        this.y = y;
    }
 
    public String toString() {
        return super.x + ":" + this.y;
    }
}
And given the code fragment:

Vehicle y = new Car();
System.out.println(y);
What is the result?

A.

10:20

B.

0:20

C. Compilation fails at line n1
D. Compilation fails at line n2



*/