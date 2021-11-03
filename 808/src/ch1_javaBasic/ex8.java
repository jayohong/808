package ch1_javaBasic;
//Ans: C

import java.util.ArrayList;
import java.util.List;

public class ex8 {

	public static void main(String[] args) {
		 List cs = new ArrayList();
	        cs.add("Java");
	        cs.add("C");
	        Student s = new Student(123, "Fred", cs);//int,String , List
	        System.out.println(s);
		

	}

}

class Student {
	 
    int rollnumber;
    String name;
    List cources = new ArrayList();
    
   Student( int rollnumber,String name,List cources){
	   
	}
   
    public String toString() {
        return rollnumber + " : " + name + " : " + cources;
    }
   
}
//
/*
Given the code fragment:

class Student {
 
    int rollnumber;
    String name;
    List cources = new ArrayList();
    
    // insert code here
 
    public String toString() {
        return rollnumber + " : " + name + " : " + cources;
    }
}


And,

public class Test {
 
    public static void main(String[] args) {
        List cs = new ArrayList();
        cs.add("Java");
        cs.add("C");
        Student s = new Student(123, "Fred", cs);
        System.out.println(s);
    }
}
Which code fragment, when inserted at line // insert code here, enables class Test to print 123 : Fred : [Java, C]?

A. //錯在權限
private Student(int i, String name, List cs) {
//initialization code goes here 
}

B. //錯在是method
public void Student(int i, String name, List cs) {
 //initialization code goes here 
}

C.
Student(int i, String name, List cs) {
//initialization code goes here 
}

D. //引數是list
Student(int i, String name, ArrayList cs) {
// initialization code goes here 
}


*/