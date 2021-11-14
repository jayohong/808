package ch5_Working_with_Methods_and_Encapsulation;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given the code fragment from three files:

SalesMan.java
package sales; 
public class SalesMan {}

Product.java
package sales.products; 
public class Product {}


Market.java
package Market;
// insert code here
public class Market {
    SalesMan sm;
    Product p;
}
Which code fragment, when inserted at line 2, enables the code to compile?

A.

Market.java
import sales.*;
B.

Market.java
import java.sales.products.*;
C.

Market.java
import sales;
import sales.products;
D.

Market.java
import sales.*;
import products.*;

E.

Market.java
import sales.*;
import sales.products.*;

Ans is E
package1.*只包含到package1裡的class檔,若package1裡有package2則需要package1.package2.*
才能含括到package2裡的class
*/