package JavaSE.Chapter_7_OOP.Car;

public class Car { // Blueprint or design of cars.
    // Any class is a custom reference data type.
    
    // 1. Data Members -> named as Field/ Attribute Represented as normal variables
    private String color;
    private int speed;
    private float width;
    private  float length;
    private String brand;
    private  String yearOfConstructing;
    private  String currentMovingDirection = "forward"; // left, right, forward or backward
    private  boolean isOn;
    // float[] dimension;
    
    // Object Creation/Instantiation performed using Constructors
    // Constructor: Special method called automatically used to initialize the data member values while creating new
    // object from the class.
    
    
    // Mimic of the default constructor.
    // Default Constructor: is a no-argument constructor created by default when there is no custom constructor
    // defined. It used to initialize the objects with default values of the instance class attribute.
//    Car() {
//        this.speed = 0;
//        this.width = 0f;
//        this.length = 0f;
//        this.brand = null;
//        this.yearOfConstructing = null;
//        this.currentMovingDirection = "forward"; // left, right, forward or backward
//        this.isOn = false;
//    }
    
    // Empty Constructor: No Argument Constructor
    // We use the no arg constructor to initialize the default values.
    Car() {
        this.color = "Gray";
        this.yearOfConstructing = "2025";
        this.currentMovingDirection = "forward";
    }
    
    Car(float width, float length, int speed) {
        this();
        this.width = width;
        this.length = length;
        this.speed = speed;
    }
    
    // Parametrized Constructor
    Car(String color, int speed, float width, float length, String brand) {
        this(width, length, speed); // this() -> used to call constructor from another constructor of the same class.
        this.color = color;
        this.length = length;
        this.brand = brand;
        this.isOn = false;
    }
    // * Note: Constructor Overloading: More than once constructor of the same class but have different signature.
    // * Note: this keyword: is a java keyword used to refer to the current instantiated/created object.
    // a. used to refer to the current instantiated object's attributes (to avoid the confusion when the constructor
    // parameters and the class attributes have the same name).
    // b. check notion.
    // c. check notion.
    // * Note: this(); method: is a java method used to call constructor from another constructor of the same class.
    // this() used to avoid the redundancy & increase the reusability.
    
    
    // 2. Behavior -> named/represented as Functions/Methods
    public void makeSound() {
        System.out.println("Beb Beb Beb");
    }
    
    public void turnOn() {
        System.out.println("Car is on");
        isOn = true;
    }
    
    public void turnOff() {
        System.out.println("Car is off");
        isOn = false;
    }
    
    public void move() {
        // Determine the direction
        System.out.println("Car is moving in: " + currentMovingDirection + " direction");
    }
    
    public void turnLeft() {
        System.out.println("Car is turning left");
        currentMovingDirection = "left";
    }
    
    public void turnRight() {
        System.out.println("Car is turning right");
        currentMovingDirection = "right";
    }
    
    public void moveBackwards() {
        System.out.println("Car is moving backwards");
        currentMovingDirection = "backwards";
    }
    
    public void moveForwards() {
        System.out.println("Car is moving forwards");
        currentMovingDirection = "forwards";
    }
    
    public void breaking() {
        System.out.println("Car is breaking");
        speed = 0;
    }
    
    public void accelerating(int increment) {
        System.out.println("Car is accelerating");
        speed += increment;
    }
    
    public void decelerating(int decrement) {
        System.out.println("Car is decelerating");
        speed -= decrement;
        // speed = speed - decrement;
    }
    
    
    // Penitents of Encapsulation? Why we use Encapsulation's Getters/Setters?
    // 1. Data hiding (using private access modifiers) increase the security.
    // 2. Layer of control over the data:
    // Read-only (by providing getters only)
    // Write-only (by providing setters only)
    // Validation: Conditional Setting or Getting
    // Transformation (ex: password encryption/description)
    // 3. Increase Flexibility & Modularity & Reusability & Maintainability
    
    // Setter: assign value to the data
    // Getter: retrieve the data
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        if (this.brand == null || this.brand.isEmpty()) // Validation: restrict the reassign of value to the brand
            this.brand = brand;
        else System.out.println("You can't reassign the brand attribute");
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getCurrentMovingDirection() {
        return currentMovingDirection;
    }
    
    public void setCurrentMovingDirection(String currentMovingDirection) {
        this.currentMovingDirection = currentMovingDirection;
    }
    
    public boolean isOn() {
        return isOn;
    }
    
    public void setOn(boolean on) {
        isOn = on;
    }
    
    public float getLength() {
        return length;
    }
    
    public void setLength(float length) {
        this.length = length;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public float getWidth() {
        return width;
    }
    
    public void setWidth(float width) {
        this.width = width;
    }
    
    public String getYearOfConstructing() {
        return yearOfConstructing;
    }
    
    public void setYearOfConstructing(String yearOfConstructing) {
        this.yearOfConstructing = yearOfConstructing;
    }
}
