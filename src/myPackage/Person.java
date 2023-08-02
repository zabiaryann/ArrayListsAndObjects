package myPackage;

public class Person {
	
    // Instance variables
	private String name;
	private int age;
	private String address;

    // Constructor
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

    // Getter methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}

    // Setter methods
    public void setName(String name) {
    	this.name = name;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public void setAddress(String address) {
    	this.address = address;
    }

    // Method to display person information
   public void displayInfo() {
	   System.out.println("Name: "+name);
	   System.out.println("Age: "+age);
	   System.out.println("Adress: "+address);
   }
}
