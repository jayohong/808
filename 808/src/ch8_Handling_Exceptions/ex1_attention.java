package ch8_Handling_Exceptions;

public class ex1_attention {

    public static void main(String[] args) {
    	ex1_attention t = new ex1_attention();
        try {
            t.doPrint();
            t.doList();
        } catch (Exception e2) {
            System.out.println("Caught " + e2);
        }
    }
	    public void doList() throws Exception {
	        throw new Error("Error");
	    }
	    public void doPrint() throws Exception {
	        throw new RuntimeException("Exception");
	    }
    

}
/*
Given:
TestApp.java
public class TestApp {
    public static void main(String[] args) {
        TestApp t = new TestApp();
        try {
            t.doPrint();
            t.doList();
        } catch (Exception e2) {
            System.out.println("Caught " + e2);
        }
    }
    public void doList() throws Exception {
        throw new Error("Error");
    }
    public void doPrint() throws Exception {
        throw new RuntimeException("Exception");
    }
}
What is the result?

A.

Caught java.lang.RuntimeException: Exception
Exception in thread "main" java.lang.Error: Error
at TestApp.doList(TestApp.java: 14)
at TestApp.main(TestApp.java: 6)

B.

Exception in thread "main" java.lang.Error: Error
at TestApp.doList(TestApp.java: 14)
at TestApp.main(TestApp.java: 6)

C.

Caught java.lang.RuntimeException: Exception
Caught java.lang.Error: Error

D.

Caught java.lang.RuntimeException: Exception


Ans is D
程式第5行會呼叫第14行的doPrint方法，然後拋出一個RuntimeException物件。
這個RuntimeException會在程式第7行的catch被接住，然後輸出「Caught java.lang.RuntimeException: Exception」。



江老師講解我聽不懂
RuntimeException 屬於 unchecked exception

1.Java的異常層次結構:
所有的類都是從Throwable繼承而來，下一層則分為兩個結構，Error和Exception。
其中Error類層次描述了Java執行時系統的內部錯誤和資源耗盡錯誤，
這種錯誤除了簡單的報告給使用者，並盡力阻止程式安全終止之外，一般也米有別的解決辦法了。

2. unchecked異常和checked異常的區別:
Java語言規範對這兩個定義十分簡單，將派生於Error或者RuntimeException的異常稱為unchecked異常，所有其他的異常成為checked異常。

3. 為什麼要對unchecked異常和checked異常進行區分？

*/