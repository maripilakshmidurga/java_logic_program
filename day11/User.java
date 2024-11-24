class InvalidException extends Exception
{
    public InvalidException(String Message)
    {
        super(Message);
    }
}
public class User
{
    public static void ValidateAge(int age) throws InvalidException {
        if(age < 18)
        {
            throw new InvalidException("Age must be 18 or above");
        }
        System.out.println("Access Granted");
    }
    public static void main(String args[])
    {
        try
        {
            ValidateAge(177);
        }
        catch(InvalidException mn)
        {
            System.out.println("Caught Exception.............."+mn.getMessage());
        }
    }
}