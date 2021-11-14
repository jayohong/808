package ch1_javaBasic;

public class ex22 {

	public static void main(String[] args) {
		

	}

}
/*
Given:

public class ColorTest {
 
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
        int count = 0;
        for (String c : colors) {
            if (count >= 4) {
                break;                    
            } else {
                continue;                  
            }
            if (c.length() >= 4) {
                colors[count] = c.substring(0, 3);
            }
            count++;
        }
        System.out.println(colors[count]);
    }
}
What is the result?

A.

Yellow

B.

Maroon

C. Compilation fails
D. A StringIndexOutOfBoundsException is thrown at runtime.


Ans is C
note 
“break”語句用來結束迴圈，即不再執行後邊的所有迴圈。
“continue”語句用來結束當前迴圈，並進入下一次迴圈，即僅僅這一次迴圈結束了，不是所有迴圈結束了，後邊的迴圈依舊進行。
所以在迴圈內使用if else時break continue不能同時使用 不然後面程式碼會無法執行
*/