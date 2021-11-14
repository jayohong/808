package ch2_Working_With_Java_Data_Types;

public class ex26_attention {
	public static void main(String[] args){
        int sum = 0;
        
        for (int x = 0; x <= 10; x++)//line 5
            sum += x;
        //System.out.print("Sum for 0 to" + x);//line 7
        System.out.print(" = " + sum);
    }

}
/*
Given:

public class Whizlabs{
    public static void main(String[] args){
        int sum = 0;
        
        for (int x = 0; x <= 10; x++)//line 5
            sum += x;
        System.out.print("Sum for 0 to" + x);//line 7
        System.out.print(" = " + sum);
    }
}
Which is true?

A.

Sum for 0 to 0 = 55

B.

Sum for 0 to 10 = 55

C. Compilation fails due to error on line 6.
D. Compilation fails due to error on line 7.
E. An Exception is thrown at the runtime.


ans is D
區域變數x生命週期問題
note line6編譯會過 雖然for迴圈沒有大括號 但只有一行的寫法是OK的
*/