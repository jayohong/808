package ch1_javaBasic;
//Ans:A

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*
Given the content of three files:

A.java  //OK
public class A {
 
    public void a() {
    }
    int a;
}
B.java   //X 封裝權限不能再method
public class B {
 
    private int doStuff(){
        private int x = 100;
        return x++;
    }
} 
C.java  //X import需要再package 跟 class 中間
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


*/