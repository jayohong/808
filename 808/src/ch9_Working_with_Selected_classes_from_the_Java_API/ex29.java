package ch9_Working_with_Selected_classes_from_the_Java_API;

import java.util.ArrayList;
import java.util.List;

public class ex29 {

	public static void main(String[] args) {
		

	}

}
/*

Given:

import java.util.ArrayList;
import java.util.List;
 
public class Whizlabs {
 
    public static void main(String[] args) {
        List<int> list = new ArrayList<>();//line 7
        list.add(21); list.add(13);
        list.add(30); list.add(11);
        list.removeIf(e -> e % 2 != 0);//line 10
        System.out.println(list);
    }
}
What is the output?

A. [21, 13, 11]
B. [30]
C. []
D. Compilation fails due to error at line 7
E. Compilation tails due to error at line 10



*/