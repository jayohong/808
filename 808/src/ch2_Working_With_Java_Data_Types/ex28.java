package ch2_Working_With_Java_Data_Types;

public class ex28 {
	 private char var;
	 
	    public static void main(String[] args) {
	        char var1 = 'a';
	        char var2 = var1;//value-->copy
	        var2 = 'e';
	 
	        ex28 obj1 = new ex28();
	        ex28 obj2 = obj1;//address--¦P¤@­Ó
	        obj1.var = 'i';
	        obj2.var = 'o';
	        
	        System.out.println(obj1+","+obj2);
	        System.out.println(var1 + ", " + var2);
	        System.out.println(obj1.var + ", " + obj2.var);
	    }

}
/*

iven:

public class Vowel {
 
    private char var;
 
    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
 
        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';
        System.out.println(var1 + ", " + var2);
        System.out.println(obj1.var + ", " + obj2.var);
    }
}
A.

a, e
i, o

B.

a, e
o, o

C.

e, e
I, o

D.

e, e
o, o


*/