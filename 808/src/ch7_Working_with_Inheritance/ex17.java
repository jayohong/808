package ch7_Working_with_Inheritance;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface CanFly {
	 
    String type = "A";
 
    void fly();
 
    default String getType() {
        return type;
    }

}

/*
Which of the following can fill in the blank in this code to make it compile?

interface CanFly {
 
    String type = "A";
 
    void fly();
 
    ______ String getType() {
        return type;
    }
}
A. abstract
B. public
C. default
D. It will not compile with any as interfaces cannot have non abstract methods.
E. It will compile without filling the blank.


Ans is C
*/