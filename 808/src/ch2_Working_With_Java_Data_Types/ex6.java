package ch2_Working_With_Java_Data_Types;

public class ex6 {

	public static void main(String[] args) {

	}

}
/*
Given the code fragment:

public static void main(String[] args) {
    int iVar = 100;
    float fVar = 100.100f;
    double dVar = 123;
    iVar = fVar;//line7
    fVar = iVar;//line8
    dVar = fVar;//line9
    fVar = dVar;//line10
    dVar = iVar;//line11
    iVar = dVar;//line12
}
Which three lines fail to compile?

A. Line 7
B. Line 8
C. Line 9
D. Line 10
E. Line 11
F. Line 12



Ans: ADF
double>float>int
小給大可以 大給小不行
*/