package ch1_javaBasic;
//Ans C(0 2 4)

public class ex4 {

	public static void main(String[] args) {
		 int ii = 0;
		    int jj = 7;
		    for (ii = 0; ii < jj - 1; ii = ii + 2) {
		        System.out.print(ii + " ");
		    }
	   

	}

}
/*
Given the code fragment:

public static void main(String[] args) {
    int ii = 0;
    int jj = 7;
    for (ii = 0; ii < jj - 1; ii = ii + 2) {
        System.out.print(ii + " ");
    }
}
What is the result?

A.
2 4

B.
0 2 4 6

C.
0 2 4

D. Compilation fails


ans is C

for迴圈順序流程 
比較ii<j-1  =>  (true)執行{}內容 =>ii=ii+2 ==>重複
		  => (false)結束迴圈

*/