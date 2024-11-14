import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 class LowestFrequencyCharacter
     {
       public static void main(String[] args)
        {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char lowestFrequencyChar = findLowestFrequencyCharacter(input);
        if (lowestFrequencyChar != '\0')
         {
            System.out.println("The character with the lowest frequency is: " + lowestFrequencyChar);
        } 
         else
         {
            System.out.println("The input string is empty.");
        }

        scanner.close();
    }

      public static char findLowestFrequencyCharacter(String str) {
        if (str == null || str.isEmpty())
         {
            return '\0';
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray())
          {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
          char lowestChar = '\0';
        int lowestFrequency = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet())
            {
            if (entry.getValue() < lowestFrequency)
               {
                lowestFrequency = entry.getValue();
                lowestChar = entry.getKey();
            }
        }

        return lowestChar;
    }
}