package codealpha.com.app;

import java.util.ArrayList;
import java.util.Scanner;

import codealpha.com.model.Student;
import codealpha.com.service.GradeService;

/*
 * Main class
 * Student Grade Management System
 */
public class StudentGradeTrackerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("====================================");
        System.out.println(" STUDENT GRADE MANAGEMENT SYSTEM");
        System.out.println("====================================");

        System.out.print("Enter number of students: ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int marks = sc.nextInt();
            students.add(new Student(marks));
        }

        double avg = GradeService.calculateAverage(students);
        int high = GradeService.findHighest(students);
        int low = GradeService.findLowest(students);

        System.out.println("\n---------- RESULT SUMMARY ----------");
        System.out.println("Total Students : " + count);
        System.out.println("Average Marks  : " + avg);
        System.out.println("Highest Marks  : " + high);
        System.out.println("Lowest Marks   : " + low);
        System.out.println("-----------------------------------");

        sc.close();
    }
}