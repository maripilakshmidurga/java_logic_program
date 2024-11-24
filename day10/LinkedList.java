//LinkedList

import java.util.linkedlist;

class LinkedList {
    public static void main(String args[]) {
        
         LinkedList city = new LinkedList();

        city.add("Vijayawada");
        city.add("Vizag");
        city.add("Guntur");
        city.add("Nellore");
        
        System.out.println("The city list is: " + city);


        city.addfirst("Kavali");
        System.out.println("The city list is: " + city);
        city.addlast("tirupathi");
        System.out.println("The city list is: " + city);

 
        city.removefirst("Vizag");
        System.out.println("The city list is: " + city);

        city.removelast("kavali");
        System.out.println("The city list is: " + city);
        System.out.println("The city list is: " + city.getfirst());
        System.out.println("The city list is: " + city.getlast());
        
        city.add(2,"Gudur");
        System.out.println("The city list is: " + city);
        city.remove(1);
        System.out.println("The city list is: " + city);
        System.out.println("The city list is: " + city.contains("goa"));
        System.out.println("The city list is: " + city.size());
        city.clear();
        System.out.println("The city list is: " + city);
        }
    }
}