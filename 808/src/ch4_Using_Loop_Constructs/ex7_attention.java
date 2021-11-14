package ch4_Using_Loop_Constructs;

public class ex7_attention {

	public static void main(String[] args) {
		
		int row = 10;
		for (; row > 0;) {
		    int col = row;
		    while (col >= 0) {
		        System.out.print(col + " ");
		        col -= 2;
		    }
		    row = row / col;
		}
		
	
	}

}
/*
Given the code fragment:

int row = 10;
for (; row > 0;) {
    int col = row;
    while (col >= 0) {
        System.out.print(col + " ");
        col -= 2;
    }
    row = row / col;
}
What is the result?
A.

10 8 6 4 2 0

B.

10 8 6 4 2

C. AnArithmeticException is thrown at runtime
D. The program goes into an infinite loop outputting: 10 8 6 4 2 0. . .
E. Compilation fails


Ans is A

此題重點在for迴圈內的變數是field還是local variable的判斷

計算時注意:
col最後=-2不是0
所以row = row/col這行才沒有運算錯誤


*/