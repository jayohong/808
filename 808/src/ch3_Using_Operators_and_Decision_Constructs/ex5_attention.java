package ch3_Using_Operators_and_Decision_Constructs;

import java.io.IOException;

public class ex5_attention {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = d2;
		System.out.println("執行到最後一行了");
		
		try {
			Dog d4 = new Dog();
		}catch (Exception e) {
			System.out.println("收到exception");
		}

	}

}
class Dog {
	 
    Dog()  {
    	
        try {
        	System.out.println("要丟異常囉");
            throw new Exception();
            
        } catch (Exception e) { }
    	
    }
}
/*
Given:

class Dog {
 
    Dog() {
        try {
            throw new Exception();
        } catch (Exception e) { }
    }
}
 
class Test {
 
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = d2;
        // do complex stuff
    }
}

How many objects have been created when the line // do complex stuff is reached?

A. Two
B. Three
C. Four
D. Six




Ans is C
丟出的異常物件也算一個
這題我不清楚的地方是為什麼throw new Exception()後 不會被catch然後中斷程式
必須再確認try catch機制
*/