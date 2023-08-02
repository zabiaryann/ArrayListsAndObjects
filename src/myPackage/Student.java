package myPackage;

public class Student extends Person {
    // Additional instance variables specific to Student
    private String studentId;
    private String major;
    
    // Constructor for Student
    public Student(String name, int age, String address, String studentId, String major) {
    	super(name, age, address);
    	this.studentId = studentId;
    	this.major = major;
    }

    // Getter methods for Student-specific variables
    public String getStudentId() {
    	return studentId;
    }
    public String getMajor() {
    	return major;
    }
    // Setter methods for Student-specific variables
    public void setStudentId(String studentId) {
    	this.studentId = studentId;
    }
    public void setMajor(String major) {
    	this.major = major;
    }

    // Override the displayInfo method to include Student-specific information
    @Override
    // POLYMORPHISM
    public void displayInfo() {
    	super.displayInfo();
    	System.out.println("Student Id: "+studentId);
    	System.out.println("Student Major: "+ major);
    }
}