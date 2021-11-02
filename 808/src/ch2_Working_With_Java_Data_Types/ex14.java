package ch2_Working_With_Java_Data_Types;

public class ex14 {

	public static void main(String[] args) {
		
		 int i = 10;
	        int j = 20;
	        int k = j += i / 5;//j=j+i/5;k=j;
	        System.out.print(i + " : " + j + " : " + k);
	}

}
/*
Given:

public class App {
 
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = j += i / 5;
        System.out.print(i + " : " + j + " : " + k);
    }
}
What is the result?

A.

10 : 22 : 20

B.

10 : 22 : 22

C.

10 : 22 : 6

D.

10 : 30 : 6



*/