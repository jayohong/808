package ch2_Working_With_Java_Data_Types;

public class ex15 {

	public static void main(String[] args) {
	    int x = 5;
	    while (isAvailable(x)) {
	        System.out.print(x);
	 		x--;
	    }
	}
	 
	public static boolean isAvailable(int x) {
	    return x-- > 0 ? true : false;
	}

}
/*
Given the code fragment:

public static void main(String[] args) {
    int x = 5;
    while (isAvailable(x)) {
        System.out.print(x);
 		//line 7
    }
}
 
public static boolean isAvailable(int x) {
    return x-- > 0 ? true : false;
}
Which modification enables the code to print 54321?

A. Replace line 6 with System.out.print(--x);
B. At line 7, insert x--;
C. Replace line 6 with --x; and, at line 7, insert System.out.print(x);
D. Replace line 12 With return (x > 0) ? false : true;




*/