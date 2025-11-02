package JavaSE.Chapter_9_MathDateTime;

public class MathDemo {
    public static void main(String[] args) {
        
        // avg + min + max + pow + sqrt + Floor + Celling + random
        
        int number1 = 10;
        int number2 = 20;
        
        int minimum = Math.min(number1, number2);
        System.out.println(minimum);
        int maximum = Math.max(number1, number2);
        System.out.println(maximum);
        
        double power = Math.pow(2, 2);// 2 * 2  = 4 ==> 2^2
        double power2 = Math.pow(3, 2);// 3 * 3  = 9 ==> 3^2
        System.out.println(power);
        System.out.println(power2);
        
        double sqrt = Math.sqrt(25); // 5
        System.out.println(sqrt);
        int abs = Math.abs(-500);
        System.out.println(abs);
        
        double random = Math.random(); // Generate Random number from 0.0 to 1.0
        int random1 = (int) (random * 10); // Generate Random number from 0 to 10
        int random2 = (int) (random * 100); // Generate Random number from 10 to 100
        int random3 = (int) (random * 1000); // Generate Random number from 100 to 1000
        int random4 = (int) (random * 10000); // Generate Random number from 1000 to 10000S
        // (int) random * 100 => zero
        System.out.println(random);
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
        System.out.println(random4);
        
        
        
        
    }
}
