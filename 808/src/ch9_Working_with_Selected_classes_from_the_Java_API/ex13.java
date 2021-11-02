package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex13 {

	public static void main(String[] args) {
		AnotherSampleClass asc = new AnotherSampleClass();
        ex13 sc = new ex13();
        sc = asc;
        System.out.println("sc: " + sc.getClass());
        System.out.println("asc: " + asc.getClass());

	}

}

class AnotherSampleClass extends ex13 {
}
/*
Given:

public class SampleClass {
 
    public static void main(String[] args) {
        AnotherSampleClass asc = new AnotherSampleClass();
        SampleClass sc = new SampleClass();
        sc = asc;
        System.out.println("sc: " + sc.getClass());
        System.out.println("asc: " + asc.getClass());
    }
}
 
class AnotherSampleClass extends SampleClass {
}
What is the result?

A.

sc: class Object
asc: class AnotherSampleClass

B.

sc: class SampleClass
asc: class AnotherSampleClass

C.

sc: class AnotherSampleClass
asc: class SampleClass

D.

sc: class AnotherSampleClass
asc: class AnotherSampleClass



*/