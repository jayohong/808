package ch5_Working_with_Methods_and_Encapsulation;

public class ex13 {

	public static void main(String[] args) {
        int var1 = 200;
        System.out.print(doCalc(var1));
        System.out.print(" " + var1);
    }
 
    static int doCalc(int var1) {
        var1 = var1 * 2;
        return var1;
    }
 
    
 
    

}
/*
Given:

public class TestScope {
 
    public static void main(String[] args) {
        int var1 = 200;
        System.out.print(doCalc(var1));
        System.out.print(" " + var1);
    }
 
    static int doCalc(int var1) {
        var1 = var1 * 2;
        return var1;
    }
}
What is the result?

A.

400 200

B.

200 200

C.

400 400

D. Compilation fails.


Ans is A
區域變數生命週期問題
var1 與 doCalc(var1)裡運算的var1不相同
*/