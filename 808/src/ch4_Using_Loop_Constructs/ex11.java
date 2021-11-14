package ch4_Using_Loop_Constructs;

public class ex11 {

	public static void main(final String[] args) {
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


Ans is  C
final 在 main方法是可行的 他代表main方法 無法被修改
final 在class 代表該class無法被繼承
final 在method代表該方法無法被修改(override)
final 再變數 代表該變數為常數
*/