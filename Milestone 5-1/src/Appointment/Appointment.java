package Appointment;
import java.util.Date;

public class Appointment {
	private String id;
	private Date date;
	private String descript;
	
	public Appointment(String idPass, Date datePass, String descriptPass) {
		if (idPass == null || idPass.length() > 10) {
			throw new IllegalArgumentException("Invalid ID!!");
		}
		if (datePass == null || datePass.before(new Date())) {
			throw new IllegalArgumentException("Invalid Date!");
		}
		if (descriptPass == null || descriptPass.length() > 50) {
			throw new IllegalArgumentException("Invalid Description!");
		}
		id = idPass;
		date = datePass;
		descript = descriptPass;
	}
	
	//Setters
	public void setDate(Date datePass) {
		if (datePass == null || datePass.before(new Date())) {
			throw new IllegalArgumentException("Invalid Date!");
		}
		date = datePass;
	}
	public void setDescription(String descriptPass) {
		if (descriptPass == null || descriptPass.length() > 50) {
			throw new IllegalArgumentException("Invalid Description!");
		}
		descript = descriptPass;
	}
	
	//Getters
	public String getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	public String getDecription() {
		return descript;
	}
}
