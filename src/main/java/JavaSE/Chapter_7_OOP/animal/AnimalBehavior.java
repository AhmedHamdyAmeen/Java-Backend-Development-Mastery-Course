package JavaSE.Chapter_7_OOP.animal;

import java.io.Serializable;

public interface AnimalBehavior {
    // What is the interface?
    // Is one of the Java Components, used to achieve the abstraction and provide contract for the classes.
    // Add Extra Feature.
    
    // * Final Attributes: any attributes inside an interface treated as `public static final` by default.
    final static int MAX_AGE = 100;
    String KINGDOM = "Animalia Kingdom";
    
    // * Default & Static & Abstract Functions/Behaviors/Methods Allowed
    // 1. abstract method:
    // Note: By default every method inside an interface is treated as "Public Abstract Method" so we don't have to add the
    // `abstract` keyword explicitly.
    abstract void reproduction(); // Abstract method
    
    // 2. Default Method: Is a method inside an interface but with implementation
    default void drinkWater() {
        System.out.println("This animal is drinking water");
    }
    
    // 3. Static Method: Is a method belongs to the Class/Interface itself and can be called directory using the Class/Interface name without needing to create new objects.
    static void showKingdom() {
        System.out.printf("All animals belong to the: %s 🌍\n", KINGDOM);
    }
    
    /**
     * Interface have:
     * - Abstract methods (until Java 7).
     * - From Java 8 → can have `default` & `static` methods.
     * - From Java 9 → can have `private` methods.
     *
     */
    
    // ! Constructors not allowed in interface.
    // public AnimalBehavior() {}
    // ! Setters & Getters not allowed in interface. due to the `private` attributes aren't allowed in the interfaces.
}
