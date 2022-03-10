package assigmentday7;

public class MyBank {
	private int customerId;
	private String name;
	private String address;
	private int accountBalance;
	
	public MyBank(int customerId , String name , String address , int accountBalance) {
		this.customerId = customerId;
		this.accountBalance = accountBalance;
		this.name = name;
		this.address = address;
		
	}
	
	public  String getDetails() {
		return customerId+"  "+name+"  "+address+"   "+accountBalance;
	}
	
	//public void setDetails(int CustomerId , String name , String address , int accountBalance) {
		//this(customerId , name , address , accountBalance);
	//}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
