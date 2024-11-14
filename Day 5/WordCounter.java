import java.util.Scanner;
 class WordCounter
   {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String[] words = inputString.trim().split("\\s+");
        int wordCount = words.length;
        if (inputString.trim().isEmpty())
          {
            wordCount = 0;
          }
        System.out.println("Total number of words: " + wordCount);
        scanner.close();
    }
}