package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given the following class declarations:

public abstract class Animal
public interface Hunter
public class Cat extends Animal implements Hunter
public class Tiger extends Cat

Which answer fails to compile?

A.

ArrayList<Animal> myList = new ArrayList<>();
myList.add(new Tiger());
B.

ArrayList<Hunter> myList = new ArrayList<>();
myList.add(new Cat());
C.

ArrayList<Hunter> myList = new ArrayList<>();
myList.add(new Tiger());
D.

ArrayList<Tiger> myList = new ArrayList<>();
myList.add(new Cat());
E.

ArrayList<Animal> myList = new ArrayList<>();
myList.add(new Cat());



*/