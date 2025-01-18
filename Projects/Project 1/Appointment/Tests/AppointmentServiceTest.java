package Appointment.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Date;
import Appointment.Appointment;
import Appointment.AppointmentService;

class AppointmentServiceTest {
	
	AppointmentService appointments = new AppointmentService();
	
	@Test
	void testAddAppointment() {
		long dateNum = 2000000000000L;	//Set long for date to "Tue May 17 23:33:20 EDT 2033"
		Date testDate = new Date(dateNum);	//Set Date to "Tue May 17 23:33:20 EDT 2033"
		Appointment appointmentTest = new Appointment("2409827", testDate, "Caleb Ewer Milestone 4-1 Appointment");	//Create appointment with parameters for testing
		appointments.addAppointment(appointmentTest.getId(), appointmentTest.getDate(), appointmentTest.getDecription());
		assertTrue(!appointments.getAppointments().isEmpty());	//Tests if the vector is empty
		assertTrue(appointments.getAppointments().elementAt(0).getId().equals("2409827"));	//Verify that the appointment is in the vector
		assertTrue(appointments.getCount() != 0);	//Verify that the count of appointments is not 0
	}
	@Test
	void testDeleteAppointment() {
		long dateNum = 2000000000000L;	//Set long for date to "Tue May 17 23:33:20 EDT 2033"
		Date testDate = new Date(dateNum);	//Set Date to "Tue May 17 23:33:20 EDT 2033"
		Appointment appointmentTest = new Appointment("2409827", testDate, "Caleb Ewer Milestone 4-1 Appointment");	//Create appointment with parameters for testing
		appointments.addAppointment(appointmentTest.getId(), appointmentTest.getDate(), appointmentTest.getDecription()); //Add appointment to appointments
		assertTrue(appointments.getCount() == 1); //Verify that the appointment was added
		appointments.deleteAppointment("2409827");	//Delete appointment
		assertTrue(appointments.getCount() == 0); 	//Verify that the appointment was deleted
	}

}
