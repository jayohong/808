package ch7_Working_with_Inheritance;

public class ex5 extends Dog{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet a = new Dog();//A OK
		//Pet b = new Pet();//B X
		//Dog f = new Pet();//C X
		Dog d = new ex5();//D OK
		Pet e = new ex5();//E OK
		//ex5 f = new Dog();//F X
	}

}
interface Pet{
	
}
class Dog implements Pet{
	
}

/*
Given:
interface Pet {
}
 
class Dog implements Pet {
}
 
public class Beagle extends Dog {
}
Which three are valid?

A.

Pet a = new Dog();
B.

Pet b = new Pet();
C.

Dog f = new Pet();
D.

Dog d = new Beagle();
E.

Pet e = new Beagle();
F.

Beagle c = new Dog();


my ans is ADE
note interface無法被實體化
轉型只有子類別可以轉父類別
不能父類別轉子類別
*/