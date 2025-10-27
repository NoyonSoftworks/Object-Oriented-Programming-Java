import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + " | Student ID: " + id + " | CGPA: " + cgpa);
    }
}

class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            System.out.println("\n--- Student List ---");
            for (Student s : students) {
                s.displayInfo();
            }
        }
    }
}

public class StudentManagement { //if you use online compiler then must be change class name StudentManagement  to Main otherwise it couldn't be run
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== Student Management Menu ( NoyonSoftWorKs ) =====");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = input.nextLine();
                System.out.print("Enter ID: ");
                int id = input.nextInt();
                System.out.print("Enter CGPA: ");
                double cgpa = input.nextDouble();
                while (cgpa > 4.00 || cgpa <= 00.00){
                    System.out.println("Invalid CGPA! Please enter again (0.00 - 4.00): ");
                    cgpa = input.nextDouble();
                }
                Student s = new Student(name, id, cgpa);
                manager.addStudent(s);
            } 
            else if (choice == 2) {
                manager.showAllStudents();
            } 
            else if (choice == 3) {
                System.out.println("👋 Exiting program...");
                break;
            } 
            else {
                System.out.println("❌ Invalid choice! Try again.");
            }
        }

        input.close();
    }
}

