public class AccountHolder {
	private int SSN;
	private String name;
	private String number;
	private String address;
	public AccountHolder(int SSN, String name, String number, String address) {
		this.SSN = SSN;
		this.name = name;
		this.number = number;
		this.address = address;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int SSN) {
		this.SSN= SSN;
	}
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number= number;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address= address;
	}
}