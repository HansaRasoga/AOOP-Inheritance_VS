package Inheritance9;

public class SubCls extends SuperCls
{
    int y;
    SubCls(int x, int y)
    {
        super(x); // Invoking superclass parameterized constructor
        this.y = y;
    }

    public void display()
    {
        System.out.println("x = " + x + ", y = " + y);
    }
}
