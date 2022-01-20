
public class Client {
	
	private String clientid;
	private String clientname;
	private String clientlastname;
	private String clientaddress;
	private int clientphonenumber;
	
	Client(String clientid, String clientname, String clientlastname, String clientaddress, int clientphonenumber) {
		
		this.setClientID(clientid);
		this.setClientName(clientname);
		this.setClientLastName(clientlastname);
		this.setClientAddress(clientaddress);
		this.setClientPhoneNumber(clientphonenumber);
	}
	
	Client () {
		
	}
	
	// (set & get) ClientID
	public void setClientID(String clientid) {
		this.clientid = clientid;
	}
	
	public String getClientID() {
		return this.clientid;
	}
	
	// (set & get) ClientName
	public void setClientName(String clientname) {
		this.clientname = clientname;
	}
	
	public String getClientName() {
		return this.clientname;
	}
	
	// (set & get) ClientLastName
	public void setClientLastName(String clientlastname) {
		this.clientlastname = clientlastname;
	}
	
	public String getClientLastName() {
		return this.clientlastname;
	}
	
	// (set & get) ClientAddress
	public void setClientAddress(String clientaddress) {
		this.clientaddress = clientaddress;
	}
	
	public String getClientAddress() {
		return this.clientaddress;
	}
	
	// (set & get) ClientPhoneNumber
	public void setClientPhoneNumber(int clientphonenumber) {
		this.clientphonenumber = clientphonenumber;
	}
	
	public int getClientPhoneNumber() {
		return this.clientphonenumber;
	}

}
