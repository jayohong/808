package ch1_javaBasic;

public class ex32 {

	public static void main(String[] args) {
		 String opt = "true";//line 5
		    switch (opt) {// char ,int,short,byte,String
		        case "true"://line 7
		            System.out.print("True");
		            break;
		        default:
		            System.out.print("***");
		    }
		    System.out.println("Done");
		

	}

}
/*
Given the code fragment:
public static void main(String[] args) {
    boolean opt = true;//line 5
    switch (opt) {
        case true://line 7
            System.out.print("True");
            break;
        default:
            System.out.print("***");
    }
    System.out.println("Done");
}
Which modification enables the code fragment to print TrueDone?

A. 
Replace line 5 With String result = "true";
Replace line 7 with case "true":

B. 
Replace line 5 with boolean opt = 1;
Replace line 7 with case 1:

C. At line 9, remove the break statement.
D. Remove the default section.


Ans is A

note:
switch允許類型 char int short byte String
*/