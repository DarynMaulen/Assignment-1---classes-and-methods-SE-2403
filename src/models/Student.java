package models;
import java.util.ArrayList;

public class Student extends Person{
    private static int IDCounter =1;
    private int ID;
    private ArrayList<Integer> grades;
    public Student(String name,String surname,int age,boolean gender){
        super(name,surname,age,gender);
        this.ID = IDCounter++;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }
    public double calculateGPA(){
                double sum=0.0;
                for(int grade : grades){
                    sum+=grade;
                }
                return sum / grades.size();
        }

    @Override
    public String toString(){
                return super.toString() + "I am a student with ID "+ID;
        }
}
