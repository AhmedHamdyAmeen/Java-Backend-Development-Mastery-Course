package JavaSE.Chapter7OOP.person;

public class Child extends Parent implements MotherParent {
    
    public Child(int age, String eyeColor, double height, String name, double weight) {
        super(age, eyeColor, height, name, weight);
    }
    
    @Override
    public void speak() {
        System.out.println("Child Speaking Now!");
    }
}
