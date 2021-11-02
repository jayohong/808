package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex27 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder() ;
		sb.append("world");
		sb.insert(0,"Hello ");
		System.out.println(sb);

	}

}
/*

Given the code fragment:

StringBuilder sb = new StringBuilder() ;
sb.append("world");
Which code fragment prints Hello world?

A.

sb.insert(0,"Hello ");
System.out.println(sb);
B.

sb.append(0,"Hello ");
System.out.println(sb);
C.

sb.add(0,"Hello ");
System.out.println(sb);
D.

sb.set(0,"Hello ");
System.out.println(sb);



*/