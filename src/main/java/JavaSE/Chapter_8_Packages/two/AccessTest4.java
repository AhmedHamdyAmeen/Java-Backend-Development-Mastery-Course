package JavaSE.Chapter_8_Packages.two;

import JavaSE.Chapter_8_Packages.one.AccessTest1;

// Scope Number 3: Another Class on the Another Package with inheritance.
public class AccessTest4 extends AccessTest1 {
    
    void test() {
        this.iamMethod(); // Protected method can be accessed from the child class.
        super.iamMethod();
    }
    
    public static void main(String[] args) {
        // This doesn't work - accessing through parent class reference
        AccessTest1 tst = new AccessTest1();
        System.out.println(tst.intAttribute);  // ❌ Compilation error
        tst.iamMethod();                       // ❌ Compilation error
    }
}
