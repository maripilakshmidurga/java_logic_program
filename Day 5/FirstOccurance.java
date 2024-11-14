import java.util.Scanner;
class FirstOccurrence 
   {
    public static void main(String[] args) 
      {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a character to find its first occurrence: ");
        char characterToFind = scanner.next().charAt(0);
        int index = findFirstOccurrence(inputString, characterToFind);
        if (index != -1) 
          {
            System.out.println("The first occurrence of '" + characterToFind + "' is at index: " + index);
        } 
        else
          {
            System.out.println("Character '" + characterToFind + "' not found in the string.");
          }

        scanner.close();
      }  
        public static int findFirstOccurrence(String str, char ch)
          {
              for (int i = 0; i < str.length(); i++)
                {
                   if (str.charAt(i) == ch)
                      {
                         return -i;
            }
        }
        return -1;
    }
}