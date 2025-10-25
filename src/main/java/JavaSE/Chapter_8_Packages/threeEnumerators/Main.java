package JavaSE.Chapter_8_Packages.threeEnumerators;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Student studentOne = new Student("Ameen", 7, "amen@example.com", "010102022355", "Cairo", StudentStatus.ACTIVE);
        Student studentTwo = new Student(
                "Amenah", 7, "amenah@example.com", "010102022355", "Cairo", StudentStatus.TERMINATED);
        Student studentThree = new Student(
                "Amany", 7, "amany@example.com", "010102022355", "Cairo", StudentStatus.SUSPENDED);
        // Student studentFour = new Student("Amany", 7, "amany@example.com", "010102022355", "Cairo", "FAILED"); //
        // Error: ❌ Expected a value from the StudentStatus Enum not a hard coded string value.
        
        studentOne.issuingCertificate();
        studentTwo.issuingCertificate();
        studentThree.issuingCertificate();
        
        ///  Student Activated
        studentTwo.activateStudent();
        studentThree.activateStudent();
        System.out.println(studentOne.getStatus());
        System.out.println(studentTwo.getStatus());
        System.out.println(studentThree.getStatus());
        
        
        // Student Graduated
        studentOne.changeStatus(StudentStatus.GRADUATED);
        studentTwo.changeStatus(StudentStatus.GRADUATED);
        studentThree.changeStatus(StudentStatus.GRADUATED);
        
        System.out.println(studentOne.getStatus());
        System.out.println(studentTwo.getStatus());
        System.out.println(studentThree.getStatus());
        
        studentOne.issuingCertificate();
        studentTwo.issuingCertificate();
        studentThree.issuingCertificate();
        
        System.out.println(StudentStatus.ACTIVE.getCode() + " : " + StudentStatus.ACTIVE.getDescription());
        
        // Enums Methods:
        System.out.println(Arrays.deepToString(StudentStatus.values())); // return the enum values as an arrays.
        System.out.println(StudentStatus.SUSPENDED.name()); // return the enum value as a String
        System.out.println(StudentStatus.INACTIVE.ordinal()); // return the index order of enum value.
        System.out.println(StudentStatus.valueOf("INACTIVE")
                                        .getCode()); // used in search
        // System.out.println(StudentStatus.valueOf("INACTIVE2")); // Error: ❌ No enum constant JavaSE.Chapter_8_Packages.threeEnumerators.StudentStatus.INACTIVE2
        
        // How we can loop on the enum values?
        System.out.println("-".repeat(10));
        for (StudentStatus status : StudentStatus.values()) {
            System.out.println(status.name());
            System.out.println(status.getCode());
            System.out.println(status.getDescription());
            System.out.println("-".repeat(10));
        }
    }
}
