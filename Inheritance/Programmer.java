public class Programmer extends Employee
{
    private int bonus=1000;

    public static void main(String [] args)
    {
        Programmer programmer=new Programmer();
        System.out.println("Programmer salary is: " +programmer.salary);
        System.out.println("Bonus of programmer is " +programmer.bonus);
    }
}
