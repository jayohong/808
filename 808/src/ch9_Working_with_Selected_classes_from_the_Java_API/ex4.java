package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex4 implements Z {
 
    public String toString() {
        return "X ";
    }
 
    public static void main(String[] args) {
        Y myY = new Y();
        ex4 myX = myY;//new Y();
        Z myZ = myX;//new Y();
        System.out.print(myX);
        System.out.print((Y) myX);
        System.out.print(myZ);
    }
}
 
class Y extends ex4 {
 
    public String toString() {
        return "Y ";
    }
}
 
interface Z {
 
    public String toString();
}




/*
Given:

public class X implements Z {
 
    public String toString() {
        return "X ";
    }
 
    public static void main(String[] args) {
        Y myY = new Y();
        X myX = myY;
        Z myZ = myX;
        System.out.print(myX);
        System.out.print((Y) myX);
        System.out.print(myZ);
    }
}
 
class Y extends X {
 
    public String toString() {
        return "Y ";
    }
}
 
interface Z {
 
    public String toString();
}


What is the output?

A.

X X X

B.

X Y X

C.

Y Y X

D.

Y Y Y



*/