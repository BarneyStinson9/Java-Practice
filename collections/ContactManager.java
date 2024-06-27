package collections;

import java.util.ArrayList;

	class Contact {
	    String name;
	    String phone;
	    String email;

	    Contact(String name, String phone, String email) {
	        this.name = name;
	        this.phone = phone;
	        this.email = email;
	    }

	    @Override
	    public String toString() {
	        return "name='" + name + "', phone='" + phone + "', email='" + email +"";
	    }
	}

	public class ContactManager {
	    public static void main(String[] args) {
	        ArrayList<Contact> contacts = new ArrayList<>();

	        // Adding contacts
	        contacts.add(new Contact("John Doe", "123-456-7890", "john@example.com"));
	        contacts.add(new Contact("Jane Smith", "098-765-4321", "jane@example.com"));

	        // Printing contacts
	        for (Contact contact : contacts) {
	            System.out.println(contact);
	        }
	    }
	}


