package StudentApplication;

import StudentEntities.Student;
import java.util.Scanner;
import java.util.Locale;

public class ProgramStudent {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter student name: ");
        student.name = sc.nextLine();
        System.out.print("Enter first grade: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Enter second grade: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Enter third grade: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("Final grade: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 6.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
