package ch9_Working_with_Selected_classes_from_the_Java_API;

import java.time.LocalDate;
import java.time.Period;

public class ex20 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 3, 26);
        Period p = Period.ofDays(2);
        System.out.println(date.plus(p));

	}

}
/*

public class Whizlabs {
 
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 3, 26);
        Period p = Period.ofDays(1);
        System.out.println(date.plus(p));
    }
}
What is the output?

A.

2015-03-27

B.

2015-04-27

C.

2015-02-27

D. Compilation fails due to error at line 6.
E. Compilation fails due to error at line 8.


*/