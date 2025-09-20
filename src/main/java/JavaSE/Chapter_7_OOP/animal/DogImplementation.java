package JavaSE.Chapter_7_OOP.animal;

public class DogImplementation extends Dog implements AnimalBehavior {
    
    @Override
    public void eat() {
        System.out.println("Dogs Eating Meat!");
    }
    
    @Override
    public void reproduction() {
        System.out.println("Dogs Reproduction!");
    }
}
