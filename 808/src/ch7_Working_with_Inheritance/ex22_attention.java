package ch7_Working_with_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class ex22_attention {

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






Ans is B

此題考的是多型(Polymorphism)與方法的多載(Overload)
1. 儲存父類別的ArrayList內,也可以放子類別的東西
2. substring(int x):從這個執行個體擷取子字串。 子字串會在指定的字元位置開始並繼續到字串的結尾。

*/