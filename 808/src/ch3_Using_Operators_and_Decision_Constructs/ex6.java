package ch3_Using_Operators_and_Decision_Constructs;

public class ex6 {

	public static void main(String[] args) {
		 Boolean[] bool = new Boolean[2];
		 
	        bool[0] = new Boolean(Boolean.parseBoolean("true"));
	        bool[1] = new Boolean("kdfkdfgkd");
	 
	        System.out.println(bool[0] + " " + bool[1]);

	}

}
/*
Given:

public class App {
 
    public static void main(String[] args) {
        Boolean[] bool = new Boolean[2];
 
        bool[0] = new Boolean(Boolean.parseBoolean("true"));
        bool[1] = new Boolean(null);
 
        System.out.println(bool[0] + " " + bool[1]);
    }
}

What is the result?

A.

true false

B.

true null

C. Compilation fails
D. A NullPointerException is thrown at runtime



*/