package JavaSE.Chapter_7_OOP.animal;

public class Kangaroo extends Animal {
    
    @Override
    public void walk() {
        System.out.println("Kangaroo Jump!");
    }
    
    @Override
    public void eat() {
        System.out.println("Kangaroos Eats Grasses and Herbs!");
    }
    
    
}
