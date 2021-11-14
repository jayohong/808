package ch1_javaBasic;

public class ex26 {
	 
	 
	public static String doMsg(char x) {
        return "Good Day!";
    }
 
    public static String doMsg(int y) {
        return "Good Luck!";
    }
 
    public static void main(String[] args) {
        char x = 8;
        int z = '8';
        System.out.println(doMsg(x));
        System.out.print(doMsg(z));
    }

}
/*
public class Msg {
 
    public static String doMsg(char x) {
        return "Good Day!";
    }
 
    public static String doMsg(int y) {
        return "Good Luck!";
    }
 
    public static void main(String[] args) {
        char x = 8;
        int z = '8';
        System.out.println(doMsg(x));
        System.out.print(doMsg(z));
    }
}
What is the result?

A.

Good Day!
Good Luck!

B.

Good Day!
Good Day!

C.

Good Luck!
Good Day!

D.

Good Luck!
Good Luck!

E. Compilation fails



Ans is A

char(字元)是可以不加單引號 而int(整數)也是可以加單引號
所以不會編譯錯誤

*/