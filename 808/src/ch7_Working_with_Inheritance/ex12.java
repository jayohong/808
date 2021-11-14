package ch7_Working_with_Inheritance;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given the following four Java file definitions:

Foo.java
package facades;
 
public interface Foo { }

Boo.java
package facades;
 
public interface Boo extends Foo { }

Woofy.java
package org.domain;
 
// line n1
 
public class Woofy implements Boo, Foo { }
Test.java
package org;
 
// line n2
 
public class Test {
    public static void main(String[] args) {
        Foo obj = new Woofy();
    }
}
Which set modifications enable the code to compile and run?

A.
At line n1, Insert:

import facades;
At line n2, insert:

import facades;
import org.domain;


B.
At line n1, Insert:

import facades.*;
At line n2, insert:

import facades.*;
import org.*;


C.
At line n1, Insert:

import facades.*;
At line n2, insert:

import facades.Boo;
import org.*;

D.
At line n1, Insert:

import facades.Foo, Boo;
At line n2, insert:

import org.domain.Woofy;


E.
At line n1, Insert:

import facades.*;
At line n2, insert:

import facades.*;
import org.domain.Woofy;


my ans is E
*/