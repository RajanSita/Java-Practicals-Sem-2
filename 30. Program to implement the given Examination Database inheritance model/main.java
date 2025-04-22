// Base Class
class Person {
    String name;
    int age;

    void inputPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived Class (Level 1)
class Student extends Person {
    String rollNo;
    String course;

    void inputStudent(String rollNo, String course) {
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

// Derived Class (Level 2)
class Exam extends Student {
    int marks;

    void inputExam(int marks) {
        this.marks = marks;
    }

    void displayExam() {
        displayPerson();
        displayStudent();
        System.out.println("Marks Obtained: " + marks);
    }
}

// Main Class
public class main {
    public static void main(String[] args) {
        Exam exam1 = new Exam();
        exam1.inputPerson("Rajan", 17);
        exam1.inputStudent("BCA101", "BCA");
        exam1.inputExam(88);
        
        System.out.println("--- Examination Details ---");
        exam1.displayExam();
    }
}
