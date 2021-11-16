package ch7_Working_with_Inheritance;

public class ex2_attention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given:

Acc.java
package p1;
 
public class Acc {
 
    int p;
    private int q;
    protected int r;
    public int s;
}
Test.java
package p2;
 
import p1.Acc;
 
public class Test extends Acc {
 
    public static void main(String[] args) {
        Acc obj = new Test();
    }
}
Which statement is true?

A. Both p and s are accessible by obj.
B. Only s is accessible by obj.
C. Both r and s are accessible by obj.
D. p, r, and s are accessible by obj.




Ans is B
p default X
q private X
r protected X 
s public O

在不同套件的繼承關係下，只有public和protected的可見度可以將變數繼承至底下的類別。
因此在這題中，只有s變數和r變數可以用Test類別所實體化出來的Test物件存取。
但是，obj變數是Acc型態，不是Test型態，因此沒有辦法存取到使用protected修飾的r變數。



*/