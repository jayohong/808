package ch4_Using_Loop_Constructs;

public class ex20_attention {
	
	int sum = 0;
	 
    public void doCheck(int number) {
        if (number % 2 == 0) {
            //break;
        	//return;
        	
        } else {
            for (int i = 0; i < number; i++) {
                sum += i;
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex20_attention obj = new ex20_attention();
        System.out.println("Red " + obj.sum);
        obj.doCheck(2);
        System.out.println("Orange " + obj.sum);
        obj.doCheck(3);
        System.out.println("Green " + obj.sum);

	}

}
/*

Given:

class Test {
 
    int sum = 0;
 
    public void doCheck(int number) {
        if (number % 2 == 0) {
            break;
        } else {
            for (int i = 0; i < number; i++) {
                sum += i;
            }
        }
    }
 
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println("Red " + obj.sum);
        obj.doCheck(2);
        System.out.println("Orange " + obj.sum);
        obj.doCheck(3);
        System.out.println("Green " + obj.sum);
    }
}
What is the result?

A.

Red 0
Orange 0
Green 3

B.

Red 0
Orange 0
Green 6

C.

Red 0
Orange 1

D.

Green 4

E. Compilation fails




Ans is E

note:
break cant not use outside of loop or a switch
continue cant not use outside of loop 
把break換return的話就可以,功能是跳出方法
*/