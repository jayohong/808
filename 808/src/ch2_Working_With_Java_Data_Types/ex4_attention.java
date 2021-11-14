package ch2_Working_With_Java_Data_Types;

public class ex4_attention {
	

	public static void main(String[] args) {
		
		try {
            Double number = Double.valueOf("120D");//--->//line 5
            System.out.println("pass try");
        } catch (NumberFormatException ex) {
        }
        //System.out.println(number);//--->line8
       
	}
}

/*
Given:

public class Whizlabs {
 
    public static void main(String[] args) {
        try {
            Double number = Double.valueOf("120D");--->//line 5
        } catch (NumberFormatException ex) {
        }
        System.out.println(number);//--->line8
    }
}

What is the result?

A.

120

B.

120D

C. A NumberFormatException will be thrown.
D. Compilation fails due to error at line 5.
E. Compilation tails due to error at line 8.



Ans: E
note:
number 的生命周期 到離開try catch時就結束了
*/