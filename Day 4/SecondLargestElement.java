import java.util.Arrays;
 class SecondLargestElement
   {
    public static void main(String[] args) 
        { 
        int[] numbers = {12, 35, 1, 10, 34, 1};
         int secondLargest = findSecondLargest(numbers);
           if (secondLargest != Integer.MIN_VALUE)
           {
            System.out.println("The second largest element is: " + secondLargest);
          }
          else
          {
            System.out.println("There is no second largest element in the array.");
          }
        }
       public static int findSecondLargest(int[] array)
       {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : array) 
           {  
            if (number > largest)
             }
              secondLargest = largest;
                largest = number;
            } 
              else if (number > secondLargest && number < largest)
              {
                secondLargest = number;
            }
        }

        return secondLargest;
    }
}