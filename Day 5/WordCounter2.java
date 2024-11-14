import java.util.Scanner;
class WordCounter
   {
    public static void main(String[] args)
      {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int wordCount = countWords(inputString);
        System.out.println("Total number of words: " + wordCount);
        scanner.close();
       }  
         public static int countWords(String str)
           {
             str = str.trim();
              if (str.isEmpty())
            {
            return 0;
             } 
           String[] words = str.split("\\s+");
        return words.length;
    }
}