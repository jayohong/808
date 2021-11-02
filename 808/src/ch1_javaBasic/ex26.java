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




*/