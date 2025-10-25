package JavaSE.Chapter_7_OOP.animal;

import java.util.ArrayList;

/**
 * Notes:
 * Concrete Class (class that hs an implementation for all of its methods) x> Abstract Class
 *
 * What is Abstraction (General Concept)?
 * What is the meaning of Abstraction in Java OOP?
 * Why Abstraction?
 * - Abstract Class: allow us to create blueprint/template for the concrete classes.
 *
 * How to implement Abstraction in Java?
 *  1. Abstract Class: Class can't be instantiated and can contain one or more abstract methods (method without implementation/body).
 *      - Partial Abstraction
 *      - Can contain Constructors.
 *      - Cant be instantiated.
 *      - Note: As the concrete class is a blueprint for the objects, the Abstract class is a blueprint for the
 *      concrete subclasses.
 *      - There is no abstract constructor.
 *      - There is no static abstract method. static method can't be abstract.
 *      - There is no final abstract method.
 *      - There is no private abstract method.
 *
 *  2. Interface: contract
 *      - Interfaces doesn't have constructors.
 *      - Can be instantiated.
 *      - It is a blueprint/template of a class.
 *      - Fully abstraction before java 8.
 *      - We didn't need `abstract` keyword in interface. Every method inside the interface assumed to be abstract.
 *      - Interface support multiple inheritance.
 *      - Interface Naming Convention: suffix with "able". ex: Movable, Serializable, and Comparable. or prefixed with "can" ex:CanMove, CanSerialized
 *      - any attribute inside the interface is a public static final by default. any method inside the interface is public abstract method by default.
 *
 * What is the difference between the abstract class & interface? Interview Question.
 * - You can implement more than one interface but extend one abstract class only.
 * - Interface can't contain instance data member. Interface can contain static or final attributes/fields only. While the abstract class can contains instance data members (non-static attributes/fields).
 * - Every field in interface is automatically static (value accessible by the interface name directly).
 *
 * Abstract Class enforce or organize exactly what every subclass should to do.
 * Interface make the testing easy.
 * abstract can extend another abstract
 *
 * Case for geeks: if we have two interfaces with duplicate method, and there is another class implement the two
 * interfaces what will be happened?.
 *
 * Which Java types can implement Interfaces?
 *  - Any Java Class.
 *  - Any Abstract Class.
 *  - Any Nested Class.
 *  - Java Enums.
 *  - Java Dynamic Proxy.
 *
 */
public class Main {
    
    // final int age; // Error ❌: Variable age might not have been initialized
    
    public static void main(String[] args) {
        Animal animal;
        // animal = new Animal(); // Error ❌: Cant instantiate Abstract Class.
        animal = new Cat(); // up-casting (implicit casting)
        
        Cat cat = new Cat();
        DogImplementation dog = new DogImplementation();
        AnimalBehavior dog2 = new DogImplementation(); // We can use the interface type as reference variable type
        // AnimalBehavior dog3 = new AnimalBehavior(); // Error ❌: The `AnimalBehavior` is abstract cannot be instantiated.
        Snake snake = new Snake();
        Snake snake2 = new Snake();
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
        
        System.out.println("Max age: " + AnimalBehavior.MAX_AGE); // Static Interface Attribute
        
        animalEating(cat);
        animalEating(dog);
        animalEating(kangaroo);
        animalEating(lion);
        animalEating(snake);
        
        Cat cat2 = new Cat(1.2f, "Gray", "Mail", Boolean.TRUE, "Cat", "Chrazy");
        Cat cat3 = new Cat(0.2f, "White", "Female", Boolean.FALSE, "Cat", "Sami");
        Cat cat4 = new Cat(3.2f, "Yellow", "Mail", Boolean.TRUE, "Cat", "LLLL");
        Cat cat5 = new Cat(2.5f, "Gray", "Female", Boolean.TRUE, "Cat", "RRRR");
        
       // System.out.println("Max age: " + Animal.MAX_AGE);
        System.out.println("Cat Color: " + cat2.getColor() + " and max age: " + Cat.MAX_AGE);
        System.out.println("Cat Color: " + cat3.getColor() + " and max age: " + Cat.MAX_AGE);
        System.out.println("Cat Color: " + cat4.getColor() + " and max age: " + Cat.MAX_AGE);
        System.out.println("Cat Color: " + cat5.getColor() + " and max age: " + Cat.MAX_AGE);
        
        Animal animal1 = new Animal() {
            @Override
            public void walk() {
            
            }
            
            @Override
            public void eat() {
            
            }
        }; // Anonymous Inner Class -> Nested Class without name, ued to Implement the abstract class on the fly.


    }
    
    /*
     * Using the Abstract Class or method as data type of the method parameter type make the method generic and can accept any type of object belongs to the superclass Animal.
     */
    
    public static void animalEating(Animal animal) {
        animal.eat();
    }
}
