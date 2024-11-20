import java.util.HashSet;
public class StudentRollNumbers {    
    private HashSet<Integer> rollNumbers;
    public StudentRollNumbers() {
        rollNumbers = new HashSet<>();
    }   
    public void addRollNumber(int rollNumber) {
        if (rollNumbers.add(rollNumber)) {
            System.out.println("Roll number " + rollNumber + " added.");
        } else {
            System.out.println("Roll number " + rollNumber + " already exists.");
        }
    }

    public boolean containsRollNumber(int rollNumber) {
        return rollNumbers.contains(rollNumber);
    }    
    public void removeRollNumber(int rollNumber) {
        if (rollNumbers.remove(rollNumber)) {
            System.out.println("Roll number " + rollNumber + " removed.");
        } else {
            System.out.println("Roll number " + rollNumber + " not found.");
        }
    }    
    public void displayRollNumbers() {
        if (rollNumbers.isEmpty()) {
            System.out.println("No roll numbers available.");
        } else {
            System.out.println("All student roll numbers:");
            for (Integer rollNumber : rollNumbers) {
                System.out.println(rollNumber);
            }
        }
    }

    public static void main(String[] args) {        
        StudentRollNumbers studentRollNumbers = new StudentRollNumbers();       
        studentRollNumbers.addRollNumber(101);
        studentRollNumbers.addRollNumber(102);
        studentRollNumbers.addRollNumber(103);
        studentRollNumbers.addRollNumber(101);       
        studentRollNumbers.displayRollNumbers();        
        System.out.println("\nDoes roll number 102 exist? " + studentRollNumbers.containsRollNumber(102));
        System.out.println("Does roll number 105 exist? " + studentRollNumbers.containsRollNumber(105));       
        studentRollNumbers.removeRollNumber(102);
        studentRollNumbers.removeRollNumber(105);         
        studentRollNumbers.displayRollNumbers();
    }
}
