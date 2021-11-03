package ch1_javaBasic;
//Ans: C

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given:

MainTest.java
public class MainTest {    //方法多載
 
    public static void main(int[] args) {
        System.out.println("int main " + args[0]);
    }
 
    public static void main(Object[] args) {
        System.out.println("Object main " + args[0]);
    }
 
    public static void main(String[] args) {     //main方法引數必須是string
        System.out.println("String main " + args[0]);
    }
}
and commands:

javac MainTest.java
java MainTest 1 2 3

What is the result?


A.

int main 1

B.

Object main 1

C.

String main 1

D. Compilation fails
E. An exception is thrown at runtime


*/