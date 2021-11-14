package ch5_Working_with_Methods_and_Encapsulation;

public class ex10_attention {
	static double area;
    int b = 2, h = 3;

	public static void main(String[] args) {
		double p,b, h; // line n1
        int i;
		if (area == 0) {
            b = 3;
            h = 4;
            p = 0.5;
        }else {
        	b = 3;
            h = 4;
            p = 0.5;
        }
        area = p * b * h; // line n2
        
        
        System.out.println("Area is " + area);
	 
	   

	}

}


/*

public class Triangle {
 
    static double area;
    int b = 2, h = 3;
 
    public static void main(String[] args) {
        double p, b, h; // line n1
        if (area == 0) {
            b = 3;
            h = 4;
            p = 0.5;
        }
        area = p * b * h; // line n2
        System.out.println("Area is " + area);
    }
}
What is the result?

A.

Area is 6.0

B.

Area is 3.0

C. Compilation fails at line n1.
D. Compilation fails at line n2.


Ans is D
note: 
關鍵一 local variable 必須被初始化
關鍵二 if條件式並沒有含括false時的情形,當area!=0 main方法內的區域變數並沒有定義初始化
所以因為這樣會編譯失敗

*/