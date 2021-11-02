package ch7_Working_with_Inheritance;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given:

public abstract class Shape {
 
    private int x;
    private int y;
 
    public abstract void draw();
 
    public void setAnchor(int x, int y) {
        this.x = x;
        this.x = y;
    }
}
Which two classes use the shape class correctly?

A.

public class Circle implements Shape{
    private int radius;
}
B.

public abstract class Circle extends Shape{
    private int radius;
}
C.

public class Circle extends Shape{
    private int radius;
    public void draw();
}
D.

public abstract class Circle implements Shape{
    private int radius;
    public void draw();
}
E.

public class Circle extends Shape{
    private int radius;
    public void draw() { code here  }
}
F.

public abstract class Circle implements Shape{
    private int radius;
    public void draw() { code here  }
}



*/