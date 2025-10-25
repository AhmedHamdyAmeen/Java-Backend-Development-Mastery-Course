package JavaSE.Chapter_7_OOP.animal;

public class Cat extends Animal {
    
    public Cat() {
    }
    
    public Cat(float age, String color, String gender, Boolean isMature, String name, String type) {
        super(age, color, gender, isMature, name, type);
    }
    
    @Override
    public void eat() {
        System.out.println("Cats Eating Fishes!");
    }
    
    @Override
    public void walk() {
        System.out.println("Cats  walks gracefully! 🐈");
    }
    

//    public void setAttributeName (int attributeValue) {
//        this.attributeName = attributeValue;
//    }
//
//    public int getAttributeValue() {
//        return this.attributeValue;
//    }
}
