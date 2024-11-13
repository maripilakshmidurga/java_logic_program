 class MaxMinArray
    {
    public static void main(String[] args)
    {
       int[] numbers = {12, 35, 1, 10, 34, -5, 99, 0};
         int[] result = findMaxMin(numbers);
        int max = result[0];
        int min = result[1];
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
      }
      public static int[] findMaxMin(int[] array)
      {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE; 
         for (int number : array)
           {
            if (number > max)
            {
              max = number;
            }
            if (number < min) 
               {
                min = number;
             }
           }

        return new int[]{max, min}; // Return an array containing max and min
    }
}