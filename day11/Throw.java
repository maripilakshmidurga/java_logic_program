class Throw
{
    public static void main(String args[])
    {
        try
        {
            throw new ArithmeticException("Manohar");
        }
        catch(ArithmeticException mn)
        {
            System.out.println("The exception is.............."+mn.getMessage());
        }
    }
}