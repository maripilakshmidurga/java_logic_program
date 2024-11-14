import java.util.Scanner;
 class CharacterCounter
   {
    public static void main(String[] args)
       {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharacterCount = 0;
        for (char ch : inputString.toCharArray())
           {
            if (Character.isLetter(ch))
            {
                alphabetCount++;
            }
              else if (Character.isDigit(ch))
               {
                digitCount++;
            }
               else {
                specialCharacterCount++;
            }
        }
        System.out.println("Total alphabets: " + alphabetCount);
        System.out.println("Total digits: " + digitCount);
        System.out.println("Total special characters: " + specialCharacterCount);
        scanner.close();
    }
}