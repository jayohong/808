package ch8_Handling_Exceptions;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*

Given the code fragment:

class X {
    public void printFileContent() {//line 2
        code goes here 
        throw new IOException();
    }
}
public class Test {
    public static void main(String[] args) {//line 8
        X xobj = new X();
        xobj.printFileContent();
    }
}
Which two modifications should you make so that the code compiles successfully?

A. Replace line 8 with:

public static void main(String[] args) throws Exception {
B. Replace line 10 with:

try {
    xobj.printFileContent();
} catch (Exception e) {
} catch (IOException e) {
}
C. Replace line 2 with:

public void printFileContent() throws IOException {
D. Replace line 4 with:

throw IOException("Exception raised");
E. At line 11, insert

throw new IOException();


*/