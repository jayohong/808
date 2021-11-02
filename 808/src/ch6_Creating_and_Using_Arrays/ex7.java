package ch6_Creating_and_Using_Arrays;

import java.util.ArrayList;
import java.util.List;

public class ex7 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		if (names.remove("Bran")) {
		    names.remove("Jon");
		}
		System.out.println(names);

	}

}
/*
Given the code fragment:
List<String> names = new ArrayList<>();
names.add("Robb");
names.add("Bran");
names.add("Rick");
names.add("Bran");
if (names.remove("Bran")) {
    names.remove("Jon");
}
System.out.println(names);
What is the result?

A.

[Robb, Rick, Bran]

B.

[Robb, Rick]

C.

[Robb, Bran, Rick, Bran]

D. An exception is thrown at runtime.




*/