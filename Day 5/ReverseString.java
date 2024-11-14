import java.util.Scanner;
 class ReverseString
    {
    public static void main(String[] args)
      {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
        scanner.close();
       } 
         public static String reverseString(String str) 
        {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}