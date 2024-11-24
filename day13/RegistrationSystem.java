import java.util.*;

public class RegistrationSystem {
    private Set<Participant> participants;

   
    public RegistrationSystem(String setType) {
        switch (setType) {
            case "HashSet":
                participants = new HashSet<>();
                break;
            case "LinkedHashSet":
                participants = new LinkedHashSet<>();
                break;
            case "TreeSet":
                participants = new TreeSet<>(Comparator.comparing(Participant::getRegistrationId));
                break;
            default:
                throw new IllegalArgumentException("Invalid set type");
        }
    }

    
    public boolean addParticipant(Participant participant) {
        return participants.add(participant);
    }

    
    public void displayParticipants() {
        if (participants.isEmpty()) {
            System.out.println("No participants registered.");
        } else {
            participants.forEach(System.out::println);
        }
    }

    
    public boolean isRegistered(String registrationId) {
        return participants.stream()
                .anyMatch(participant -> participant.getRegistrationId().equals(registrationId));
    }

    
    public boolean removeParticipant(String registrationId) {
        return participants.removeIf(participant -> participant.getRegistrationId().equals(registrationId));
    }
}
