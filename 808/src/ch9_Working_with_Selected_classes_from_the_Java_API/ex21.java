package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex21 {

	public static void main(String[] args) {
		  String ta = "A ";
		    ta = ta.concat("B ");//ta=AB
		    String tb = "C ";
		    ta = ta.concat(tb);//ta=ABC
		    ta.replace('C', 'D');
		    ta = ta.concat(tb);//ta=ABCC
		    System.out.println(ta);

	}

}
/*
Given:
public static void main(String[] args) {
    String ta = "A ";
    ta = ta.concat("B ");
    String tb = "C ";
    ta = ta.concat(tb);
    ta.replace('C', 'D');
    ta = ta.concat(tb);
    System.out.println(ta);
}
What is the result?

A.

A B C D

B.

A C D

C.

A B C

D.

A B D

E.

A B D C

F.

A B C C



*/