public class Main1 {
    public static void main(String[] args) {
        
        RegistrationSystem registrationSystem = new RegistrationSystem("TreeSet");

       
        Participant participant1 = new Participant("R001", "Alice Johnson");
        Participant participant2 = new Participant("R002", "Bob Smith");
        Participant participant3 = new Participant("R003", "Charlie Brown");

        registrationSystem.addParticipant(participant1);
        registrationSystem.addParticipant(participant2);
        registrationSystem.addParticipant(participant3);

        
        System.out.println("Displaying participants (sorted order by registration ID):");
        registrationSystem.displayParticipants();

        
        String checkId = "R002";
        System.out.println("\nIs participant with ID " + checkId + " registered? " + 
                           registrationSystem.isRegistered(checkId));

       
        String removeId = "R002";
        registrationSystem.removeParticipant(removeId);
        System.out.println("\nAfter removing participant with ID " + removeId + ":");
        registrationSystem.displayParticipants();

        
        System.out.println("\nTrying to add duplicate participant with ID R001:");
        registrationSystem.addParticipant(participant1); // This won't be added due to uniqueness in Set
        registrationSystem.displayParticipants();
    }
}
