class PrintNegativeNumbers
   {
    public static void main(String[] args)
       {
         int[] numbers = {12, -7, 5, -3, 8, -1, 0, -15};
        System.out.println("Negative numbers in the array:");
        printNegativeNumbers(numbers);
    }

    public static void printNegativeNumbers(int[] array) 
     {
        for (int number : array) {
            if (number < 0) {
                System.out.println(number);
            }
        }
    }
}