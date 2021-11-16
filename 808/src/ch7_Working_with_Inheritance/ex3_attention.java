package ch7_Working_with_Inheritance;

public class ex3_attention {
	static String args[] = {"lazy", "lion", "is", "always"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(args[1] + " " + args[2] + " " + args[3] + " jumping");
	}

}
/*
Given:

class Jump {
 
    static String args[] = {"lazy", "lion", "is", "always"};
 
    public static void main(String[] args) {
        System.out.println(args[1] + " " + args[2] + " " + args[3] + " jumping");
    }
}
And the commands:

javac Jump.java
java Jump crazy elephant is always

What is the result?

A.

lazy lion is jumping

B.

lion is always jumping

C.

crazy elephant is jumping

D.

elephant is always jumping

E. Compilation fails






Ans is D

題目執行的指令會編譯「Jump.java」，由於Jump類別有用public修飾，因此預設會執行Jump類別的main方法，
並把「crazy elephant is always」作為main的參數。參數的索引值從0開始。
main方法的args參數會遮蔽(shadow)掉Jump類別的args類別(靜態)變數。因此會輸出「elephant is always jumping」。



*/