package JavaSE.Chapter7OOP.person;

public class Parent extends Person {
    private String parentType;
    
    
    public Parent(int age, String eyeColor, double height, String name, double weight) {
        super(age, eyeColor, height, name, weight); // super() is used to call/reuse the constructor of the Superclass.
    }
    
    public Parent(int age, String eyeColor, double height, String name, double weight, String parentType) {
        this(age, eyeColor, height, name, weight); // this() call/reuse another constructor of the same class.
        this.parentType = parentType;
    }
    
    @Override
    public void speak() {
        System.out.println(this.parentType + " Speaking Now!");
    }
    
    public String getParentType() {
        return parentType;
    }
    
    public void setParentType(String parentType) {
        this.parentType = parentType;
    }
    // Inheritance: it is mechanism on oop allow one class to reuse the attributes and methods of another class and establish "is a" relationship.
    // Parent Class (Superclass/base class): existing class which will be inherited later by the child classes.
    // Child Class (Subclass/ derived class): new class which will reuse (inherit) the attributes and the methods of
    // the
    // parent class
    
    // DRY: don't repeat yourself
    // mother is a ... person ...
    // father is a ...person...
    // child is a ...person...
    
    
}
