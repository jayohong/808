package ch1_javaBasic;

import java.util.ArrayList;
import java.util.List;

public class ex36{

	public static void main(String[] args) 
	{
		List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);
 
       
        //int f = ps.indexOf(new Patient("Mike"));
        Patient p= new Patient("Mike");
        int f = ps.indexOf(p);
        
       
        System.out.println(f);
        
        if (f >= 0) {
            System.out.print("Mike Found");
        }
		
		
	}

}
class Patient {
	 
    String name;
 
    public Patient(String name) {
        this.name = name;
    }
}
/*

Given:

class Patient {
 
    String name;
 
    public Patient(String name) {
        this.name = name;
    }
}
public class Test {
    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);
 
        // insert code here
        
        if (f >= 0) {
            System.out.print("Mike Found");
        }
    }
}
Which code fragment, when inserted at line 14, enables the code to print Mike Found?

A.

int f = ps.indexOf{new Patient("Mike")};
B.

int f = ps.indexOf(Patient("Mike"));
C.

Patient p = new Patient("Mike");
int f = ps.indexOf(p);
D.

int f = ps.indexOf(p2);




Ans is D

A:錯在indexof{}, 編譯錯誤
B:錯在沒有加new 編譯錯誤
C:p沒有放進ps內 會回傳-1(查無)
D:correct
*/