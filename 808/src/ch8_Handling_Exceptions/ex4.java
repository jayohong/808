package ch8_Handling_Exceptions;

class MissingInfoException extends Exception {
}

class AgeOutofRangeException extends Exception {
}

class Candidate {

	String name;
	int age;

	Candidate(String name, int age) throws MissingInfoException,AgeOutofRangeException {
		if (name == null) {
			throw new MissingInfoException();
        } else if (age <= 10 || age >= 150) {
            throw new AgeOutofRangeException();
		} else {
			this.name = name;
			this.age = age;
		}
	}

	public String toString() {
		return name + " age: " + age;
	}
}

public class ex4 {

	public static void main(String[] args) throws MissingInfoException,AgeOutofRangeException{//line 5
		
		Candidate c = new Candidate("James", 20);//line 6
		Candidate c1 = new Candidate("Williams", 21);//line 7
		System.out.println(c);
		System.out.println(c1);

		//		try {
//			Candidate c = new Candidate("James", 20);//line 6
//			Candidate c1 = new Candidate("Williams", 21);//line 7
//			System.out.println(c);
//			System.out.println(c1);
//		
//		}catch(MissingInfoException e1) {
//			
//		}catch(AgeOutofRangeException e2) {
//			
//		}catch(Exception e) {
//			
//		}
		
        
        
		
	}

}

/*
 * View the exhibit.
 * 
 * class MissingInfoException extends Exception { }
 * 
 * class AgeOutofRangeException extends Exception { }
 * 
 * class Candidate {
 * 
 * String name; int age;
 * 
 * Candidate(String name, int age) throws Exception { 
 * 		if (name == null) { throw
 * 			new MissingInfoException(); }
 * 		else if (age <= 10 || age >= 150) { 
 * 			throw new AgeOutofRangeException(); 
 * 		} else { 
 * 			this.name = name; 
 * 			this.age = age; 
 * 			} 
 * 		}
 * 
 * public String toString() { return name + " age: " + age; } }
 * 
 * Given the code fragment:
 * 
 * public class Test { public static void main(String[] args) { Candidate c =
 * new Candidate("James", 20); Candidate c1 = new Candidate("Williams", 32);
 * System.out.println(c); System.out.println(c1); } } Which change enables the
 * code to print the following?
 * 
 * James age: 20 Williams age: 32
 * 
 * A. Replacing line 5 with
 * 
 * public static void main (String [] args) throws MissingInfoException,
 * AgeOutofRangeException { 
 * 
 * B. Replacing line 5 with
 * 
 * public static void main (String [] args) throws.Exception { 
 * 
 * 
 * C. Enclosing line
 * 6 and line 7 within a try block and adding: catch (MissingInfoException e1) { //code goes here } catch
 * (AgeOutofRangeException e2) {//code goes here } catch(Exception e3) { //code goes here } 
 * 
 * 
 * D. Enclosing line 6 and line 7 within a try block and adding:
 * 
 * catch (MissingInfoException e2) { //code goes here } catch (AgeOutofRangeException e3) 
 * {//code goes here }
 * 
 * 
 * 
 * my ans is A incorrect
 * ans is C
 * 
 * note
 * throw與throws的比較
	1、throws出現在方法函式頭；而throw出現在函式體。
	2、throws表示出現異常的一種可能性，並不一定會發生這些異常；throw則是丟擲了異常，執行throw則一定丟擲了某種異常物件。
	3、兩者都是消極處理異常的方式（這裡的消極並不是說這種方式不好），只是丟擲或者可能丟擲異常，但是不會由函式去處理異常，
	  真正的處理異常由函式的上層呼叫處理。
 */