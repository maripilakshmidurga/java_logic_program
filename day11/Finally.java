import java.io.*;
import java.lang.*;
public class import java.io.*;
import java.lang.*;
public class Finally
{
    public static void main(String args[])
    {
        try
        {
            int a=100;
            int res=a/0;
            System.out.println("The result value is:"+res);
            System.exit(0);
        }
        catch(Exception mn)
        {
            System.out.println("Exception Error is................"+mn.getMessage());
        }
        finally
        {
            System.out.println("Statement is finally block");
        }
    }
}
{
    public static void main(String args[])
    {
        try
        {
            int a=100;
            int res=a/0;
            System.out.println("The result value is:"+res);
            System.exit(0);
        }
        catch(Exception mn)
        {
            System.out.println("Exception Error is................"+mn.getMessage());
        }
        finally
        {
            System.out.println("Statement is finally block");
        }
    }
}