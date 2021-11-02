package ch9_Working_with_Selected_classes_from_the_Java_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	 
    String name;
    int age;
 
    public Person(String n, int a) {
        name = n;
        age = a;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
}

public class ex6 {

	public static void checkAge(List<Person> list, Predicate<Person> predicate) {
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }
 
    public static void main(String[] args) {
        List<Person> iList = Arrays.asList(new Person("Hank", 45), new Person("Charlie", 40), new Person("Smith", 38));
        checkAge(iList,  p -> p.getAge() > 40);
    }

}
/*
Given the code fragments:

Person.java
public class Person {
 
    String name;
    int age;
 
    public Person(String n, int a) {
        name = n;
        age = a;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
}
Test.java
public class Test {
 
    public static void checkAge(List<Person> list, Predicate<Person> predicate) {
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }
 
    public static void main(String[] args) {
        List<Person> iList = Arrays.asList(new Person("Hank", 45), new Person("Charlie", 40), new Person("Smith", 38));
        // line n1
    }
}
Which code fragment, when inserted at line n1, enables the code to print Hank?

A.

checkAge(iList, () -> p.getAge() > 40);
B.

checkAge(iList, Person p -> p.getAge() > 40);
C.

checkAge(iList, p -> p.getAge() > 40);
D.

checkAge(iList, (Person p) -> { p.getAge() > 40; });


*/