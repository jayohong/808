package ch4_Using_Loop_Constructs;

public class ex9 {

	public static void main(String[] args) {
		boolean isChecked = false;
        int arry[] = {1, 3, 5, 7, 8, 9};//6
        int index = arry.length;//6
        while (index>0) {
            if (arry[index - 1] % 2 == 0) {
                isChecked = true;
            }
           index--;//5,4,3,2,1,0
        }
        System.out.print(arry[index] + ", " + isChecked);
		 
		
		

	}

}
/*
Given the code fragment:

public class Test {
    public static void main(String[] args) {
        boolean isChecked = false;
        int arry[] = {1, 3, 5, 7, 8, 9};
        int index = arry.length;
        while (~code1~) {
            if (arry[index - 1] % 2 == 0) {
                isChecked = true;
            }
            ~code2~
        }
        System.out.print(arry[index] + ", " + isChecked);
    }
}
Which set of changes enable the code to print 1, true?

A. Replacing with index > 0 and replacing with index--;
B. Replacing with index > 0 and replacing with --index;
C. Replacing with index > 5 and replacing with --index ;
D. Replacing with index and replacing with --index ;



*/