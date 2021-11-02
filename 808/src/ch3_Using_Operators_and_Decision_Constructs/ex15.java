package ch3_Using_Operators_and_Decision_Constructs;

public class ex15 {
	 String name;
	    boolean contract;
	    double salary;
	 
	    ex15() {
	    	name = "Joe";
	    	contract = true;
	    	salary = 100.0f;
	    }
	 
	    public String toString() {
	        return name + ":" + contract + ":" + salary;
	    }
	 
	    public static void main(String[] args) {
	        ex15 e = new ex15();
	        /*e.name = "Joe";
	        e.contract = true;
	        e.salary = 100;*/
	        System.out.print(e);
	    }
}
/*
Given the code fragment:

public class Employee {
 
    String name;
    boolean contract;
    double salary;
 
    Employee() {
        // line n1
    }
 
    public String toString() {
        return name + ":" + contract + ":" + salary;
    }
 
    public static void main(String[] args) {
        Employee e = new Employee();
        // line n2
        System.out.print(e);
    }
}
Which two modifications, when made independently, enable the code to print joe:true:100.0?

A.
Replace line n2 with:

e.name = "Joe";
e.contract = true;
e.salary = 100;
B.
Replace line n2 with:

this.name = "Joe";
this.contract = true;
this.salary = 100;
C.
Replace line n1 with:

this.name = new String("Joe");
this.contract = new Boolean(true);
this.salary = new Double(100);
D.
Replace line n1 with:

name = "Joe";
contract = TRUE;
salary = 100.0f;
E.
Replace line n1 with:

this("Joe", true, 100);



*/