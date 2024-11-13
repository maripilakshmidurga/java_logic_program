import java.util.Hashset;
 class UniqueElements
   {
    public static void main(String[] args) 
     {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 7,5};
         printUniqueElements(array);
         }
          public static void printUniqueElements(int[] array) 
         {
           HashSet<Integer> seen = new HashSet<>();
           HashSet<Integer> unique = new HashSet<>();
        for (int num : array)
             {
            if (seen.contains(num))
             {
                unique.remove(num);
            }
             else
               {
                seen.add(num);
                unique.add(num);
            }
        }

        System.out.println("Unique elements in the array: " + unique);
    }
}