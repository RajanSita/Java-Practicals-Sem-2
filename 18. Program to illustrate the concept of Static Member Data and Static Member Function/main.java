class Student {
    private int rollNo;
    private String name;
    private static int count = 0;
    
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        count++; 
    }
    
    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
    
    public static int getCount() {
        return count;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("Initial count: " + Student.getCount());
        
        Student s1 = new Student(101, "Rajan");
        Student s2 = new Student(102, "Ayushi");
        Student s3 = new Student(103, "Samadrita");
        Student s4 = new Student(104, "Gagan");
        Student s5 = new Student(105, "Saksham");
        Student s6 = new Student(106, "Darshil");
        
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
        System.out.println("Final count: " + Student.getCount());
    }
}