package Inheritance5;

public class Main 
{
    public static void main(String [] args)
    {
        SubCls subCls = new SubCls();
        subCls.display(); // This will call the display method of SubCls which uses super to access x from SuperCls
    }
}
