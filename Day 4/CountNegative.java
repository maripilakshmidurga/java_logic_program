 class CountNegative
  {
    public static void main(String[] args)
      {
        int[] numbers = {12, -7, 5, -3, 8, -1, 0, -15, 22};
          int count = countNegativeNumbers(numbers);
        System.out.println("Total number of negative elements in the array: " + count);
       }
       public static int countNegativeNumbers(int[] array)
       {
        int count = 0;
         for (int number : array) 
          {
            if (number < 0)
            {
                count++; 
            }
        }

        return count;
    }
}