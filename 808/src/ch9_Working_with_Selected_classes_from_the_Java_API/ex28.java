package ch9_Working_with_Selected_classes_from_the_Java_API;

import java.util.ArrayList;
import java.util.List;

public class ex28 {

	public static void main(String[] args) {
		List colors = new ArrayList();
	    colors.add("green");
	    colors.add("red");
	    colors.add("blue");
	    colors.add("yellow");
	    colors.remove(2);
	    colors.add(3, "cyan");
	    System.out.print(colors);

	}

}
/*

public static void main(String[] args) {
    List colors = new ArrayList();
    colors.add("green");
    colors.add("red");
    colors.add("blue");
    colors.add("yellow");
    colors.remove(2);
    colors.add(3, "cyan");
    System.out.print(colors);
}
What is the result?

A.

[green, red, yellow, cyan]

B.

[green, blue, yellow, cyan]

C.

[green, red, cyan, yellow]

D. Am IndexOutOfBoundsException is thrown at runtime



*/