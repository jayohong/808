package ch4_Using_Loop_Constructs;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ii =0; 
		while( ii < 2){
	            ii++;
	            System.out.println("ii = " + ii);
	        }

		
	}

}
/*
Given:

public class MyClass{
    public static void main(String[] args){
        while(int ii = 0; ii < 2){
            ii++;
            System.out.println("ii = " + ii);
        }
    }
}
What is the result?

A.

ii = 1
ii = 2

B. Compilation fails
C. The program prints nothing
D. The program goes into an infinite loop with no output
E. The program goes to an infinite loop outputting:

ii = 1
ii = 1

Ans is B
while()裡只能放判斷式 不能宣告
*/