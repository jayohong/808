package ch4_Using_Loop_Constructs;

public class ex15_attention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class CD {
	 
    int r;
 
    CD(int r) {
        this.r = r;
 
    }
}
 
class DVD extends CD {
 
    int c;
 
    DVD(int r, int c) {
    	super(r);
    	this.c=c;//this(c);
       
    }
   
}
/*
Given:

class CD {
 
    int r;
 
    CD(int r) {
        this.r = r;
 
    }
}
 
class DVD extends CD {
 
    int c;
 
    DVD(int r, int c) {
        // line n1
    }
}
And given the code fragment:

DVD dvd = new DVD(10, 20);
Which code fragment should you use at line n1 to instantiate the dvd object successfully?

A.

super.r = r;
this.c = c;
B.

super(r);
this(c);

C.

super(r);
this.c = c;

D.

this.c = r;
super(c);


Ans is C
A錯在沒有super.r的用法
B錯兩個地方要用this(c)需要先建立一個引數的建構式,且super()跟this()都必須擺第一行
D錯在super(c)要在第一行
*/