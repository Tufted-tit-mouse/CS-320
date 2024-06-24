package Contact.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	@Test
	void testNullArguments() {
		Assertions.assertThrows(IllegalArgumentException.class,  () ->{
			new Contact(null, null, null, null, null);	//Test create contact with null arguments
		});
	}
	
	Contact testContact = new Contact("2409827", "Caleb", "Ewer", "2704985395", "400 Blane Drive");	//Create contact
	
	@Test
	void testCreateNewContact() {
		assertTrue(testContact.GetId().equals("2409827"));	//Check ID
		assertTrue(testContact.GetFirstName().equals("Caleb"));	//Check First Name
		assertTrue(testContact.GetLastName().equals("Ewer"));	//Check Last Name
		assertTrue(testContact.GetPhoneNum().equals("2704985395"));	//Check Phone Number
		assertTrue(testContact.GetAddress().equals("400 Blane Drive"));	//Check Address
	}
	
	@Test
	void testIdGet() {
		assertTrue(testContact.GetId().equals("2409827"));	//Test get ID
	}
	
	@Test 
	void testFullNameSetAndGet() {
		testContact.SetFirstName("Callie");	//Set first name
		assertTrue(testContact.GetFirstName().equals("Callie"));	//Test name change
		testContact.SetLastName("Cansler");	//Set last name
		assertTrue(testContact.GetLastName().equals("Cansler"));	//Test name change
	}
	
	@Test
	void testPhoneAndAddressSetAndGet() {
		testContact.SetPhoneNum("2703487472");	//Set number
		assertTrue(testContact.GetPhoneNum().equals("2703487472"));	//Test number change
		testContact.SetAddress("2090 Empire Road");	//Set address
		assertTrue(testContact.GetAddress().equals("2090 Empire Road"));	//Test address change
	}
}
