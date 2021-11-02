package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex32 {

	public static void main(String[] args) {
		

	}

}
/*

Given:

public class Test3 {
 
    public static void main(String[] args) {
        String names[] = new String[3];
        names[0] = "Mary Brown";
        names[1] = "Nancy Red";
        names[2] = "Jessy Orange";
        try {
            for (String n : names) {
                try {
                    String pwd = n.substring(0, 3) + n.substring(6, 10);
                    System.out.println(pwd);
                } catch (StringIndexOutOfBoundsException sie) {
                    System.out.println("String out of limits");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of limits");
        }
    }
}
What is the result?

A.

Marrown
String out of limits
JesOran

B.

Marrown
String out of limits
Array out of limits

C.

Marrown
String out of limits

D.

Marrown
NanRed
JesOran


*/