package ch1_javaBasic;


public class ex13 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*
Given the content of three files:

A.java  
public class A {
 
    public void a() {
    }
    int a;
}
B.java   
public class B {
 
    private int doStuff(){
        private int x = 100;
        return x++;
    }
} 
C.java  
import java.io.*;
package p1;
 
class C {
 
    public void main(String fileName) throws IOException {
    }
}

Which statement is true?

A. Only the A.java file compiles successfully.
B. Only the B.java file compiles successfully.
C. Only the C.java file compiles successfully.
D. The A.Java and B.java files compile successfully.
E. The B.java and C.java files compile successfully.
F. The A.Java and C.java files compile successfully.


Ans is A
B: private protected publiccs等存取修飾詞只能用在類別或是物件的欄位和方法，並不能用在區域變數。
C: 檔案會編譯失敗，因為「package」只能在所有程式敘述的最上方。
*/