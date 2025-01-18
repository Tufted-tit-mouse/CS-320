package Contact.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;


class ContactServiceTest {

	ContactService contacts = new ContactService();	//Create a vector for contacts
	
	@Test
	void testAddContact() {
		Contact testContact = new Contact("2409827", "Caleb", "Ewer", "2704985395", "400 Blane Drive");	//Create contact with specifics
		contacts.AddContact(testContact);	//Add contact to the vector
		assertTrue(!contacts.GetContacts().isEmpty());	//Tests if the vector is empty
		assertTrue(contacts.GetContacts().elementAt(0).GetId().equals("2409827"));	//Verify that the contact is in the vector
		assertTrue(contacts.GetCount() != 0);	//Verify that the count of contacts is not 0
	}
	
	@Test
	void testDeleteContactWithContact() {
		Contact testContact = new Contact("2409827", "Caleb", "Ewer", "2704985395", "400 Blane Drive");	//Create contact with specifics
		contacts.AddContact(testContact);	//Add contact to the vector
		contacts.DeleteContact(testContact);	//Delete the contact
	}
	
	@Test
	void testDeleteContactWithId() {
		Contact testContact = new Contact("2409827", "Caleb", "Ewer", "2704985395", "400 Blane Drive");	//Create contact with specifics
		contacts.AddContact(testContact);	//Add contact to the vector
		contacts.DeleteContact("2409827");	//Delete contact by ID
	}
	
	@Test
	void testUpdateByFirstName() {
		Contact testContact = new Contact("2409827", "Caleb", "Ewer", "2704985395", "400 Blane Drive");	//Create contact with specifics
		contacts.AddContact(testContact);	//Add contact to the vector
		contacts.UpdateContactFirstName("2409827", "Callie");	//Change contact first name
		assertTrue(contacts.GetContacts().elementAt(0).GetFirstName().equals("Callie"));	//Verify change
	}
	
	@Test
	void testUpdateByLastName() {
		Contact testContact = new Contact("2409827", "Caleb", "Ewer", "2704985395", "400 Blane Drive");	//Create contact with specifics
		contacts.AddContact(testContact);	//Add contact to the vector
		contacts.UpdateContactLastName("2409827", "Cansler");	//Change contact last name
		assertTrue(contacts.GetContacts().elementAt(0).GetLastName().equals("Cansler"));	//Verify change
	}
	
	@Test
	void testUpdateByPhoneNumber() {
		Contact testContact = new Contact("2409827", "Caleb", "Ewer", "2704985395", "400 Blane Drive");	//Create contact with specifics
		contacts.AddContact(testContact);	//Add contact to the vector
		contacts.UpdateContactPhoneNum("2409827", "2703487472");	//Change contact number
		assertTrue(contacts.GetContacts().elementAt(0).GetPhoneNum().equals("2703487472"));	//Verify change
	}
	
	@Test
	void testUpdateByAddress() {
		Contact testContact = new Contact("2409827", "Caleb", "Ewer", "2704985395", "400 Blane Drive");	//Create contact with specifics
		contacts.AddContact(testContact);	//Add contact to the vector
		contacts.UpdateContactAddress("2409827", "2090 Empire Road");	//Change contact address
		assertTrue(contacts.GetContacts().elementAt(0).GetAddress().equals("2090 Empire Road")); //Verify change
	}
}
