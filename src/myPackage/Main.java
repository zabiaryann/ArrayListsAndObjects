package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

//import java.util.ArrayList;

//Main method for testing
public class Main{
public static void main(String[] args) {
	
	// Constructor
	// Person class----------------------------------------------------
	// SECTION 1:
   /* Person person1 = new Person("Zabi aryan", 33, "4980 Franklin blvd");
    Person person2 = new Person("Aman Zah", 31, "5588 Riza ave");
    
    person1.displayInfo();
    System.out.println();
    person2.displayInfo();
    System.out.println();
    // Student Class---------------------------------------------------
    Student s1 = new Student("za",20,"123 ave","321456","CS");
    Student s2 = new Student("ba",21,"124 ave","321457","CS");
    Student s3 = new Student("za",22,"125 ave","321458","CS");
    s1.displayInfo();
    s2.displayInfo();
    s3.displayInfo();*/
    // END OF SECTION 1:
	
	// SECTION 2:
	/*ArrayList <Student> students = new ArrayList<Student>();
	Student student1 = new Student("zabi aryan",32,"123 rv blvd","id:321","Mathmatics");
	Student student2 = new Student("aman zah",30,"111 rv blvd","id:987","Physics");
	students.add(student1);
	students.add(student2);
	
	for(Student s : students) {
		s.displayInfo();
		System.out.println();
	}*/
	// END OF SECTION 2:
	
	// SECTION 3:
	// Automize it. Let user to enter the data
	ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to add students
    String input;
    do {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter major: ");
        String major = scanner.nextLine();

        students.add(new Student(name, age, address, studentId, major));

        System.out.print("Do you want to add another student? (yes/no): ");
        input = scanner.nextLine();
    } while (input.equalsIgnoreCase("yes"));

    scanner.close();
    for(Student student : students) {
    	student.displayInfo();
    	System.out.println();
    }
 }
}




