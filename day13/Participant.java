import java.util.Objects;

public class Participant {
    private String registrationId;
    private String name;

    
    public Participant(String registrationId, String name) {
        this.registrationId = registrationId;
        this.name = name;
    }

    
    public String getRegistrationId() {
        return registrationId;
    }

    public String getName() {
        return name;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(registrationId, that.registrationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationId);
    }

    @Override
    public String toString() {
        return "Participant{registrationId='" + registrationId + "', name='" + name + "'}";
    }
}
