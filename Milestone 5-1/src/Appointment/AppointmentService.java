package Appointment;
import java.util.Vector;



import java.util.Date;

public class AppointmentService {
	private Vector<Appointment> appointments = new Vector<Appointment>();
	private int count = 0;
	//Getters
		public int getCount() {
			return count;
		}
		public Vector<Appointment> getAppointments(){
			return appointments;
		}
	//Add and Remove methods	
	public void addAppointment(String idPass, Date datePass, String descriptPass) {
	Appointment newAppointment = new Appointment(idPass, datePass, descriptPass);
		appointments.add(newAppointment);
		count++;
	}
	public void addAppointment(Appointment appointmentPass) {
		appointments.add(appointmentPass);
		count++;
	}
	public void deleteAppointment(String id) {
		if (id == null || id.length() >10) {
			throw new IllegalArgumentException("Invalid ID!");
		}
		if (appointments.isEmpty()) {
			throw new IllegalArgumentException("There are no tasks!");
		}
		int index = -1;
		for (Appointment appointment: appointments) {
			if (appointment.getId() == id) {
				index = appointments.indexOf(appointment);
			}
		}
		if (index == -1) {
			throw new IllegalArgumentException("No appointment with that ID");
		}
		else {
			appointments.remove(index);
			count--;
		}
	}
}
