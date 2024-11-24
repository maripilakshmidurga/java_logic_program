class Arithmetic
{
    int a,b,c;
    void divide()
    {
        try
        {
            a=10;
            b=0;
            c=a/b;
            System.out.println("The division value is:"+c);
        }
        catch(ArithmeticException ma)
        {
            System.out.println("Division error occured");
            System.out.println("Division error occured"+ma.getMessage());
            System.out.println("Division error occured"+ma);
        }
    }
}
class ArithmeticException1
{
    public static void main(String args[])
    {
        Arithmetic mn=new Arithmetic();
        mn.divide();
    }
}