package JavaSE.Chapter_7_OOP.animal;

public class Snake extends Animal {
    
    @Override
    public void walk() {
        System.out.println("Snakes slithers silently 🐍");
    }
    
    @Override
    public void eat() {
        System.out.println("Snakes Eats Insects, Amphibians, Fish, Birds, Eggs, and Various mammals like Rodents. \n");
    }
}
