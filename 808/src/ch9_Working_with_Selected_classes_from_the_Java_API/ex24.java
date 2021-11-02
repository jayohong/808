package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex24 {

	public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder("1Z0");//line 3
	        sb.append("-808");//line 4
	        System.out.println(sb);

	}

}
/*
Given:

public class Whizlabs {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1Z0");//line 3
        sb.concat("-808");//line 4
        System.out.println(sb);
    }
}
What is the output?

A.

1Z0

B.

1Z0-808

C. An exception will be thrown.
D. Compilation fails due to error at line 3.
E. Compilation fails due to error at line 4.



*/