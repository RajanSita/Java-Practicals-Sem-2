class Student {
    protected int rollNo;
    protected String name;
    protected int examMarks;
    
    public Student(int rollNo, String name, int examMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.examMarks = examMarks;
    }
    
    public void displayStudentInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Exam Marks: " + examMarks);
    }
    
    public int getExamMarks() {
        return examMarks;
    }
}

class Sports {
    protected String sportName;
    protected int graceMarks;
    
    public Sports(String sportName, int graceMarks) {
        this.sportName = sportName;
        this.graceMarks = graceMarks;
    }
    
    public void displaySportsInfo() {
        System.out.println("Sport: " + sportName);
        System.out.println("Grace Marks: " + graceMarks);
    }
    
    public int getGraceMarks() {
        return graceMarks;
    }
}

class Result extends Student {
    private Sports sports;
    private int totalMarks;
    
    public Result(int rollNo, String name, int examMarks, String sportName, int graceMarks) {
        super(rollNo, name, examMarks);
        this.sports = new Sports(sportName, graceMarks);
        this.totalMarks = examMarks + graceMarks;
    }
    
    public void displayResult() {
        System.out.println("\nStudent Result:");
        displayStudentInfo();
        sports.displaySportsInfo();
        System.out.println("Total Marks (Exam + Grace): " + totalMarks);
    }
}

public class main {
    public static void main(String[] args) {
        // Create a student without sports participation
        Student student1 = new Student(101, "John Doe", 75);
        System.out.println("Student Information (Without Sports):");
        student1.displayStudentInfo();
        
        System.out.println("\n-------------------\n");
        
        // Create a student with sports participation
        Result student2 = new Result(102, "Jane Smith", 78, "National Olympics", 5);
        student2.displayResult();
        
        System.out.println("\n-------------------\n");
        
        // Create another student with different sports participation
        Result student3 = new Result(103, "Mike Johnson", 65, "National Games", 3);
        student3.displayResult();
    }
}