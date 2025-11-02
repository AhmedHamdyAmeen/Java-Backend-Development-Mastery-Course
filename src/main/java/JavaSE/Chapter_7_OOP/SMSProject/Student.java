package JavaSE.Chapter_7_OOP.SMSProject;

public class Student extends Person {
    private int grade;
    private int[] marks;
    
    
    public Student(int ID, String firstName, String lastName, int age) {
        super(ID, firstName, lastName, age);
    }
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public int[] getMarks() {
        return marks;
    }
    
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
