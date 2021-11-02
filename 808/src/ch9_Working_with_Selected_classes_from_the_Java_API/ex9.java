package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex9 {

	public static void main(String[] args) {
		 String product = "Pen";
	        product.toLowerCase();
	        product.concat(" BOX".toLowerCase());
	        System.out.print(product.substring(4, 6));

	}

}
/*
Given:
public class Case{
    public static void main(String[] args){
        String product = "Pen";
        product.toLowerCase();
        product.concat(" BOX".toLowerCase());
        System.out.print(product.substring(4, 6));
    }
}
What is the result?

A.

box

B.

nbo

C.

bo

D.

nb

E. An exception is thrown at runtime


*/