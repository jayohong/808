package ch6_Creating_and_Using_Arrays;

public class ex24 {

	public static void main(String[] args) {
		int iArray[] = {65, 68, 69};
	    iArray[2] = iArray[0];//65,68,65
	    iArray[0] = iArray[1];//68,68,65
	    iArray[1] = iArray[2];//68,65,65
	    for (int element : iArray) {
	        System.out.print(element + " ");
	    }

	}

}
/*
Given the code fragment:

public static void main(String[] args) {
    int iArray[] = {65, 68, 69};
    iArray[2] = iArray[0];
    iArray[0] = iArray[1];
    iArray[1] = iArray[2];
    for (int element : iArray) {
        System.out.print(element + " ");
    }
}
A.

68, 65, 69

B.

68, 65, 65

C.

65, 68, 65

D.

65, 68, 69

E. Compilation fails



Ans is B
*/