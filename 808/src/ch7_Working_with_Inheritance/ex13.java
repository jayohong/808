package ch7_Working_with_Inheritance;

public class ex13 {

	public static void main(String[] args) {
		 Sun obj2 = new Sun();
	        Star obj3 = obj2;
	        ((Sun) obj3).doStuff();
	        ((Star) obj2).doStuff();
	        ((Universe) obj2).doStuff();
	}

}
class Star {
	 
    public void doStuff() {
        System.out.println("Twinkling Star");
    }
}
 
interface Universe {
 
    public void doStuff();
}
 
class Sun extends Star implements Universe {
 
    public void doStuff() {
        System.out.println("Shining Sun");
    }
}

/*

Given:

class Star {
 
    public void doStuff() {
        System.out.println("Twinkling Star");
    }
}
 
interface Universe {
 
    public void doStuff();
}
 
class Sun extends Star implements Universe {
 
    public void doStuff() {
        System.out.println("Shining Sun");
    }
}
 
public class Bob {
 
    public static void main(String[] args) {
        Sun obj2 = new Sun();
        Star obj3 = obj2;
        ((Sun) obj3).doStuff();
        ((Star) obj2).doStuff();
        ((Universe) obj2).doStuff();
    }
}
What is the result?

A.

Shining Sun
Shining Sun
Shining Sun

B.

Shining Sun
Twinkling Star
Shining Sun

C. Compilation fails
D. A ClassCastException is thrown at runtime





Ans is A
轉型只是限制可以使用的方法或變數
實際的方法還是要看物件實體是什麼
*/