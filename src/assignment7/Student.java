package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {

	private String firstName;
	private String lastName;
	private int id;
	private double bearBuckBalance;

	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	public int getId() {
		return this.id;
	}

	public void depositBearBucks(double amount) {
		bearBuckBalance += amount;
	}

	public double getBearBucksBalance() {
		return bearBuckBalance;
	}
}
