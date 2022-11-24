import java.util.Arrays;
import java.util.Scanner;

public class Student implements StudentAble{
    private String fullName;
    private byte age;
    private Gander gander;
    private String email, phoneNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Gander getGander() {
        return gander;
    }

    public void setGander(Gander gander) {
        this.gander = gander;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Student(String fullName, byte age, Gander gander, String email, String phoneNumber) {
        this.fullName = fullName;
        if (age > 0 && age < 127) {
            this.age = age;
        }
        this.gander = gander;
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("@ jaz");}
            if (phoneNumber.contains("+996")) {
                this.phoneNumber = phoneNumber;
            }else {
                System.out.println("kyrgyz number kabyl alynat");
            }
        }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gander='" + gander + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';


    }

    @Override
    public void getOfAllStudents() {

    }

    @Override
    public void getOfAllStudents(Student[] students) {
        for (Student student:students) {
            System.out.println(student);

        }
    }

    @Override
    public void getManStudents(Student [] students) {
        for (Student student :students) {
            if(student.getGander()==Gander.MALE){
                System.out.println(student);
            }

        }

    }

    @Override
    public void getWomenStudents(Student []students) {
        for (Student student:students) {
            if(student.getGander()==Gander.FEMALE){
                System.out.println(student);
            }
        }
    }

    @Override
    public void findByName(Student [] students) {
        String input=new Scanner(System.in).nextLine();
        for (Student student: students) {
            if(student.getFullName().contains(input)){
                System.out.println(student);
            }
        }

    }

    @Override
    public void sortAge(int [] students) {
        Arrays.sort(students);{
            System.out.println(Arrays.toString(students));
        }
    }

    @Override
    public String surname() {
        String[] arrayString = getFullName().trim().split(" ");
        String surname = "";
        for (int i = 1; i < arrayString.length; i++) {
            surname = "%s %s".formatted(surname,arrayString[i]);
        }
        surname = surname.trim();
        return surname;
    }
}


