package ch6_Creating_and_Using_Arrays;

public class ex12 {

	public static void main(String[] args) {
		 float myarray[] = {10.20f, 20.30f, 30.40f, 50.60f};
	        int index = 0;
	        boolean isFound = false;
	        float key = 30.40f;
	        while(index < 5){
	            if(key == myarray[index]){
	                isFound = true;
	                break;
	            }
	            index++;
	        }
	        System.out.println(isFound);

	}

}
/*
Given:

public class TestLoop {
    public static void main(String[] args) {
        float myarray[] = {10.20f, 20.30f, 30.40f, 50.60f};
        int index = 0;
        boolean isFound = false;
        float key = 30.40f;
        // insert code here
        System.out.println(isFound);
    }
}
Which code fragment, when inserted at line 7, enables the code print true?

A.

while(key == myarray[index++]){
    isFound = true;
}
B.

while(index <= 4){
    if(key == myarray[index]){
        index++;
        isFound = true;
        break;
    }
}
C.

while(index++ < 5){
    if(key == myarray[index]){
        isFound = true;
    }
}
D.

while(index < 5){
    if(key == myarray[index]){
        isFound = true;
        break;
    }
    index++;
}


*/