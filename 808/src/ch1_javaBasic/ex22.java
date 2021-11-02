package ch1_javaBasic;

public class ex22 {

	public static void main(String[] args) {
		

	}

}
/*
Given:

public class ColorTest {
 
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
        int count = 0;
        for (String c : colors) {
            if (count >= 4) {
                break;
            } else {
                continue;
            }
            if (c.length() >= 4) {
                colors[count] = c.substring(0, 3);
            }
            count++;
        }
        System.out.println(colors[count]);
    }
}
What is the result?

A.

Yellow

B.

Maroon

C. Compilation fails
D. A StringIndexOutOfBoundsException is thrown at runtime.



*/