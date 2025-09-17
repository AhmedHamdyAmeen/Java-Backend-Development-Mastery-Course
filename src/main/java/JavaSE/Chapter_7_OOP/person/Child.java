package JavaSE.Chapter_7_OOP.person;

public class Child extends Parent implements MotherParent {
    
    public Child(int age, String eyeColor, double height, String name, double weight, String speakingTone) {
        super(age, eyeColor, height, name, weight, null, speakingTone); // Inherit Constructor
    }
    
    // Overload: multiple method with the same name but with different list.
    // Override: Modify the implementation (method body) of the method, but the method signature isn't changed.
    @Override
    public void speak() {
        System.out.println("Child Speaking Now! " + super.getSpeakingTone());
        // Super keyword allow us to access the parent methods/attributes.
        // int averageFamilyAge = super.AVERAGE_FAMILY_AGE;
    }
    
    @Override
    public void eat() {
        System.out.println("Child is Eating Now! ");
    }
}
