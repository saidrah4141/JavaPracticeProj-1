package ElectricityBillingSystem;

public class Customer {

	
	private String Fname;
	private String Address;
	private String meterNum;
	private String province;
	private String city;
	private String email;
	private String phnNum;
	
	public Customer(String Fnam, String Adrs, String metNum, String prov, String cit, String mail, String phn) {
		Fname = Fnam;
		Address = Adrs;
		meterNum = metNum;
		province = prov;
		city=cit;
		email=mail;
		phnNum = phn;
	}
	
	

}
