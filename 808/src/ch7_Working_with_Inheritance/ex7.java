package ch7_Working_with_Inheritance;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface Readable {
	 
    public void readBook();
 
    public void setBookMark();
}
 
abstract class Book implements Readable { // line n1
 
    public void readBook() {
    }
    // line n2
}
 
class EBook extends Book{ // line n3
    public void readBook(){
        
    }
    public void setBookMark() {}
    // line n4
}
/*
Given:
interface Readable {
 
    public void readBook();
 
    public void setBookMark();
}
 
abstract class Book implements Readable { // line n1
 
    public void readBook() {
    }
    // line n2
}
 
class EBook extends Book{ // line n3
    public void readBook(){
        
    }
 
    // line n4
}
Which options enable the code to compile?

A.
Replace the code fragment at line n1 with:

class Book implements Readable {
B.
At line n2 insert:

public abstract void setBookMark();
C.
Replace the code fragment at line n3 with:

abstract class EBook extends Book{
D.
At line n4 insert:

public void setBookMark() { }

my ans is D
note 
abstract class 沒有實做interface的方法就不用寫
但class必須實作interface 跟 abstract class所有的方法
*/