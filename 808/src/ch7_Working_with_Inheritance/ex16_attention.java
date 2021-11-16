package ch7_Working_with_Inheritance;

public class ex16_attention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class ToyA {
	 
    public abstract int calculatePrice(ToyA t);
 
    public void printToy(ToyA t) {  }
}

abstract class ToyB {
	 
    public abstract  int calculatePrice(ToyB t);
 
    public abstract void printToy(ToyB t);
}

abstract class ToyC {
	 
    public abstract int calculatePrice(ToyC t);
 
    public final void printToy(ToyC t) {    }
}

//abstract class ToyD {
//	 
//    public abstract int calculatePrice(ToyD t) {  code goes here  }
// 
//    public abstract void printToy(ToyD t) { code goes here  }
//}


/*
You are asked to develop a program for a shopping application, and you are given the following information:

1. The application must contain the classes Toy, EduToy, and consToy. The Toy class is the superclass of the other two classes.
2. The int caicuiatePrice (Toy t) method calculates the price of a toy.
3. The void printToy (Toy t) method prints the details of a toy.

Which definition of the Toy class adds a valid layer of abstraction to the class hierarchy?

A.

public abstract class Toy {
 
    public abstract int calculatePrice(Toy t);
 
    public void printToy(Toy t) {  code goes here }
}
B.

public abstract class Toy {
 
    public int calculatePrice(Toy t);
 
    public void printToy(Toy t);
}
C.

public abstract class Toy {
 
    public int calculatePrice(Toy t);
 
    public final void printToy(Toy t) {  code goes here  }
}
D.

public abstract class Toy {
 
    public abstract int calculatePrice(Toy t) {  code goes here  }
 
    public abstract void printToy(Toy t) { code goes here  }
}








Ans is A

B錯在少abstract關鍵字(abstract class與 interface不同之處 abstract關鍵字不能省略)
C錯在calculatePrice少abstract關鍵字 finalmethod用在這裡是OK的
D錯在加了abstract關鍵字就不能再實作方法

note 
abstract class裡的abstract method需要關鍵字abstract
but 在interface內 因為method都是public abstract 所以反而可以省略


*/