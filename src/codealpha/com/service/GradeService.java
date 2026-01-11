package codealpha.com.service;
import java.util.ArrayList;
import codealpha.com.model.Student;

/*
 * GradeService class
 * Handles grade calculations
 */
public class GradeService {

    // Calculate average marks
    public static double calculateAverage(ArrayList<Student> students) {
        int total = 0;

        for (Student s : students) {
            total += s.getMarks();
        }
        return (double) total / students.size();
    }

    // Find highest marks
    public static int findHighest(ArrayList<Student> students) {
        int highest = 0;

        for (Student s : students) {
            if (s.getMarks() > highest) {
                highest = s.getMarks();
            }
        }
        return highest;
    }

    // Find lowest marks
    public static int findLowest(ArrayList<Student> students) {
        int lowest = 100;

        for (Student s : students) {
            if (s.getMarks() < lowest) {
                lowest = s.getMarks();
            }
        }
        return lowest;
    }
}