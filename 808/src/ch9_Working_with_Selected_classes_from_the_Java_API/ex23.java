package ch9_Working_with_Selected_classes_from_the_Java_API;

import java.util.ArrayList;
import java.util.List;

public class ex23 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
	        list.add(21); list.add(15);
	        list.add(30); list.add(11);
	        list.add(2);
	        list.removeIf(e->e%2==0);
	        System.out.println(list);

	}

}
/*
Given:

import java.util.ArrayList;
import java.util.List;
 
public class Whizlabs{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(21); list.add(15);
        list.add(30); list.add(11);
        list.add(2);
        //insert here
        System.out.println(list);
    }
}
Which inserted at line 11, will provide the following output?

[21, 15, 11]

A.

list.removeIf(e > e % 2 != 0);
B.

list.removeIf(e -> e % 2 == 0);
C.

list.remove(e -> e % 2 == 0);
D. None of the above.



*/