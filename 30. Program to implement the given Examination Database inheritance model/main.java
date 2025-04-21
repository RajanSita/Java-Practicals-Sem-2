import java.util.Scanner;

class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Student extends Person {
    protected int studentId;
    protected String course;

    public Student(String name, int age, String address, int studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

class Exam extends Student {
    private int examId;
    private String examName;
    private int marks;

    public Exam(String name, int age, String address, int studentId, String course,
                int examId, String examName, int marks) {
        super(name, age, address, studentId, course);
        this.examId = examId;
        this.examName = examName;
        this.marks = marks;
    }

    public void displayExamInfo() {
        displayInfo();
        System.out.println("Exam ID: " + examId);
        System.out.println("Exam Name: " + examName);
        System.out.println("Marks: " + marks);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Person Input
        System.out.println("Enter Person Information:");
        System.out.print("Name: ");
        String personName = sc.nextLine();
        System.out.print("Age: ");
        int personAge = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Address: ");
        String personAddress = sc.nextLine();

        Person person = new Person(personName, personAge, personAddress);
        System.out.println("\n--- Person Details ---");
        person.displayInfo();

        System.out.println("\n-----------------------\n");

        // Student Input
        System.out.println("Enter Student Information:");
        System.out.print("Name: ");
        String studentName = sc.nextLine();
        System.out.print("Age: ");
        int studentAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        String studentAddress = sc.nextLine();
        System.out.print("Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Course: ");
        String studentCourse = sc.nextLine();

        Student student = new Student(studentName, studentAge, studentAddress, studentId, studentCourse);
        System.out.println("\n--- Student Details ---");
        student.displayInfo();

        System.out.println("\n-----------------------\n");

        // Exam Input
        System.out.println("Enter Exam Information:");
        System.out.print("Name: ");
        String examName = sc.nextLine();
        System.out.print("Age: ");
        int examAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        String examAddress = sc.nextLine();
        System.out.print("Student ID: ");
        int examStudentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Course: ");
        String examCourse = sc.nextLine();
        System.out.print("Exam ID: ");
        int examId = sc.nextInt();
        sc.nextLine();
        System.out.print("Exam Name: ");
        String examTitle = sc.nextLine();
        System.out.print("Marks: ");
        int marks = sc.nextInt();

        Exam exam = new Exam(examName, examAge, examAddress, examStudentId, examCourse, examId, examTitle, marks);
        System.out.println("\n--- Exam Details ---");
        exam.displayExamInfo();

        sc.close();
    }
}
