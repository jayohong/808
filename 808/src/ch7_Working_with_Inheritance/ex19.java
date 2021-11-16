package ch7_Working_with_Inheritance;

//abstract public class ex19 extends X implements Y{
//    
////	public void methodX() {}
////	public void methodY() {}
////	public void methodZ() {}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//abstract class X {
//	 
//    public abstract void methodX();
//}
// 
//interface Y {
// 
//    public void methodY();
//}
/*

Given:

abstract class X {
 
    public abstract void methodX();
}
 
interface Y {
 
    public void methodY();
}
Which two code fragments are valid?

A.

class Z extends X implements Y{
    public void methodZ(){}
}
B.

abstract class Z extends X implements Y{
    public void methodZ(){}
}
C.

class Z extends X implements Y{
    public void methodX(){}
}
D.

abstract class Z extends X implements Y{
}
E.

class Z extends X implements Y{
    public void methodY(){}
}




Ans is BD
若不實作方法 那只能是abstract

*/