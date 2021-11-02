package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex17 {

	public static void main(String[] args) {
		 String s = "123";
	        if (s.length() > 2) {
	            s.concat("456");
	        }
	        for (int x = 0; x < 3; x++) {
	            s += "x";
	        }
	        System.out.println(s);

	}

}
/*
Given:

public class String1 {
 
    public static void main(String[] args) {
        String s = "123";
        if (s.length() > 2) {
            s.concat("456");
        }
        for (int x = 0; x < 3; x++) {
            s += "x";
        }
        System.out.println(s);
    }
}

What is the result?

A.

123

B.

123xxx

C.

123456

D.

123456xxx

E. Compilation fails


*/