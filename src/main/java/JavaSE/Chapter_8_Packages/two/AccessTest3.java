package JavaSE.Chapter_8_Packages.two;

import JavaSE.Chapter_8_Packages.one.AccessTest1;

// Scope Number 3: Another Class on the Another Package without inheritance.
public class AccessTest3 {
    public static void main(String[] args) {
        AccessTest1 tst = new AccessTest1();
        tst.iamMethod();
    }
}
