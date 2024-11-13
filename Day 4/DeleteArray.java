import java.util.Scanner;
public class DeleteArray
 {
    public static void main(String[] args)
      {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
           {
            array[i] = scanner.nextInt();
           }
          System.out.print("Enter the position of the element to delete (0 to " + (n - 1) + "): ");
          int position = scanner.nextInt();
        if (position < 0 || position >= n)
          {
            System.out.println("Invalid position! Please enter a position between 0 and " + (n - 1));
        } 
         else 
            {
            int[] newArray = new int[n - 1];
            for (int i = 0, j = 0; i < n; i++)
              {
                if (i != position)
                 {
                    newArray[j++] = array[i];
                }
            }
            System.out.println("Updated array after deletion:");
            for (int element : newArray)
             {
                System.out.print(element + " ");
            }
        }
        scanner.close();
    }
}