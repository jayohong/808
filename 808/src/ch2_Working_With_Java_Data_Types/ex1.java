package ch2_Working_With_Java_Data_Types;

public class ex1 {
	public static void main(String[] args) {
        Cake c = new Cake();
        bake1(c);
        System.out.println(c.model + " " + c.flavor);
        bake2(c);
        System.out.println(c.model + " " + c.flavor);
    }
 
    public static Cake bake1(Cake c) {
        c.flavor = "Strawberry";
        c.model = 1200;
        return c;
    }
 
    public static void bake2(Cake c) {
        c.flavor = "Chocolate";
        c.model = 1230;
        return;
    }
 
    

}

class Cake {
	 
    int model;
    String flavor;
 
    Cake() {
        model = 0;
        flavor = "Unknown";
    }
}

/*
Given:

class Cake {
 
    int model;
    String flavor;
 
    Cake() {
        model = 0;
        flavor = "Unknown";
    }
}
 
public class Test {
 
    public static void main(String[] args) {
        Cake c = new Cake();
        bake1(c);
        System.out.println(c.model + " " + c.flavor);
        bake2(c);
        System.out.println(c.model + " " + c.flavor);
    }
 
    public static Cake bake1(Cake c) {
        c.flavor = "Strawberry";
        c.model = 1200;
        return c;
    }
 
    public static void bake2(Cake c) {
        c.flavor = "Chocolate";
        c.model = 1230;
        return;
    }
}


What is the result?

A.

0 unknown
0 unknown

B.

1200 Strawberry
1200 Strawberry

C.

1200 Strawberry
1230 Chocolate

D. Compilation fails


Ans is C
*/