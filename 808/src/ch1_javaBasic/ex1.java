package ch1_javaBasic;
/*
 ANS:B
 1. default不放在最後面也是可以編譯成功的 
 2. 若沒有使用break,一但條件符合會從該節點一直執行下去
 3. 若條件都不符合,則會從default開始執行
 */

public class ex1 {

	public static void main(String[] args) {
		 String s = "A";
		 
	        switch (s) {
	            case "a":
	                System.out.println("simaple A ");
	            default:
	                System.out.print("default ");
	            case "A":
	                System.out.print("Capital A ");
	            
	        }
		
		
	}
}

/*
 Given:

public class Whizlabs {
 
    public static void main(String[] args) {
        String s = "A";
 
        switch (s) {
            case "a":
                System.out.println("simaple A ");
            default:
                System.out.print("default ");
            case "A":
                System.out.print("Capital A ");
        }
    }
}

What is the result?

A.

simaple A

B.

Capital A

C.

simaple A default Capital A

D.

simaple A default

E. Compilation fails.
 
 
 
 
 */
