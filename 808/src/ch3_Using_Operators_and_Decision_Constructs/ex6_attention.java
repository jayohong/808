package ch3_Using_Operators_and_Decision_Constructs;

public class ex6_attention {

	public static void main(String[] args) {
		 Boolean[] bool = new Boolean[2];
		 
	        bool[0] = new Boolean(Boolean.parseBoolean("true"));
	        bool[1] = new Boolean("kdfkdfgkd");
	 
	        System.out.println(bool[0] + " " + bool[1]);

	}

}
/*
Given:

public class App {
 
    public static void main(String[] args) {
        Boolean[] bool = new Boolean[2];
 
        bool[0] = new Boolean(Boolean.parseBoolean("true"));
        bool[1] = new Boolean(null);
 
        System.out.println(bool[0] + " " + bool[1]);
    }
}

What is the result?

A.

true false

B.

true null

C. Compilation fails
D. A NullPointerException is thrown at runtime




Ans is A

根據java 8 api對Boolean建構式說明 當引數是String時
Allocates a Boolean object representing the value true if the string argument is not null 
and is equal, ignoring case, to the string "true".
簡單說只要不是(無視大小寫)"true" 就回傳false
*/