package ch4_Using_Loop_Constructs;

public class ex15 {

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


*/