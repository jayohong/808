package ch2_Working_With_Java_Data_Types;

public class ex7 {

	private String type;
	 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    public static void main(String[] args) {
        ex7 obj1 = new ex7();
        ex7 obj2 = new ex7();
        obj1.setType(null);
        obj2.setType("Fresco");
        System.out.print(obj1.getType() + " : " + obj2.getType());
    }

}
/*
Given:

public class Painting {
 
    private String type;
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    public static void main(String[] args) {
        Painting obj1 = new Painting();
        Painting obj2 = new Painting();
        obj1.setType(null);
        obj2.setType("Fresco");
        System.out.print(obj1.getType() + " : " + obj2.getType());
    }
}

What is the result?

A.

: Fresco

B.

null : Fresco

C.

Fresco : Fresco

D. A NullPointerException is thrown at runtime



*/