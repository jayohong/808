package ch2_Working_With_Java_Data_Types;

public class ex8_attention {

	public static void main(String[] args) {
		float flt ;
		flt=100F;
		flt=(float)1_11.00;
		flt=100;
		double y1 =203.22;
		//float flt =y1;
		flt =(float)y1;
		
		int y2 = 100;
		flt=(float)y2;
	}

}
/*
Which code fragment cause a compilation error?

A.

float flt = 100F;
B.

float flt = (float) 1_11.00;
C.

float flt = 100;
D.

double y1 = 203.22;
float flt = y1;
E.

int y2 = 100;
float flt = (float) y2;


Ans: D
note 
canot convert from double to float;
直接指定不行 因為double比較大
但是用轉型方式是可以的 
flt = (float)111.0;  double型態轉成float是OK的
Double flt =(float)y1;
*/