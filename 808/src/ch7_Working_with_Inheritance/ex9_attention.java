package ch7_Working_with_Inheritance;

public class ex9_attention extends Vehicle{
    String trans;
    
   
    ex9_attention(String trans) { // line n1
        this.trans = trans;
    }
 
    ex9_attention(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        //this(trans); //line n2
        this.trans = trans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex9_attention c1 = new ex9_attention("Auto");
	    ex9_attention c2 = new ex9_attention("4W", 150, "Manual");
	    System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
	    System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
	}

}
class Vehicle {
	 
    String type = "4W";
    int maxSpeed = 100;
 
    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
    public Vehicle() {//父類別需要追加無參數建構式
		// TODO Auto-generated constructor stub
	}
}
/*
Given:

class Vehicle {
 
    String type = "4W";
    int maxSpeed = 100;
 
    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}
 
class Car extends Vehicle {
 
    String trans;
 
    Car(String trans) { // line n1
        this.trans = trans;
    }
 
    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        this(trans); //line n2
    }
}
And given the code fragment:

public static void main(String[] args) {
    Car c1 = new Car("Auto");
    Car c2 = new Car("4W", 150, "Manual");
    System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
    System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
}
What is the result?

A.

4W 100 Auto
4W 150 Manual

B.

null 0 Auto
4W 150 Manual

C. Compilation fails only at line n1
D. Compilation fails only at line n2
E. Compilation fails at both line n1 and line n2



Ans is E

n1錯在父類別沒有無引數建構子(引數不同子類別會自動帶入super() 所以除非子類別引數與父類別一模一樣 不然要寫父類別無引數建構式 )
n2錯在建構子引用必須放在第一行 不管是super or this, 所以一個建構式同時引用super(...) this(...)是不可能的

-------------------------------------------------------------------------------
子類不繼承父類的構造方法，但父類的構造方法對子類構造方法的創建有影響。具體來說就是：

①.當父類沒有無參構造方法時，子類也不能有無參構造方法；且必須在子類構造方法中顯式以super(參數)的形式調用父類構造方法。否則會出現如下的錯誤：

Implicit super constructor Person() is undefined for default constructor. Must define an explicit constructor

子類在有參構造方法中顯式調用super(參數)後，如果再寫一個無參構造方法，則會出現下面的錯誤：

Implicit super constructor Person() is undefined. Must explicitly invoke another constructor

②.父類有無參構造方法時，子類可以有無參構造方法，也可以有有參構造方法；在有參構造方法中，可以用super顯式調用父類構造方法也可以不調用。也就是說，這時候，子類在構造方法的創建上是比較自由的。
*/