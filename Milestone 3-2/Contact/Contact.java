package Contact;
public class Contact {
		
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	
	public Contact(String idPass, String firstNamePass, String lastNamePass, String phoneNumPass, String addressPass) {	//Constructor
		if (idPass == null || idPass.length() > 10) {	//Check if ID is null or longer than 10 characters
			throw new IllegalArgumentException("Invalid ID!");
		}
		if (firstNamePass == null || firstNamePass.length() > 10) {	//Check if First Name is null or longer than 10 characters
			throw new IllegalArgumentException("Invalid First Name!");
		}
		if (lastNamePass == null || lastNamePass.length() > 10) {	//Check if Last Name is null or longer than 10 characters
			throw new IllegalArgumentException("Invalid Last Name!");
		}
		if (phoneNumPass == null || phoneNumPass.length() > 10 || phoneNumPass.length() < 10) {	//Check if Phone Number is null or exactly 10 characters
			throw new IllegalArgumentException("Invalid Phone Number!");
		}
		if (addressPass == null || addressPass.length() > 30) {	//Check if Address is null or longer than 30 characters
			throw new IllegalArgumentException("Invalid Address!");
		}
		
		id = idPass;
		firstName = firstNamePass;
		lastName = lastNamePass;
		phoneNum = phoneNumPass;
		address = addressPass;
	}
	
	//Setters
	public void SetFirstName(String firstNamePass) {
		if (firstNamePass == null || firstNamePass.length() > 10) {	//Check if First Name is null or longer than 10 characters
			throw new IllegalArgumentException("Invalid First Name!");
		}
		firstName = firstNamePass;
	}
	public void SetLastName(String lastNamePass) {
		if (lastNamePass == null || lastNamePass.length() > 10) {	//Check if Last Name is null or longer than 10 characters
			throw new IllegalArgumentException("Invalid Last Name!");
		}
		lastName = lastNamePass;
	}
	public void SetPhoneNum(String phoneNumPass) {
		if (phoneNumPass == null || phoneNumPass.length() > 10 || phoneNumPass.length() < 10) {	//Check if Phone Number is null or exactly 10 characters
			throw new IllegalArgumentException("Invalid Phone Number!");
		}
		phoneNum = phoneNumPass;
	}
	public void SetAddress(String addressPass) {
		if (addressPass == null || addressPass.length() > 30) {	//Check if Address is null or longer than 30 characters
			throw new IllegalArgumentException("Invalid Address!");
		}
		address = addressPass;
	}
	
	//Getters
	public String GetId() {
		return id;
	}
	public String GetFirstName() {
		return firstName;
	}
	public String GetLastName() {
		return lastName;
	}
	public String GetPhoneNum() {
		return phoneNum;
	}
	public String GetAddress() {
		return address;
	}
}
