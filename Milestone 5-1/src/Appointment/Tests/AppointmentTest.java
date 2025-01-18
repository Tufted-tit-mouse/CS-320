package Appointment.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;
import Appointment.Appointment;
class AppointmentTest {

	@Test
	void testNullArguments() {
		Assertions.assertThrows(IllegalArgumentException.class,  () ->{
			new Appointment(null, null, null);	//Test create Appointment with null arguments
		});
	}
	long dateNum = 2000000000000L;	//Set long for date to "Tue May 17 23:33:20 EDT 2033"
	Date testDate = new Date(dateNum);	//Set Date to "Tue May 17 23:33:20 EDT 2033"
	Appointment appointmentTest = new Appointment("2409827", testDate, "Caleb Ewer Milestone 4-1 Appointment");	//Create appointment with parameters for testing
	
	@Test	
	void testDateSetAndGet() {
		assertEquals(testDate, appointmentTest.getDate());
		dateNum = 2000000000001L;
		testDate.setTime(dateNum);
		appointmentTest.setDate(testDate);
		assertEquals(testDate, appointmentTest.getDate());
	}
	
	@Test
	void testDescriptionSetAndGet() {
		assertEquals("Caleb Ewer Milestone 4-1 Appointment", appointmentTest.getDecription());
		appointmentTest.setDescription("Caleb Ewer Milestone 5-1 Appointment");
		assertEquals("Caleb Ewer Milestone 5-1 Appointment", appointmentTest.getDecription());
	}
}
