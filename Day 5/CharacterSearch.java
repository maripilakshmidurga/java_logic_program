import java.util.Scanner;
 class CharacterSearch
    {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);
        findOccurrences(inputString, searchChar);
        scanner.close();
       }
          public static void findOccurrences(String str, char ch) {
          int index = str.indexOf(ch);
          boolean found = false;
          while (index != -1)
           {
            found = true;
            System.out.println("Character '" + ch + "' found at index: " + index);
            index = str.indexOf(ch, index + 1);
         }

           if (!found) 
             {
               System.out.println("Character '" + ch + "' not found in the string.");
         }
     }
  }