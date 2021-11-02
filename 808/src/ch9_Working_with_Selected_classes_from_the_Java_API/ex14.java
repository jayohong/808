package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex14 {

	public static void main(String[] args) {
		String str1 = "Java";
        String str2 = new String("java");
        String str3 = str2;
        if (str1.toLowerCase() == str2.toLowerCase())
        {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

	}

}
/*
Given the code fragment:

public class App {
 
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
        //line n1
        {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
Which code fragment, when inserted at line n1, enables the App class to print Equal?

A.

String str3 = str2;
if (str1 == str3)
B.

if (str1.equalsIgnoreCase(str2))
C.

String str3 = str2;
if (str1.equals(str3))
D.

if (str1.toLowerCase() == str2.toLowerCase())



*/