import java.util.LinkedHashSet;
public class EmployeeEmails {
    private LinkedHashSet<String> emailIDs;
    public EmployeeEmails() {
        emailIDs = new LinkedHashSet<>();
    }
    public void addEmail(String email) {
        if (emailIDs.add(email)) {
            System.out.println("Email " + email + " added.");
        } else {
            System.out.println("Email " + email + " is already in the list.");
        }
    }
    public void removeEmail(String email) {
        if (emailIDs.remove(email)) {
            System.out.println("Email " + email + " removed.");
        } else {
            System.out.println("Email " + email + " not found.");
        }
    }
    public void displayEmails() {
        if (emailIDs.isEmpty()) {
            System.out.println("No email IDs available.");
        } else {
            System.out.println("Employee Email IDs in the order of insertion:");
            for (String email : emailIDs) {
                System.out.println(email);
            }
        }
    }

    public static void main(String[] args) {
        EmployeeEmails employeeEmails = new EmployeeEmails();
        employeeEmails.addEmail("john.doe@example.com");
        employeeEmails.addEmail("jane.smith@example.com");
        employeeEmails.addEmail("john.doe@example.com"); 
        employeeEmails.addEmail("alice.jones@example.com");
        employeeEmails.displayEmails();
        employeeEmails.removeEmail("jane.smith@example.com");
        employeeEmails.removeEmail("nonexistent.email@example.com"); 
        employeeEmails.displayEmails();
    }
}
