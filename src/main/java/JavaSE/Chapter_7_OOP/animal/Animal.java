package JavaSE.Chapter_7_OOP.animal;

public abstract class Animal {
    // Instance Data Members/Fields/Attributes
    private String name;
    private String type;
    private String color;
    private float age;
    private String gender;
    private Boolean isMature;
    
    // Cat is an Animal
    // Dog is an Animal
    // Lion is an Animal
    // Kangaroo is an Animal
    
    // Constructor
    public Animal() {
    }
    
    public Animal(float age, String color, String gender, Boolean isMature, String name, String type) {
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.isMature = isMature;
        this.name = name;
        this.type = type;
    }
    // Methods/Behaviors/Functions
    
    public void makeSound() {
    }
    
    public abstract void walk();
    // {System.out.println("Animal Walking!");}
    
    public abstract void eat(); // is an abstract method (method without implementation) -> This
    // {System.out.println("Animal Eating Food!");}; // Method Body have correct meaning here; Eating() is a general behavior and each subclass has it own way of eating.
    // must be initialized
    // in the concrete subclass
    
    public void sleep() {
        System.out.println("Animal Sleeping!");
    } // Non-abstract method == Concrete method -> Method with implementation (body).
    
    
    public void poop() {
        System.out.println("Animal Pooped!");
    }
    
    
    // Getters & Setters
    
    public float getAge() {
        return age;
    }
    
    public void setAge(float age) {
        this.age = age;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Boolean getMature() {
        return isMature;
    }
    
    public void setMature(Boolean mature) {
        isMature = mature;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
