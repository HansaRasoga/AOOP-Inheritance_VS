package Inheritance5;

public class SubCls extends SuperCls
{
    int x=80;
    void display()
    {
        System.out.println("Super Class x:"+super.x);
        System.out.println("Sub Class x:"+x);
    }
}
