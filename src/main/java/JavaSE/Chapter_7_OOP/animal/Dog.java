package JavaSE.Chapter_7_OOP.animal;

// Dog is an abstract class extends another abstract class `Animal`
public abstract class Dog extends Animal {
    
    @Override
    public void walk() {
        System.out.println("Dog runs energetically 🐕");
    }
    
    
}
