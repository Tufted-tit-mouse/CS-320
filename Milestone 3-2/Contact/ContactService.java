package Contact;

import java.util.Vector;
//import java.util.Random;

public class ContactService {
	private Vector<Contact> contacts = new Vector<Contact>();
	private int count = 0;
	
	//Getters
	public int GetCount() {
		return count;
	}
	public Vector<Contact> GetContacts(){
		return contacts;
	}
	
	public void AddContact(String id, String firstName, String lastName, String phoneNum, String address) {
		Contact newContact = new Contact(id, firstName, lastName, phoneNum, address);
		contacts.add(newContact);
		count++;
	}
	public void AddContact(Contact newContact) {
		contacts.add(newContact);
		count++;
	}
	public void DeleteContact(String id) {
		if (id == null || id.length() >10) {
			throw new IllegalArgumentException("Invalid ID!");
		}
		if (contacts.isEmpty()) {
			throw new IllegalArgumentException("There are no contacts!");
		}
		int index = -1;
		for (Contact contact: contacts) {
			if (contact.GetId() == id) {
				index = contacts.indexOf(contact);
			}
		}
		if (index == -1) {
			throw new IllegalArgumentException("No contact with that ID");
		}
		else {
			contacts.remove(index);
			count--;
		}
	}
	public void DeleteContact(Contact contact) {
		contacts.remove(contact);
		count--;
	}
	public void UpdateContact(String id, String firstName, String lastName, String phoneNum, String address) {
		if (id == null || id.length() >10) {
			throw new IllegalArgumentException("Invalid ID!");
		}
		if (contacts.isEmpty()) {
			throw new IllegalArgumentException("There are no contacts!");
		}
		int index = -1;
		for (Contact contact: contacts) {
			if (contact.GetId() == id) {
				index = contacts.indexOf(contact);
			}
		}
		if (index == -1) {
			throw new IllegalArgumentException("No contact with that ID");
		}
		else {
			Contact updateContact = contacts.get(index);
			updateContact.SetFirstName(firstName);
			updateContact.SetLastName(lastName);
			updateContact.SetPhoneNum(phoneNum);
			updateContact.SetAddress(address);
			contacts.remove(index);
			contacts.add(updateContact);
		}
	}
	public void UpdateContactFirstName(String id, String firstName) {
		if (id == null || id.length() >10) {
			throw new IllegalArgumentException("Invalid ID!");
		}
		if (contacts.isEmpty()) {
			throw new IllegalArgumentException("There are no contacts!");
		}
		int index = -1;
		for (Contact contact: contacts) {
			if (contact.GetId() == id) {
				index = contacts.indexOf(contact);
			}
		}
		if (index == -1) {
			throw new IllegalArgumentException("No contact with that ID");
		}
		else {
			Contact updateContact = contacts.get(index);
			updateContact.SetFirstName(firstName);
			DeleteContact(contacts.elementAt(index));
			AddContact(updateContact);
		}
	}
	public void UpdateContactLastName(String id, String LastName) {
		if (id == null || id.length() >10) {
			throw new IllegalArgumentException("Invalid ID!");
		}
		if (contacts.isEmpty()) {
			throw new IllegalArgumentException("There are no contacts!");
		}
		int index = -1;
		for (Contact contact: contacts) {
			if (contact.GetId() == id) {
				index = contacts.indexOf(contact);
			}
		}
		if (index == -1) {
			throw new IllegalArgumentException("No contact with that ID");
		}
		else {
			Contact updateContact = contacts.get(index);
			updateContact.SetLastName(LastName);
			DeleteContact(contacts.elementAt(index));
			AddContact(updateContact);
		}
	}
	public void UpdateContactPhoneNum(String id, String phoneNum) {
		if (id == null || id.length() >10) {
			throw new IllegalArgumentException("Invalid ID!");
		}
		if (contacts.isEmpty()) {
			throw new IllegalArgumentException("There are no contacts!");
		}
		int index = -1;
		for (Contact contact: contacts) {
			if (contact.GetId() == id) {
				index = contacts.indexOf(contact);
			}
		}
		if (index == -1) {
			throw new IllegalArgumentException("No contact with that ID");
		}
		else {
			Contact updateContact = contacts.get(index);
			updateContact.SetPhoneNum(phoneNum);
			DeleteContact(contacts.elementAt(index));
			AddContact(updateContact);
		}
	}
	public void UpdateContactAddress(String id, String address) {
		if (id == null || id.length() >10) {
			throw new IllegalArgumentException("Invalid ID!");
		}
		if (contacts.isEmpty()) {
			throw new IllegalArgumentException("There are no contacts!");
		}
		int index = -1;
		for (Contact contact: contacts) {
			if (contact.GetId() == id) {
				index = contacts.indexOf(contact);
			}
		}
		if (index == -1) {
			throw new IllegalArgumentException("No contact with that ID");
		}
		else {
			Contact updateContact = contacts.get(index);
			updateContact.SetAddress(address);
			DeleteContact(contacts.elementAt(index));
			AddContact(updateContact);
		}
	}
}
