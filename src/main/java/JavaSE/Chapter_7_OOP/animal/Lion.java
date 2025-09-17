package JavaSE.Chapter_7_OOP.animal;

import java.sql.SQLOutput;

public class Lion extends Animal {
    
    @Override
    public void walk() {
        System.out.println("Lion Walking!");
    }
    
    @Override
    public void eat() {
        System.out.println("Lion Eats Zebras, Wildebeest, and Buffalo!");
    }
}
