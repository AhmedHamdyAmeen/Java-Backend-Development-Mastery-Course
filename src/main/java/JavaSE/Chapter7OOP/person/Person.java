package JavaSE.Chapter7OOP.person;

public class Person {
    // Data Members
    private String name;
    private int age; // Data of birth used instead
    private double height;
    private double weight;
    private String eyeColor;
    public final int AVERAGE_FAMILY_AGE = 80;
    
    // Constructor
    public Person(int age, String eyeColor, double height, String name, double weight) {
        this.age = age;
        this.eyeColor = eyeColor;
        this.height = height;
        this.name = name;
        this.weight = weight;
    }
    
    // Methods:
    public void speak() {
        System.out.println("Person Speaking Now!");
    }
    
    public void move() {
        System.out.println("Person Moving Now!");
    }
    
    public void eat() {
        System.out.println("Person Eating Now!");
    }
    
    public void work() {
        System.out.println("Person Working Now!");
    }
    
    // Getters & Setters
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getEyeColor() {
        return eyeColor;
    }
    
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
