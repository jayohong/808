package ch2_Working_With_Java_Data_Types;

public class ex28_attention {
	 private char var;
	 
	    public static void main(String[] args) {
	        char var1 = 'a';
	        char var2 = var1;//value-->copy
	        var2 = 'e';
	 
	        ex28_attention obj1 = new ex28_attention();
	        ex28_attention obj2 = obj1;//address--同一個
	        obj1.var = 'i';
	        obj2.var = 'o';
	        
	        System.out.println(obj1+","+obj2);
	        System.out.println(var1 + ", " + var2);
	        System.out.println(obj1.var + ", " + obj2.var);
	    }

}
/*

iven:

public class Vowel {
 
    private char var;
 
    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
 
        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';
        System.out.println(var1 + ", " + var2);
        System.out.println(obj1.var + ", " + obj2.var);
    }
}
A.

a, e
i, o

B.

a, e
o, o

C.

e, e
I, o

D.

e, e
o, o



Ans is B

題解
這裡是考Java永遠為「pass by value」的觀念。
var1和var2是基本型別變數，直接儲存資料的數值；而var是物件參考變數，儲存物件的參考(Reference)，類似記憶體位址的值。
在傳遞變數的過程中，Java只會傳遞變數的「值」。

*/