 class FrequencyCount
 {
   public static void main(String[] args)
     {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};
        countFrequencies(array);
    }
      public static void countFrequencies(int[] array) 
       {
        for (int num : array)
          {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
     }
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet())
         {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}