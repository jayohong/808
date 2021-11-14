package ch4_Using_Loop_Constructs;

public class ex10 {

	public static void main(String[] args) {
		String color = "teal";
		 
		switch (color) {
		    case "Red":
		        System.out.println("Found Red");
		    case "Blue":
		        System.out.println("Found Blue");
		        break;
		    case "Teal":
		        System.out.println("Found Teal");
		        break;
		    default:
		        System.out.println("Found Default");
		}
		

	}

}
/*
Given the code fragment:

String color = "teal";
 
switch (color) {
    case "Red":
        System.out.println("Found Red");
    case "Blue":
        System.out.println("Found Blue");
        break;
    case "Teal":
        System.out.println("Found Teal");
        break;
    default:
        System.out.println("Found Default");
}
What is the result?

A.

Found Red
Found Default

B.

Found Teal

C.

Found Red
Found Blue
Found Teal

D.

Found Red
Found Blue
Found Teal
Found Default

E.

Found Default


Ans is E
*/