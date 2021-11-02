package ch9_Working_with_Selected_classes_from_the_Java_API;

import java.util.ArrayList;

public class ex22 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		 
	    list.add("SE");
	    list.add("EE");
	    list.add("ME");
	    list.add("SE");
	    list.add("EE");
	 
	    list.remove("SE");
	 
	    System.out.print("Values are : " + list);
	}

}
/*
ublic static void main(String[] args){
    ArrayList<String> list = new ArrayList<>();
 
    list.add("SE");
    list.add("EE");
    list.add("ME");
    list.add("SE");
    list.add("EE");
 
    list.remove("SE");
 
    System.out.print("Values are : " + list);
}
What is the result?

A.

Values are : [EE, ME]

B.

Values are : [EE, EE, ME]

C.

Values are : [EE, ME, EE]

D.

Values are : [SE, EE, ME, EE]

E.

Values are : [EE, ME, SE, EE]


*/