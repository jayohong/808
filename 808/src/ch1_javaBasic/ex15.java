package ch1_javaBasic;


public class ex15 {

	public static void main(String[] args) {
		String[] cartoons = {"tom", "jerry", "micky", "tom"};
		int counter = 0;
		if ("tom".equals(cartoons[0])) {
		    counter++;
		} else if ("tom".equals(cartoons[1])) {
		    counter++;
		} else if ("tom".equals(cartoons[2])) {
		    counter++;
		} else if ("tom".equals(cartoons[3])) {
		    counter++;
		}
		System.out.print(counter);

	}

}

/*
Given the code fragment:

String[] cartoons = {"tom", "jerry", "micky", "tom"};
int counter = 0;
if ("tom".equals(cartoons[0])) {
    counter++;
} else if ("tom".equals(cartoons[1])) {
    counter++;
} else if ("tom".equals(cartoons[2])) {
    counter++;
} else if ("tom".equals(cartoons[3])) {
    counter++;
}
System.out.print(counter);

What is the result?

A. 1

B. 2

C. 4

D. 0

Ans is A
if條件式完成後即跳出

*/