interface Sports {
    int getSportsGraceMarks();
}

class Student {
    String name;
    int rollNo;

    void inputStudent(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
class Exam extends Student {
    int examMarks;

    void inputExamMarks(int marks) {
        this.examMarks = marks;
    }

    void displayExamMarks() {
        System.out.println("Exam Marks: " + examMarks);
    }
}
class Results extends Exam implements Sports {
    int sportsMarks;

    @Override
    public int getSportsGraceMarks() {
        return sportsMarks;
    }

    void inputSportsMarks(int sportsMarks) {
        this.sportsMarks = sportsMarks;
    }

    void displayFinalResult() {
        int finalMarks = examMarks + getSportsGraceMarks();
        displayStudent();
        displayExamMarks();
        System.out.println("Sports Grace Marks: " + sportsMarks);
        System.out.println("Final Marks: " + finalMarks);
    }
}

public class main {
    public static void main(String[] args) {
        Results rajan = new Results();
        rajan.inputStudent("Rajan", 101);
        rajan.inputExamMarks(80);
        rajan.inputSportsMarks(10);

        System.out.println("--- Final Result ---");
        rajan.displayFinalResult();
    }
}
