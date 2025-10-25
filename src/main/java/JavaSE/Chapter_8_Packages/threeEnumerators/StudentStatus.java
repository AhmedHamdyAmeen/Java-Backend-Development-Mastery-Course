package JavaSE.Chapter_8_Packages.threeEnumerators;

public enum StudentStatus {
    // An enum (enumeration) is a special Java type used to define a collection of named constants.
    // i.e. used to define a set of predefined constant values.
    // provide type safety and avoid the hard coded string values.
    ACTIVE(1, "User is registered and go to the school daily."),
    INACTIVE(2, "User is registered and doesn't go to the school daily."),
    TERMINATED(3, "User is terminated."),
    SUSPENDED(4, "User is suspended till completing his papers."),
    GRADUATED(5, "User is graduated.");
    
    private int code;
    private String description;
    
    StudentStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public int getCode() {
        return code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
