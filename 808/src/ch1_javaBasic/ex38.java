package ch1_javaBasic;

public class ex38 {

	public static void main(String[] args) {
		 System.out.println("Hello " + new StringBuilder("Java SE 8"));
	        System.out.println("Hello " + new MyString("Java SE 8"));

	}

}
class MyString {
	 
    String msg;
 
    MyString(String msg) {
        this.msg = msg;
    }
}
/*
Given the definitions of the MyString class and the Test class:

MyString.java
package p1;
 
class MyString {
 
    String msg;
 
    MyString(String msg) {
        this.msg = msg;
    }
}
Test.java
package p1;
 
public class Test {
 
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8"));
    }
}
What is the result?

A.

Hello Java SE 8
Hello Java SE 8

B.

Hello java.lang.StringBuilder@<<hashcode1>>
Hello p1.MyString@<<hashcode2>>

C.

Hello Java SE 8
Hello p1.MyString@<<hashcode>>

D.

Compilation fails at the Test class.



Ans is C
note:
new StringBuilder("Java SE 8")比較特別
它並不會產生物件,而會是一個字串

*/