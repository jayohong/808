package ch3_Using_Operators_and_Decision_Constructs;

public class ex10 {
	
	

	public static void main(String[] args) {
		Square s=new Square();
		s.foo("a");
		s.foo();
		
	}

}
class Shape {
	 
    public Shape() {
        System.out.println("Shape: constructor");
    }
 
    public void foo() {
        System.out.println("Shape: foo");
    }
}
 
class Square extends Shape {
 
    public Square() {
        super();
    }
 
    public Square(String label) {
        System.out.println("Square: constructor");
    }
 
    public void foo() {
        super.foo();
    }
 
    public void foo(String label) {
        System.out.println("Square: foo");
    }
}

/*
Given:
public class SuperTest {
 
    public static void main(String[] args) {
        // statement1
        // statement2
        // statement3
    }
}
 
class Shape {
 
    public Shape() {
        System.out.println("Shape: constructor");
    }
 
    public void foo() {
        System.out.println("Shape: foo");
    }
}
 
class Square extends Shape {
 
    public Square() {
        super();
    }
 
    public Square(String label) {
        System.out.println("Square: constructor");
    }
 
    public void foo() {
        super.foo();
    }
 
    public void foo(String label) {
        System.out.println("Square: foo");
    }
}
What should statement1, statement2, and statement3, be respectively, in order to produce the result?

Shape: constructor
Square: foo
Shape: foo

A.

Square square = new Square("bar");
square.foo("bar");
square.foo();
B.

Square square = new Square("bar");
square.foo("bar");
square.foo("bar");
C.

Square square = new Square();
square.foo();
square.foo(bar);
D.

Square square = new Square();
square.foo();
square.foo("bar");
E.

Square square = new Square();
square.foo();
square.foo();
F.

Square square = new Square();
square.foo("bar");
square.foo();

*/