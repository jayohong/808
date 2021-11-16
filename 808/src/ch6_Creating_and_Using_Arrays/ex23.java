package ch6_Creating_and_Using_Arrays;

public class ex23 {
	int r= 10;
	public static void main(String[] args) {
		int[] intArr = {15, 30, 45, 60, 75};
		intArr[2] = intArr[4];
		intArr[4] = 90;
			//{15, 30, 75, 60, 90};
		
		for(int o:intArr)
		{
			System.out.print(o+",");
		}
		System.out.println("-----------------");
		
		ex23 e1= new ex23();
		ex23 e2= new ex23();
		ex23 e3= new ex23();
		ex23 e4= new ex23();
		ex23 e5= new ex23();
		ex23[] es = {e1,e2,e3,e4,e5};
		es[2] = es[4];
		es[4].r=5;
		for(ex23 e:es)
		{
			System.out.println(e+",");
		}
		System.out.println(es[2].r);
		
		
		
		
		
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


Ans is C
基本型態=是給值 物件=是給位址
*/