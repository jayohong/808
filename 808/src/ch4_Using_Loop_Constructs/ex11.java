package ch4_Using_Loop_Constructs;

public class ex11 {

	public static void main(String[] args) {
		String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[i].length; j++) {
	           // System.out.print(arr[i][j] + " ");
	            if (arr[i][j].equals("B")) {
	                break;
	            }
	            System.out.print(arr[i][j] + " ");
	        }
	        continue;
	    }
		

	}

}
/*
Given the code fragment:

public static void main(final String[] args) throws Exception {
    String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
            if (arr[i][j].equals("B")) {
                break;
            }
        }
        continue;
    }
}
What is the result?

A.

A B C

B.

A B C D E

C.

A B D E

D. Compilation fails.




*/