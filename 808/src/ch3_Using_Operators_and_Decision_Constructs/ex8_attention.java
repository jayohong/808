package ch3_Using_Operators_and_Decision_Constructs;

interface DoInterface {
	 
    void m1(int n); // line n1
 
    public void m2(int n);
}

class DoClass implements DoInterface{
    int x1, x2;
    DoClass(){
        this.x1 = 0;
        this.x2 = 10;
    }
    public void m1(int p1) { x1+=p1; System.out.println(x1); } // line n2
    public void m2(int p1) { x2+=p1; System.out.println(x2); }
}

public class ex8_attention {

	public static void main(String[] args) {
		DoInterface doi = new DoClass(); // line n3
        doi.m1(100);
        doi.m2(200);

	}

}
/*
Given:

DoInterface.java
package p1;
 
public interface DoInterface {
 
    void m1(int n); // line n1
 
    public void m2(int n);
}
DoClass.java
package p3;
public class DoClass implements DoInterface{
    int x1, x2;
    DoClass(){
        this.x1 = 0;
        this.x2 = 10;
    }
    public void m1(int p1) { x1+=p1; System.out.println(x1); } // line n2
    public void m2(int p1) { x2+=p1; System.out.println(x2); }
}
Test.java
package p2;
import p1.*;
import p3.*;
 
class Test {
 
    public static void main(String[] args) {
        DoInterface doi = new DoClass(); // line n3
        doi.m1(100);
        doi.m2(200);
    }
}
What is the result?

A.

100
210

B. Compilation fails due to an error in line n1
C. Compilation fails due to an error at line n2
D. Compilation fails due to an error at line n3




ans is D
此提關鍵在於DoClass屬於p3資料夾 但DoClass建構式權限是"預設"
p2的class要使用的話 DoClass需要提供public權限

//public作用範圍    同一類別 同一套件(資料夾) 不同套件的子類別(繼承) 不同套件且非子類別
//protected作用範圍 同一類別 同一套件(資料夾) 不同套件的子類別(繼承)
//"預設(不寫)"作用範圍 同一類別 同一套件(資料夾) 
//private作用範圍   同一類別 

*/