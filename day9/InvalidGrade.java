//User defined Exception

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message); 
    }
}

public class InvalidGrade {
    public static void validateGrade(int Grade) throws InvalidGradeException {
        if (Grade>100 || Grade<0) {
            throw new InvalidGradeException ("Grade must be Executed");
        }
        System.out.println("pass");
    }

    public static void main(String[] args) {
        try {
            validateGrade(16); 
        } catch (InvalidGradeException ae) {
            System.out.println("Caught Exception: " + ae.getMessage());
        }
    }
}