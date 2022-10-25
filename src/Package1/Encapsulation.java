package Package1;

public class Encapsulation {

	private int SSN;
	private int AccountNumber;
	private String EmployeeName;
	private String Emailid;
	
	public static void main(String[] args) {
		
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmailid() {
		return Emailid;
	}

	public void setEmailid(String emailid) {
		Emailid = emailid;
	}

}
