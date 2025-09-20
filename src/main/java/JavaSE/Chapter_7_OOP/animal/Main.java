package JavaSE.Chapter_7_OOP.animal;

public class Main {
    
    // final int age; // Error ❌: Variable age might not have been initialized
    
    public static void main(String[] args) {
        Animal animal;
        // animal = new Animal(); // Error ❌: Cant instantiate Abstract Class.
        animal = new Cat(); // up-casting (implicit casting)
        
        Cat cat = new Cat();
        DogImplementation dog = new DogImplementation();
        Snake snake = new Snake();
        Kangaroo kangaroo = new Kangaroo();
        Lion lion = new Lion();
        
        cat.eat(); // Cats Eating Fishes!
        dog.eat(); // Dogs Eating Meat!
        snake.eat(); // Snakes Eats Insects, Amphibians, Fish, Birds, Eggs, and Various mammals like Rodents.
        kangaroo.eat(); // Kangaroos Eats Grasses and Herbs!
        lion.eat(); // Lion Eats Zebras, Wildebeest, and Buffalo!
        
        cat.sleep(); // Animal Sleeping!
        dog.sleep(); // Animal Sleeping!
        snake.sleep(); // Animal Sleeping!
        kangaroo.sleep(); // Animal Sleeping!
        lion.sleep(); // Animal Sleeping!
        
        cat.walk(); // Cats  walks gracefully! 🐈
        dog.walk(); // Dog runs energetically 🐕
        snake.walk(); // Snakes slithers silently 🐍
        kangaroo.walk(); // Kangaroo Jump!
        lion.walk(); // Lion Walking!
        
        cat.poop(); // Animal Pooped!
        dog.poop(); // Animal Pooped!
        snake.poop(); // Animal Pooped!
        kangaroo.poop(); // Animal Pooped!
        lion.poop(); // Animal Pooped!
        
     
        dog.reproduction(); // Abstract
        dog.drinkWater(); // Default
        AnimalBehavior.showKingdom(); // Static Method

        
    }
}
