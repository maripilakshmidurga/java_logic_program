 class CountEvenOdd
   {
    public static void main(String[] args)
       {
        int[] numbers = {12, 35, 1, 10, 34, 7, 0, -3, -8, 22};
          int[] count = countEvenOdd(numbers);
        int evenCount = count[0];
        int oddCount = count[1];
         System.out.println("Total even elements: " + evenCount);
        System.out.println("Total odd elements: " + oddCount);
      }
       public static int[] countEvenOdd(int[] array) 
        {
        int evenCount = 0;
        int oddCount = 0;
         for (int number : array)
           {
            if (number % 2 == 0)
             {
                evenCount++; 
            } else {
                oddCount++; 
            }
        }

        return new int[]{evenCount, oddCount}; 
    }
}