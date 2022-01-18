public class BankAccount{

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;


	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

    public void deposit(int depositAmt) {
        this.balance += depositAmt;
    }

    public void withdrawal(int withdrawalAmt) {
        if(this.balance - withdrawalAmt < 0) {
			sysout
        }
    }
}