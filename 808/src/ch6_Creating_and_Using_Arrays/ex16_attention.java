package ch6_Creating_and_Using_Arrays;

public class ex16_attention {

	public static void main(String[] args) {
		 Student s1 = new Student();
	        Student s2 = new Student();
	        Student s3 = new Student();
	        s1 = s3;
	        s3= s2;
	        s2 = null;
	        
	        System.out.println(s1);
	        System.out.println(s2);
	        System.out.println(s3);
		  
	}

}
class Student{
    String name;
    int age;
}

/*
Given the code fragment:

class Student{
    String name;
    int age;
}
And,

public class Test{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1 = s3;
        s3= s2;
        s2 = null;
    }
}
Which statement is true?

A. After line 8, three objects are eligible(有資格) for garbage collection
B. After line 8, two objects are eligible for garbage collection
C. After line 8, one object is eligible for garbage collection
D. After line 8, none of the objects are eligible for garbage collection






Ans is C

哪個論述是對的？
A. 第 8 行之後，三個對像有資格進行垃圾回收
B. 第 8 行之後，有兩個對像有資格進行垃圾回收
C. 第 8 行之後，一個對像有資格進行垃圾回收
D. 在第 8 行之後，沒有任何對象符合垃圾收集條件
*/