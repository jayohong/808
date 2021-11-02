package ch8_Handling_Exceptions;
class MissingInfoException extends Exception {
}
 
class AgeOutofRangeException extends Exception {
}
 
class Candidate {
 
    String name;
    int age;
 
    Candidate(String name, int age) throws Exception {
        if (name == null) {
            throw new MissingInfoException();
        } else if (age <= 10 || age >= 150) {
            throw new AgeOutofRangeException();
        } else {
            this.name = name;
            this.age = age;
        }
    }
 
    public String toString() {
        return name + " age: " + age;
    }
}

public class ex4 {

	public static void main(String[] args) throws Exception{
		
		Candidate c = new Candidate("James", 20);
        Candidate c1 = new Candidate("Williams", 32);
        System.out.println(c);
        System.out.println(c1);
		
	}

}


/*
View the exhibit.

class MissingInfoException extends Exception {
}
 
class AgeOutofRangeException extends Exception {
}
 
class Candidate {
 
    String name;
    int age;
 
    Candidate(String name, int age) throws Exception {
        if (name == null) {
            throw new MissingInfoException();
        } else if (age <= 10 || age >= 150) {
            throw new AgeOutofRangeException();
        } else {
            this.name = name;
            this.age = age;
        }
    }
 
    public String toString() {
        return name + " age: " + age;
    }
}

Given the code fragment:

public class Test {
    public static void main(String[] args) {
        Candidate c = new Candidate("James", 20);
        Candidate c1 = new Candidate("Williams", 32);
        System.out.println(c);
        System.out.println(c1);
    }
}
Which change enables the code to print the following?

James age: 20
Williams age: 32

A.
Replacing line 5 with

public static void main (String [] args) throws MissingInfoException, AgeOutofRangeException {
B.
Replacing line 5 with

public static void main (String [] args) throws.Exception {
C.
Enclosing line 6 and line 7 within a try block and adding:

catch (MissingInfoException e1) { //code goes here
}
catch (AgeOutofRangeException e2) {//code goes here
}
catch(Exception e3) { //code goes here
}
D.
Enclosing line 6 and line 7 within a try block and adding:

catch (MissingInfoException e2) { //code goes here
}
catch (AgeOutofRangeException e3) {//code goes here
}




*/