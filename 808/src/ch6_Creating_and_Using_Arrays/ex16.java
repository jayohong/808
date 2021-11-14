package ch6_Creating_and_Using_Arrays;

public class ex16 {

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

A. After line 8, three objects are eligible for garbage collection
B. After line 8, two objects are eligible for garbage collection
C. After line 8, one object is eligible for garbage collection
D. After line 8, none of the objects are eligible for garbage collection

my ans is C
*/