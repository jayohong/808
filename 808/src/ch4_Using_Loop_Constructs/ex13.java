package ch4_Using_Loop_Constructs;

public class ex13 {
	
	static boolean bVar;//false
	 
    public static void main(String[] args) {
 
        boolean bVar1 = true;
        int count = 8;
        System.out.println(bVar);
        do {
            System.out.println("Hello Java! " + count);
            if (count >= 7) {
                bVar1 = false;
            }
        } while (bVar != bVar1 && count > 4);
        count -= 2;
    }
   
    	
        
   

}
/*
Given:

public class Test {
 
    static boolean bVar;
 
    public static void main(String[] args) {
 
        boolean bVar1 = true;
        int count = 8;
        do {
            System.out.println("Hello Java! " + count);
            if (count >= 7) {
                bVar1 = false;
            }
        } while (bVar != bVar1 && count > 4);
        count -= 2;
    }
}
What is the result?

A.

Hello Java! 8
Hello Java! 6
Hello Java! 4

B.

Hello Java! 8
Hello Java! 6

C.

Hello Java! 8

D. Compilation fails



*/