import java.util.HashMap;
import java.util.Map;
 class DuplicateCount
 {
    public static void main(String[] args)
       {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 8, 2};
        int duplicateCount = countDuplicates(array);
        System.out.println("Total number of duplicate elements: " + duplicateCount);
    }
       public static int countDuplicates(int[] array)
        {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array)
         {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int duplicateCount = 0;
        for (int count : frequencyMap.values())
          {
            if (count > 1) 
            {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }
}