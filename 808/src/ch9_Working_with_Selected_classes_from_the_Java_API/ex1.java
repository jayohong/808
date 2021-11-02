package ch9_Working_with_Selected_classes_from_the_Java_API;

import java.time.LocalTime;

public class ex1 {

	public static void main(String[] args) {
		System.out.print(LocalTime.now());

	}

}
/*
Which of the following will print current time?

A

System.out.print(new LocalTime().now());
B.

System.out.print(new LocalTime());
C.

System.out.print(LocalTime.now());
D.

System.out.print(LocalTime.today());
E. None of the above.



*/