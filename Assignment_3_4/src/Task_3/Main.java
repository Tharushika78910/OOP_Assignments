package Task_3;

import java.io.*;

public class Main {
    private static final String FILENAME = "enrollments.ser";

    public static void main(String[] args) {

        Student student = new Student(1, "Alice Johnson", 21);
        Course course = new Course("CS101", "Introduction to Programming", "Dr. Smith");
        Enrollment enrollment = new Enrollment(student, course, "2025-09-07");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(enrollment);
            System.out.println("Enrollment serialized successfully!");
        } catch (IOException e) {
            System.err.println("Serialization error: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            Enrollment deserialized = (Enrollment) ois.readObject();
            System.out.println("Deserialized Enrollment:");
            System.out.println(deserialized);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
        }
    }
}

