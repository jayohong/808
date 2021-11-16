package ch6_Creating_and_Using_Arrays;

public class ex19 {

	public static void main(String[] args) {
		try{
            String[] arr = new String[4];
            arr[1] = "Unix";
            arr[2] = "Linux";
            arr[3] = "Solarios";
            for(String var:arr){
                System.out.print(var + " ");
            }
        }catch(Exception e){
            System.out.print(e.getClass());
        }
	}

}
/*
Given:

public class Test {
 
    public static void main(String[] args) {
        try{
            String[] arr = new String[4];
            arr[1] = "Unix";
            arr[2] = "Linux";
            arr[3] = "Solarios";
            for(String var:arr){
                System.out.print(var + " ");
            }
        }catch(Exception e){
            System.out.print(e.getClass());
        }
    }
}
What is the result?

A.

Unix Linux Solaris

B.

null Unix Linux Solaris

C. Class java.lang.Exception
D. Class java.lang.NullPointerException

Ans is B
*/