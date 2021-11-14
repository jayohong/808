package ch4_Using_Loop_Constructs;

public class ex14 {

	public static void main(String[] args) {
		 int[] array = {1, 2, 3};
	        for (;;) {
	        }

	}

}
/*
Given the code fragment:

public class ForTest {
 
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        for (foo) {
        }
    }
}
Which three code fragments, when replaced individually for foo, enables the program to compile?

A. ; ;
B.  i = 0; i < 1;
C. int i : array 
D. ; i < 1; i++
E. int i = 0; i < 1;


Ans is A C E
for迴圈()內東西並非必要存在項目
B錯在i沒有宣告
D錯在i沒有宣告

*/