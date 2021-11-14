package ch2_Working_With_Java_Data_Types;

import java.util.ArrayList;
import java.util.List;

public class ex22_attention {

	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder("Hello Java!");
        String s2 = s1.toString();
        List<String> lst = new ArrayList<String>();
        lst.add(s2);
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(lst.getClass());
	}

}
/*
import java.util.ArrayList;
import java.util.List;
 
public class Ref {
 
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello Java!");
        String s2 = s1.toString();
        List<String> lst = new ArrayList<String>();
        lst.add(s2);
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(lst.getClass());
    }
}
What is the result?

A.

class java.lang.String
class java.lang.String
class java.util.ArrayList

B.

class java.lang.Object
class java.lang. Object
class java.util.Collection

C.

class java.lang.StringBuilder
class java.lang.String
class java.util.ArrayList

D.

class java.lang.StringBuilder
class java.lang.String
class java.util.List


Ans is C
getClass得到的真正實體物件為何
所以lst真正的實體物件是ArrayList
*/