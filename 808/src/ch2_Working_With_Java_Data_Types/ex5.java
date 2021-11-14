package ch2_Working_With_Java_Data_Types;

import java.util.ArrayList;
import java.util.List;

public class ex5 {

	  public static List data = new ArrayList();
	  
	    static List update(String[] strs)
	    {
	        for (String x : strs) {
	            data.add(x);
	        }
	        return data;
	    }
	 
	    public static void main(String[] args) {
	        
	    	String[] d = {"a", "b", "c"};
	        update(d);
	        for (String s : d) {
	            System.out.print(s + " ");
	        }
	    }

}
/*
Given the code fragment:

public class Test {
 
    public static List data = new ArrayList();
 
    // insert code here
    {
        for (String x : strs) {
            data.add(x);
        }
        return data;
    }
 
    public static void main(String[] args) {
        String[] d = {"a", "b", "c"};
        update(d);
        for (String s : d) {
            System.out.print(s + " ");
        }
    }
}


Which code fragment, when inserted at // insert code here, enables the code to compile and and print a b c?

A.
List update (String[] strs)

B.
static ArrayList update(String[] strs)

C.
static List update (String[] strs)

D.
static void update (String[] strs)

E.
ArrayList static update(String[] strs)


Ans: C
關鍵字 "static" :main方法裡未建立物件就可使用update 所以update是static
  "List" :雖然data實體是arraylist 但這邊因為宣告是List所以update 方法回傳也是 List
  "update" 方法名稱
  "String[] str" 傳入參數

*/