package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex26 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
        String str1 = sb1.toString();
        String str2 = str1;
        System.out.print(str1 == str2);

	}

}
/*
Given the code fragment:

public class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        String str1 = sb1.toString();
        // insert code here
        System.out.print(str1 == str2);
    }
}
Which code fragment, when inserted at line 9, enables the code to print true?

A.

String str2 = str1;
B.

String str2 = new String(str1);
C.

String str2 = sb1.toString();
D.

String str2 = "Duke";

*/