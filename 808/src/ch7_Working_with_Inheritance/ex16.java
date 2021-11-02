package ch7_Working_with_Inheritance;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
You are asked to develop a program for a shopping application, and you are given the following information:

1. The application must contain the classes Toy, EduToy, and consToy. The Toy class is the superclass of the other two classes.
2. The int caicuiatePrice (Toy t) method calculates the price of a toy.
3. The void printToy (Toy t) method prints the details of a toy.

Which definition of the Toy class adds a valid layer of abstraction to the class hierarchy?

A.

public abstract class Toy {
 
    public abstract int calculatePrice(Toy t);
 
    public void printToy(Toy t) {  code goes here }
}
B.

public abstract class Toy {
 
    public int calculatePrice(Toy t);
 
    public void printToy(Toy t);
}
C.

public abstract class Toy {
 
    public int calculatePrice(Toy t);
 
    public final void printToy(Toy t) {  code goes here  }
}
D.

public abstract class Toy {
 
    public abstract int calculatePrice(Toy t) {  code goes here  }
 
    public abstract void printToy(Toy t) { code goes here  }
}



*/