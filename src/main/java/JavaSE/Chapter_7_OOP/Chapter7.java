package JavaSE.Chapter_7_OOP;

import JavaSE.Chapter_7_OOP.person.Child;
import JavaSE.Chapter_7_OOP.person.Parent;
import JavaSE.Chapter_7_OOP.person.Person;

public class Chapter7 {
    /**
     * Programming Paradigms
     * - OOP Class & Objects
     * - Fields & Methods
     * - Constructors
     * - OOP 4 Pillars
     *      - Encapsulation:
     *      Why? Getters & Setters
     *      Wny? Encapsulation
     *
     * - Access Modifiers (محددات الوصول): public - private - protected
     *      => Access Modifiers: keywords used to control the level of accessing (visibility) the Class attributes &
     *      methods.
     *      a. public: accessible to all classes - can be accessed from anywhere (inside class  - inside package -
     *         outside package)
     *      b. private: accessible inside the class only.
     *      c. protected: accessible inside class - inside other classes inside the same packages + subclasses.
     *      d. package default:
     *
     */
    
    public static void main(String[] args) {
        // 1. Default Constructor Usage:
//        System.out.println("-".repeat(10));
//        Car myCar = new Car(); // Object Creation/Instantiation
//        Car misZahraCar = new Car(); // Object Creation/Instantiation
//        Car drAlaaCar = new Car(); // Object Creation/Instantiation
//        Car engKamelCar = new Car(); // Object Creation/Instantiation
//
//
//        // Object Value Assignment
////        myCar.color = "Gray";
//        myCar.setColor("Gray");
////        myCar.brand = "Honda";
//        myCar.setBrand("Honda");
////        myCar.speed = 170;
//        myCar.setSpeed(170);
////        myCar.length = 2.30f;
//        myCar.setLength(2.30f);
////        myCar.width = 1.7f;
//        myCar.setWidth(1.7f);
////        myCar.yearOfConstructing = new Date("20-10-2020");
//        myCar.setYearOfConstructing("2027");
//        myCar.turnOn();
//        myCar.move();
//        myCar.turnOff();
//
////        misZahraCar.color = "Red";
////        misZahraCar.brand = "Jeep";
////        misZahraCar.speed = 170;
////        misZahraCar.length = 2.30f;
////        misZahraCar.width = 1.7f;
////        misZahraCar.yearOfConstructing = new Date("20-10-2026");
//        misZahraCar.turnOn();
//        misZahraCar.move();
//        misZahraCar.turnOff();
//
////        drAlaaCar.color = "Genzary";
////        drAlaaCar.brand = "Honda";
////        drAlaaCar.speed = 170;
////        drAlaaCar.length = 2.30f;
////        drAlaaCar.width = 1.7f;
////        drAlaaCar.yearOfConstructing = new Date("20-10-2025");
//        drAlaaCar.turnOn();
//        drAlaaCar.move();
//        drAlaaCar.turnOff();
//
////        engKamelCar.color = "Blue";
////        engKamelCar.brand = "Honda";
////        engKamelCar.speed = 170;
////        engKamelCar.length = 2.30f;
////        engKamelCar.width = 1.7f;
////        engKamelCar.yearOfConstructing = new Date("20-10-2020");
//        engKamelCar.turnOn();
//        engKamelCar.move();
//        engKamelCar.turnOff();
//
//        System.out.println("-".repeat(10));
//        // 2. Use the Parametrized Constructor
//        Car misSalmaCar = new Car("Green", 50, 170f, 2f, "Honda");
//        misSalmaCar.setBrand("Jeep");
//        System.out.println(misSalmaCar.getBrand());
//        Car watenCar = new Car(1f, 1.5f, 10);
//        System.out.println(misSalmaCar.getColor());
//        System.out.println(myCar.getColor()
//                                .equals(misZahraCar.getColor())); // Each object has its value.
//
//
        
        
        /*
         -------------------------------------------
         Inheritance:
         -------------------------------------------
        */
        
        // Object Definition
        Person person = new Person(22, "Blue", 1.70, "Person", 70); // Up-casting
        Parent father = new Parent(28, "Gray", 1.90, "Mohamed", 85, "Father", "Aggressively");
        Parent mother = new Parent(28, "Gray", 1.90, "Monera", 85, "Mother", "Calm");
        Child child = new Child(28, "Gray", 1.90, "Ebrahim", 85, "Friendly");
        Child child2 = new Child(28, "blue", 1.90, "Nour", 85, "Aggressively");
        
        // Inherit Getters & Setters
        System.out.println(person.getName());
        System.out.println(father.getName());
        System.out.println(mother.getName());
        System.out.println(child.getName());
        
        // Inherit Direct Constant Attribute
        int averageFamilyAge = person.AVERAGE_FAMILY_AGE;
        int averageFamilyAge2 = father.AVERAGE_FAMILY_AGE;
        int averageFamilyAge3 = mother.AVERAGE_FAMILY_AGE;
        int averageFamilyAge4 = child.AVERAGE_FAMILY_AGE;
        
        // Inherit Methods/Behaviors
        person.speak();
        father.speak();
        mother.speak();
        child.speak();
        child2.speak();
        
        
    }
}
