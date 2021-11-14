package ch2_Working_With_Java_Data_Types;

public class ex20 {

	 int fvar;
	 static int cvar;
	 
	    public static void main(String[] args) {
	        ex20 t= new ex20();
	        t.fvar=200;
	        ex20.cvar=20;
	        t.cvar=20;
	        cvar=20;
	       
	       
	    }

}
/*
Given the code fragment

class Test2 {
 
    int fvar;
    static int cvar;
 
    public static void main(String[] args) {
        Test2 t = new Test2();
        // insert code here to write field variables
    }
}
Which code fragments, inserted independently, enable the code compile?

A.
t.fvar = 200;

B.
cvar = 400;

C.
fvar = 200;
cvar = 400;

D.
this.fvar = 200;
this.cvar = 400;

E.
t.fvar = 200;
Test2.cvar = 400;

F.
this.fvar = 200;
Test2.cvar = 400;



Ans is  A B E
note 靜態變數可直接用class名呼叫 在同一個class可直接呼叫
field則須建立物件才可呼叫
this通常是搭配建構式使用 非物件
*/