import java.util.Scanner;
 class PalindromeChecker
     {
    public static void main(String[] args)
      {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        boolean isPalindrome = checkPalindrome(inputString);
        if (isPalindrome)
          {
            System.out.println(inputString + " is a palindrome.");
        } 
          else 
           {
             System.out.println(inputString + " is not a palindrome.");
           }
        scanner.close();
       }
           public static boolean checkPalindrome(String str) 
             {
               String cleanedString = str.replaceAll("\\s+", "").toLowerCase();
                 int left = 0;
                 int right = cleanedString.length() - 1;
                  while (left < right) 
                {
                  if (cleanedString.charAt(left) != cleanedString.charAt(right))
                 {
                    return false;
                 }
                left++;
                right--;
           }
        
        return true;
    }
}