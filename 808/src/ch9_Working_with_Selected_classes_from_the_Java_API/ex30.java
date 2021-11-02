package ch9_Working_with_Selected_classes_from_the_Java_API;

public class ex30 {

	public static void main(String[] args) {
		

	}

}
/*
Given the fragment:

String[][] arra = new String[3][];
arra[0] = new String[]{"rose", "lily"};
arra[1] = new String[]{"apple", "berry", "cherry", "grapes"};
arra[2] = new String[]{"beans", "carrot", "potato"};
// insert code fragment here
Which code fragment when inserted at line '// insert code fragment here', enables the code to successfully change arra elements to uppercase?

A.

for(int i = 0; i < arra.length; i++){
    for(int j = 0; j < arra[i].length; j++){
        arra[i][j] = arra[i][j].toUpperCase();
    }
}
B.

for(int i = 0;i < 3; i++){
    for(int j=0; j < 4; j++){
        arra[i][j] = arra[i][j].toUpperCase();
    }
}
C.

for(String a[] : arra[][]){
    for(String x : a[]){
        x.toUpperCase();
    }
}
D.

for(int i : arra.length){
    for(String x : arra){
        arra[i].toUpperCase();
    }
}



*/