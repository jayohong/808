package ch4_Using_Loop_Constructs;

public class ex1 {

	public static void main(String[] args) {
		 String str1 = "Java";
	        String[] str2 = {"J", "a", "v", "a"};
	        String str3 = "";
	        for (String str : str2) {
	            str3 = str3 + str;
	        }
	        boolean b1 = (str1 == str3);
	        boolean b2 = (str1.equals(str3));
	        System.out.print(b1 + ", " + b2);
		
	}

}
/*
Given:

public class Equal {
 
    public static void main(String[] args) {
        String str1 = "Java";
        String[] str2 = {"J", "a", "v", "a"};
        String str3 = "";
        for (String str : str2) {
            str3 = str3 + str;
        }
        boolean b1 = (str1 == str3);
        boolean b2 = (str1.equals(str3));
        System.out.print(b1 + ", " + b2);
    }
}


What is the result?

A.

true, false

B.

false, true

C.

true, true

D.

false, false




Ans is B
String是物件
*/