import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Eliza Abdimitalipovvna", (byte) 18, Gander.MALE, "eliza@gmail.com", "+996225171735");
        Student student2 = new Student("Eliza Ashyrbaeva", (byte) 16, Gander.FEMALE, "eliza@gmail.com", "+996225171735");
        Student student3 = new Student("Eliza Muratova", (byte) 20, Gander.MALE, "eliza@gmail.com", "+996225171735");
        Student[] students = {student1, student2, student3};
            int [] students1={student1.getAge(),student2.getAge(),student3.getAge()};
            student1.findByName(students);
            student1.getOfAllStudents(students);
            student1.getManStudents(students);
            student1.getWomenStudents(students);
            student1.sortAge(students1);
        System.out.println(student3.surname());
    }


}