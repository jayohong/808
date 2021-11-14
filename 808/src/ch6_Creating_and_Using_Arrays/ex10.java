package ch6_Creating_and_Using_Arrays;

public class ex10 {

	public static void main(String[] args) {
		String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
		for (String c : colors) {
		    if (c.length() != 4) {
		        continue;
		    }
		    System.out.print(c + ", ");
		}

	}

}
/*
Given the code fragment:

String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
Which code fragment prints blue, cyan, ?

A.

for (String c : colors) {
    if (c.length() != 4) {
        continue;
    }
    System.out.print(c + ", ");
}
B.

for (String c : colors[]) {
    if (c.length() <= 4) {
        continue;
    }
    System.out.print(c + ", ");
}
C.

for (String c : String[] colors) {
    if (c.length() >= 4) {
        continue;
    }
    System.out.print(c + ", ");
}
D.

for (String c : colors) {
    if (c.length() >= 4) {
        System.out.print(c + ", ");
        continue;
    }
}

my ans is A
*/