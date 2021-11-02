package ch5_Working_with_Methods_and_Encapsulation;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given:

class Caller {
 
    private void init() {
        System.out.println("Initialized");
    }
 
    public void start() {
        init();
        System.out.println("Started");
    }
}
 
public class TestCall {
 
    public static void main(String[] args) {
        Caller c = new Caller();
        c.start();
        c.init();
    }
}
What is the result?

A.

Initialized
Started

B.

Initialized
Started
Initialized

C. Compilation fails
D. An exception is thrown at runtime



*/