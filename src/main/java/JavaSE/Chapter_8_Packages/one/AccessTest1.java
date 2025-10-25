package JavaSE.Chapter_8_Packages.one;

import java.util.StringJoiner; // Specific Import/single-type import
import java.util.ArrayList;
import java.util.Scanner;
// import java.util.*; // on demand: import all -> Wildcard used to import the package/directory as whole (Import all the classes under the same package).
import static java.lang.Math.PI; // Static Import

// Scope Number 1: Class Scope
public class AccessTest1 {
    
    // Access Modifiers Control: private, protected, public, defaults (package-private).
    static String str;
    public int intAttribute;
    Long longAttributes;
    
    
    public void iamMethod() {
        System.out.println("iamMethod I do nothing");
    }
    
    private void youAreMethod() {
        System.out.println("iamMethod I do nothing");
        iamMethod();
    }
    
    
    public static void main(String[] args) {
        // java.lang package is automatically imported.
        String ameen = "My name is Ameen";
        Long myLong = 6L; // java.lang is automatically imported
        ArrayList<String> myArray = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        StringJoiner yourVar;
        
        System.out.println(AccessTest2.arg);
        System.out.println(PI);
        
        
    }
    
    
}