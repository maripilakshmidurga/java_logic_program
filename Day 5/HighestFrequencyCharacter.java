import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 class HighestFrequencyCharacter
     {
       public static void main(String[] args)
      {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char highestFrequencyChar = findHighestFrequencyCharacter(input);
         if (highestFrequencyChar != '\0')
           {
            System.out.println("The character with the highest frequency is: " + highestFrequencyChar);
        }
         else
           {
              System.out.println("The input string is empty.");
           }

          scanner.close();
       }
           public static char findHighestFrequencyCharacter(String str)
           {
              if (str == null || str.isEmpty())  
                 {
                  return '\0';
              }

               Map<Character, Integer> frequencyMap = new HashMap<>();
                for (char c : str.toCharArray()) 
                  {
               frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
               }

               char highestChar = '\0';
              int highestFrequency = 0;
                    for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet())
                   {
                      if (entry.getValue() > highestFrequency)
                       {
                         highestFrequency = entry.getValue();
                        highestChar = entry.getKey();
            }
        }

        return highestChar;
    }
}