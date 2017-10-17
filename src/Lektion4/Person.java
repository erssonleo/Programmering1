package Lektion4;

public class Person {

	private String name;

	public Person() {

	}

	public Person(String name) {
		this.name = name;

	}
	
	public void writeName () {
		System.out.println("My namne is " +name);
	
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
}
