package InheritanceExample;

public class Main 
{
        public static void main(String [] args)
        {
            Derivedclass derivedclass=new Derivedclass();
            //We cannot access private memebers due to not being available in the subclass.
            //System.out.println("x=derivedclass.x"); // x is private in Baseclass
            //derivedclass.m1(); // m1() is private in Baseclass

            //Accesing the protected memebers from thr subclass
            derivedclass.m2(); // m2() is protected in Baseclass
            System.out.println("y= " + derivedclass.y); // y is protected in Baseclass
        }
}
