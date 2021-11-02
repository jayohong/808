package ch6_Creating_and_Using_Arrays;

public class ex23 {

	public static void main(String[] args) {
		int[] intArr = {15, 30, 45, 60, 75};
		intArr[2] = intArr[4];
		intArr[4] = 90;
			//{15, 30, 75, 60, 90};
		
		for(int o:intArr)
		{
			System.out.print(o+",");
		}
	}

}
/*
int[] intArr = {15, 30, 45, 60, 75};
intArr[2] = intArr[4];
intArr[4] = 90;
What are the values of each element in intArr after this code has executed?

A.

15, 60, 45, 90, 75

B.

15, 90, 45, 90, 75

C.

15, 30, 75, 60, 90

D.

15, 30, 90, 60, 90

E.

15, 4, 45, 60, 90



*/