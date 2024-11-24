//ArrayList

import java.util.*;

class ArrayList {
    public static void main(String args[]) {
        
         ArrayList city = new ArrayList();

        city.add("Vijayawada");
        city.add("Vizag");
        city.add("Guntur");
        city.add("Nellore");

        city.add(2, "Kavali");

        city.set(1, "Ongole"); 
        city.remove("Vizag");
        city.remove(2);

        System.out.println("The city list is: " + city);

        Collections.sort(city); 

        Iterator<String> itr = city.iterator(); 
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}