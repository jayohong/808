package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex25 {
String myStr = "7007";
    
    public void doStuff(String str) {
        int myNum = 0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException ne) {
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + ", myNum: " + myNum);
    }
    
    public static void main(String[] args) {
       ex25 obj = new ex25();
        obj.doStuff("9009");
    }
}
/*
Given:

public class App {
    
    String myStr = "7007";
    
    public void doStuff(String str) {
        int myNum = 0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException ne) {
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + ", myNum: " + myNum);
    }
    
    public static void main(String[] args) {
        App obj = new App();
        obj.doStuff("9009");
    }
}
What is the result?

A.

myStr: 9009, myNum: 9009

B.

myStr: 7007, myNum: 7007

C.

myStr: 7007, myNum: 9009

D. Compilation fails


*/