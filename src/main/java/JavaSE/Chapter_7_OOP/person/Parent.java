package JavaSE.Chapter_7_OOP.person;

public class Parent extends Person {
    private String parentType;
    private String speakingTone;
    
    
    public Parent(int age, String eyeColor, double height, String name, double weight) {
        super(age, eyeColor, height, name, weight); // super() is used to call/reuse the constructor of the Superclass.
    }
    
    public Parent(int age, String eyeColor, double height, String name, double weight, String parentType, String speakingTone) {
        this(age, eyeColor, height, name, weight); // this() call/reuse another constructor of the same class.
        this.parentType = parentType;
        this.speakingTone = speakingTone;
    }
    
    @Override
    public void speak() {
        System.out.println(this.parentType + " Speaking Now! " + this.speakingTone);
    }
    
    @Override
    public void eat() {
        System.out.println(this.parentType + " Eating Now! ");
    }
    
    // Inheritance: it is mechanism on oop allow one class to reuse the attributes and methods of another class and establish "is a" relationship.
    // Parent Class (Superclass/base class): existing class which will be inherited later by the child classes.
    // Child Class (Subclass/ derived class): new class which will reuse (inherit) the attributes and the methods of
    // the
    // parent class
    // DRY: don't repeat yourself
    
    
    public String getParentType() {
        return parentType;
    }
    
    public void setParentType(String parentType) {
        this.parentType = parentType;
    }
    
    public String getSpeakingTone() {
        return speakingTone;
    }
    
    public void setSpeakingTone(String speakingTone) {
        this.speakingTone = speakingTone;
    }
    // mother is a ... person ...
    // father is a ...person...
    // child is a ...person...
    
    
}
