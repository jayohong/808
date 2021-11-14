package ch5_Working_with_Methods_and_Encapsulation;

public class ex23_attention {

	public static void doChange(int... arr) {
        for (int pos = 0; pos < arr.length; pos++) {
            arr[pos] = arr[pos] + 1;
        }
        //System.out.println(arr);
    }
 
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        doChange(arr);//pass by address
        //System.out.println(arr);
        for (int x : arr) {
            System.out.print(x + ", ");
        }
        doChange(arr[0], arr[1], arr[2]);//pass by value
        //System.out.println(arr);
        System.out.print(arr[0] + ", " + arr[1] + ", " + arr[2]);
    }
}
/*
Given:

public class Test2 {
 
    public static void doChange(int... arr) {
        for (int pos = 0; pos < arr.length; pos++) {
            arr[pos] = arr[pos] + 1;
        }
    }
 
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        doChange(arr);
        for (int x : arr) {
            System.out.print(x + ", ");
        }
        doChange(arr[0], arr[1], arr[2]);
        System.out.print(arr[0] + ", " + arr[1] + ", " + arr[2]);
    }
}
What is the result?

A. 11, 21, 31, 11, 21, 31
B. 11, 21, 31, 12, 22, 32
C. 12, 22, 32, 12, 22, 32
D. 10, 20, 30, 10, 20, 30


Ans is A
doChange(arr)是pass by address
doChange(arr[0], arr[1], arr[2])是pass by value
*/