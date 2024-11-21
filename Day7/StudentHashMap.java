import java.util.HashMap;

public class StudentHashMap {
    private HashMap<Integer, String> students;

    public StudentHashMap() {
        students = new HashMap<>();
    }
    public void addStudent(int rollNumber, String name) {
        students.put(rollNumber, name);
    }

    public void updateStudentName(int rollNumber, String newName) {
        if (students.containsKey(rollNumber)) {
            students.put(rollNumber, newName);
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }
    public String getStudentName(int rollNumber) {
        return students.getOrDefault(rollNumber, "Student not found");
    }
    public void removeStudent(int rollNumber) {
        if (students.containsKey(rollNumber)) {
            students.remove(rollNumber);
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    public static void main(String[] args) {
        StudentHashMap studentHashMap = new StudentHashMap();
        studentHashMap.addStudent(101, "Alice");
        studentHashMap.addStudent(102, "Bob");
        System.out.println("Student with roll number 101: " + studentHashMap.getStudentName(101));
        studentHashMap.updateStudentName(102, "Charlie");
        studentHashMap.removeStudent(101);
        System.out.println("Student with roll number 101: " + studentHashMap.getStudentName(101));
    }
}