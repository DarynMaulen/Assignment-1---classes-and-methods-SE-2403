import models.Person;
import models.Student;
import models.Teacher;
import models.School;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        School school = new School();

        File studentFile = new File("src/students");
        Scanner sc = new Scanner(studentFile);

        while (sc.hasNext()) {
            String name = sc.next();
            String surname = sc.next();
            int age = sc.nextInt();
            String gender = sc.next();
            Student student = new Student(name,surname,age,gender.equals("Male"));

            while (sc.hasNextInt()){
                student.addGrade(sc.nextInt());
            }

            school.addMember(student);
        }

        sc.close();

        File teacherFile = new File("src/teacher");
        Scanner tsc = new Scanner(teacherFile);

        while (tsc.hasNext()) {
            String name = tsc.next();
            String surname = tsc.next();
            int age = tsc.nextInt();
            String gender = tsc.next();
            String subject = tsc.next();
            int yearsOfExperience = tsc.nextInt();
            int salary = tsc.nextInt();

            Teacher teacher = new Teacher(name,surname,age,gender.equals("Male"),subject,yearsOfExperience,salary);

            school.addMember(teacher);
        }

        tsc.close();

        System.out.println(school);

    }
}