package Inheritance6;

public class SubCls extends SuperCls
{
    int x=80;
    void display()
    {
        System.out.println("Sub Class x:" +x);
        super.display(); // Calls the display method of SuperCls
    }
}
