package ch4_Using_Loop_Constructs;

public class ex5 {

	public static void main(String[] args) {
		for (int ii = 0; ii < 3; ii++) {
		    int count = 0;
		    for (int jj = 3; jj > 0; jj--) {
		        if (ii == jj) {
		            ++count;
		            break;
		        }
		    }
		    System.out.print(count);
		    continue;
		}

	}

}
/*
Given the code fragment:

for (int ii = 0; ii < 3; ii++) {
    int count = 0;
    for (int jj = 3; jj > 0; jj--) {
        if (ii == jj) {
            ++count;
            break;
        }
    }
    System.out.print(count);
    continue;
}


What is the result?

A

011

B.

012

C.

123

D.

000



*/