package JavaSE.Chapter_8_Packages.one;

// import JavaSE.Chapter_8_Packages.one.AccessTest1;

// Scope Number 2: Another Class on the Same Package.
public class AccessTest2 {
    static String[] arg = {"Ahmed", "ameen"};
    
    public static void main(String[] args) {
        // Test.main(arg); // Static Members can be accessed via Class Name directly without the need to create object
        System.out.println(AccessTest1.str);
        
        AccessTest1 tst = new AccessTest1();
        tst.iamMethod(); // Non-static members (instance member) need object to be accessed.
        
    }
}
