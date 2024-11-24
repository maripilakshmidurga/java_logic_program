class Multi
{
    public static void main(String args[])
    {
        try
        {
            int no = Integer.parseInt("123");
            int b=300;
            int res=b/0;
            System.out.println("RESULT IS ........."+res);
            int a[]=new int[5];
            a[10]=858;
            System.out.println("The value of a[10] is....."+a[10]);
        }
        catch(ArrayIndexOutOfBoundsException mm)
        {
            System.out.println("Exception Error............."+mm);
        }
        catch(ArithmeticException nn)
        {
        System.out.println("Exception Error............."+nn.getMessage());
        }
        catch(Exception mn)
        {
             System.out.println("New Exception Error............."+mn);
        }
    }
}