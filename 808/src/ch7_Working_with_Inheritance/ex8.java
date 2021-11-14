package ch7_Working_with_Inheritance;

public class ex8 extends Exam{
	void method() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Exam {
	 
    void method() {
    }
}
/*
Which of the following can fill in the blank in this code to make it compile?

Exam.java
public class Exam {
 
    void method() {
    }
}
OCAJP.java
public class OCAJP extends Exam{
    _____ void method(){}
}
A. abstract
B. final
C. private
D. default
E. int

my ans is C
incorrect ans is B

A: 只有interface & abstract class允許有abstract method
B: final 宣告在方法則該方法可繼承無法在覆寫
C: 繼承的子類別只能提高不能降低父類別存取權限
D: Default只能用在interface 是java8以後為了interface可實作方法而新增 來提高舊interface的向後相容性
 
*/