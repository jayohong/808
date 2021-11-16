package ch6_Creating_and_Using_Arrays;

public class ex13_attention {

	public static void main(String[] args) {
		String shirts[][] = new String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";
		for (int index = 0; index < 2;) {
		    for (int idx = 0; idx < 2;) {
		        System.out.print(shirts[index][idx] + ":");
		        idx++;
		    }
		    index++;
		}
	}

}
/*
Given the code fragment:

String shirts[][] = new String[2][2];
shirts[0][0] = "red";
shirts[0][1] = "blue";
shirts[1][0] = "small";
shirts[1][1] = "medium";
Which code fragment prints red:blue:small:medium:?

A.

for (int index = 1; index < 2; index++) {
    for (int idx = 1; idx < 2; idx++) {
        System.out.print(shirts[index][idx] + ":");
    }
}
B.

for (int index = 0; index < 2; index++) {
    for (int idx = 0; idx < index; idx++) {
        System.out.print(shirts[index][idx] + ":");
    }
}
C.

for (String sizes : shirts) {
    for (String s : sizes) {
        System.out.print(s + ":");
    }
}
D.

for (int index = 0; index < 2;) {
    for (int idx = 0; idx < 2;) {
        System.out.print(shirts[index][idx] + ":");
        idx++;
    }
    index++;
}



Ans is D
B有陷阱 idx<2才對
*/