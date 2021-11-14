package ch7_Working_with_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class ex22 {

	public static void main(String[] args) {
		List<Alpha> strs = new ArrayList<Alpha>();
		strs.add(new Alpha());
		strs.add(new Beta());
		strs.add(new Gamma());
		for (Alpha t : strs) {
		    System.out.println(t.doStuff("Java"));
		}

	}

}
class Alpha {
    public String doStuff(String msg) {
        return msg;
    }
}

class Beta extends Alpha {
    public String doStuff(String msg) {
        return msg.replace('a', 'e');
    }
}

class Gamma extends Beta {
    public String doStuff(String msg) {
        return msg.substring(2);
    }
}
/*
Given the class definitions:

class Alpha {
    public String doStuff(String msg) {
        return msg;
    }
}

class Beta extends Alpha {
    public String doStuff(String msg) {
        return msg.replace('a', 'e');
    }
}

class Gamma extends Beta {
    public String doStuff(String msg) {
        return msg.substring(2);
    }
}
And the code fragment of the main() method,

List<Alpha> strs = new ArrayList<Alpha>();
strs.add(new Alpha());
strs.add(new Beta());
strs.add(new Gamma());
for (Alpha t : strs) {
    System.out.println(t.doStuff("Java"));
}
What is the result?

A.

Java
Java
Java

B.

Java
Jeve
va

C.

Java
Jeve
ve

D. Compilation fails


my ans is D
incorrect, ans is B
儲存父類別的ArrayList內,也可以放子類別的東西
*/