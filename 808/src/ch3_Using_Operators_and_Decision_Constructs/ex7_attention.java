package ch3_Using_Operators_and_Decision_Constructs;

public class ex7_attention {
	 String name;
	 int age = 25;
	    ex7_attention()
	    {
	    	
	    }
	    public ex7_attention(String name) {
	        this(); // line n1
	        setName(name);
	    }
	 
	    public ex7_attention(String name, int age) {
	        this(name); // line n2
	        setAge(age);
	    }
	 
	    //setter and getter methods go here
	    
	    public String show() {
	        return name + " " + age;
	    }
	 
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public static void main(String[] args) {
	        ex7_attention p1 = new ex7_attention("Jesse");
	       ex7_attention p2 = new ex7_attention("Walter", 52);
	        System.out.println(p1.show());
	        System.out.println(p2.show());
	    }

	
}
/*
Given the code fragment:

public class Person {
 
    String name;
    int age = 25;
 
    public Person(String name) {
        this(); // line n1
        setName(name);
    }
 
    public Person(String name, int age) {
        Person(name); // line n2
        setAge(age);
    }
 
    //setter and getter methods go here
    
    public String show() {
        return name + " " + age;
    }
 
    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}

What is the result?

A.

Jesse 25
Walter 52

B. Compilation fails only at line n1
C. Compilation fails only at line n2
D. Compilation fails at both line n1 and line n2




ans is D
note n1錯在要使用this()之前必須建立一個無引數的建構式Person()
n2 錯在自己建構式互相引用必須用this(String s)方式

*/