package ch4_Using_Loop_Constructs;

public class ex2 {

	public static void main(String[] args) {
		 int arr[] = {1, 2, 3};
	        for (int var : arr) {
	            int i = 1;
	            while (i <= var);
	            System.out.println(i++);
	        }

	}

}
/*
Given:

public class Series {
 
    public static void main() {
        int arr[] = {1, 2, 3};
        for (int var : arr) {
            int i = 1;
            while (i <= var);
            System.out.println(i++);
        }
    }
}
What is the result?

A.

1
1
1

B.

1
2
3

C.

2
3
4

D. Compilation fails
E. The loop executes infinite times




*/