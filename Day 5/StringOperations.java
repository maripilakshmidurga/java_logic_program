import java.util.Scanner;
 class StringOperations
 {
    public static void main(String[] args)
     {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        int lengthFirstString = firstString.length();
        int lengthSecondString = secondString.length();
        System.out.println("Length of the first string: " + lengthFirstString);
        System.out.println("Length of the second string: " + lengthSecondString);
        if (firstString.equals(secondString))
         {
            System.out.println("Both strings are equal.");
          } 
          else {
            System.out.println("The strings are not equal.");
          }
        String concatenatedString = firstString + secondString;
        System.out.println("Concatenated string: " + concatenatedString);
        scanner.close();
    }
}