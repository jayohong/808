package ch2_Working_With_Java_Data_Types;

public class ex19_attentiion {
	 public static void main(String[] args) {
	        X xRef = new Y();
	        Y yRef = (Y)xRef;//new Y();
	        System.out.println(xRef);
	        System.out.println(yRef);
	        yRef.mY();
	        xRef.mX();
	    }

}
class Y extends X {
	 
    public void mX() {
        System.out.println("Xm2");
    }
 
    public void mY() {
        System.out.println("Ym");
    }
}
class X {
	 
    public void mX() {
        System.out.println("Xm1");
    }
}
/*
Given:

class X {
 
    public void mX() {
        System.out.println("Xm1");
    }
}
 
class Y extends X {
 
    public void mX() {
        System.out.println("Xm2");
    }
 
    public void mY() {
        System.out.println("Ym");
    }
}
 
public class Test {
 
    public static void main(String[] args) {
        X xRef = new Y();
        Y yRef = (Y)xRef;//new Y();
        yRef.mY();
        xRef.mX();
    }
}
What is the result?

A.

Ym
Xm2

B.

Ym
Xm1

C. Compilation fails
D. A ClassCastException is thrown at runtime


Ans is A
此題關鍵在於物件實體為何

<待確定>我原本以為子類才可以轉型父類 而父類不能轉型子類所以會編譯錯誤
但看起來此題是可以編譯的 所以看來只要有繼承關西就可以互相轉型
異常可能在runtime時才會出現
*/