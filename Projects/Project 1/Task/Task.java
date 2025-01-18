package Task;

public class Task {
	//Declare Variables 
	private String id;
	private String name;
	private String descript;
	
	//Constructor
	public Task(String idPass, String namePass, String descriptPass) {
		if (idPass == null || idPass.length() > 10) {	//Ensure that Id is not empty and less than 11 characters long
			throw new IllegalArgumentException("Invalid Id!");
		}
		if (namePass == null || namePass.length() > 20) {	//Ensure that Name is not empty and less than 21 characters long
			throw new IllegalArgumentException("Invalid Name!"); 
		}
		if (descriptPass == null || descriptPass.length() > 50) {	//Ensure that Description is not empty and less than 51 characters long
			throw new IllegalArgumentException("Invalid Description!");
		}
		id = idPass;
		name = namePass;
		descript = descriptPass;
	}
	//Setters
	public void setName(String namePass) {
		if (namePass == null || namePass.length() > 20) {	//Ensure that Name is not empty and less than 21 characters long
			throw new IllegalArgumentException("Invalid Name!"); 
		}
		name = namePass;
	}
	public void setDescript(String descriptPass) {
		if (descriptPass == null || descriptPass.length() > 50) {	//Ensure that Description is not empty and less than 51 characters long
			throw new IllegalArgumentException("Invalid Description!");
		}
		descript = descriptPass;
	}
	//Getters
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescript() {
		return descript;
	}
}
