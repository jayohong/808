package ch9_Working_with_Selected_classes_from_the_Java_API;
interface Runnable{
    public void run();
}
public class ex12 {

	public static void main(String[] args) {
		Runnable r=()->System.out.println("hello");
		r.run();

	}

}
/*
Consider following interface.

interface Runnable{
    public void run();
}
Which of the following will create instance of Runnable type?

A.

Runnable run = () -> {System.out.println("Run");};
B.

Runnable run = () -> System.out.println("Run");
C.

Runnable run = () > System.out.println("Run");
D.

Runnable run = > System.out.println("Run");
E. None of the above.



*/