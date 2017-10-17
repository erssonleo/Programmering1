package Lektion4;

public class Application {

	public static void main(String[] args) {
		System.out.println ("Hello World");
		//Vi har skapat ett objekt av klassen person
		Person LeoPerson = new Person("Leo");
		LeoPerson.writeName();
		
		LeoPerson.setName("Fanny");
		LeoPerson.writeName();
		
	}

}
