package Inheritance7;

public class Main 
{
    public static void main(String [] args)
    {
        SubCls subCls = new SubCls(); // This will invoke the constructor of SubCls which in turn calls the constructor of SuperCls
        // Output will show the order of constructor calls
    }
}
