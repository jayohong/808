package ch5_Working_with_Methods_and_Encapsulation;

public class ex11_attention {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*

Consider following method

default void print(){
}
Which statement is true?

A. This method is invalid.
B. This method can be used only in an interface.
C. This method can return anything.
D. This method can be used only in an interface or an abstract class.
E. None of above.




Ans is B

default並不是存取修飾詞預設(no modifier)的意思
它的定義如下:
Java 8 引入了新的語言特性——預設方法（Default Methods）。
Default methods enable new functionality
to be added to the interfaces of libraries and ensure binary compatibility 
with code written for older versions of those interfaces.

在Java 8以前定義在介面的方法都不可有實作（但可以有靜態方法static method的實作），
介面的方法實作必須透過類別來覆寫(override)，一旦介面增加新的方法其實作類別也必須增加該方法的實作，否則無法通過編譯。

Java 8加入了default methods後，提高了Java向後相容的能力，使得在舊介面添加新的方法變得容易。
例如Collection或List繼承的Iterable介面原本沒有forEach()方法，
Java 8為了增加Lambda語法的可用性，所以加入了forEach()方法。
如果沒有default methods，則實作此介面的類別將都必須實作forEach()方法，使得在擴展舊介面變得相對困難。
*/