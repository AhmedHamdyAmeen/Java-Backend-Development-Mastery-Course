package JavaSE.Chapter_8_Packages.threeEnumerators;

public class Student {

    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;
    private String nationality;
    // private String status; // ACTIVE INACTIVE TERMINATED SUSPENDED GRADUATED
    private StudentStatus status;

    public Student(String name, int age, String email, String phone, String address, StudentStatus status) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getStatus() {
        return status.toString();
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }


    public void activateStudent() {
        this.status = StudentStatus.ACTIVE;
    }

    public void deactivateStudent() {
        this.status = StudentStatus.INACTIVE;
    }

    public void changeStatus(StudentStatus status) {
        this.status = status;
    }

    public void issuingCertificate() {
        // Validate if Student Graduated or not
        if (this.status.equals(StudentStatus.GRADUATED)) {
            System.out.println("Student: " + this.name + " Is Graduated ✅");
        } else {
            System.out.println("Student: " + this.name + " Is Not Graduated ❌");
        }
    }
}
