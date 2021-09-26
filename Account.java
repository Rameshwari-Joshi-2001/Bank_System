package logic;
public abstract class Account {
	private static int allotNumber = 0 ;
	private int accNo;
	private double balance;
	private String name;
	// constructor
	
	public Account(double balance,String name) {
		super();
		this.name = name;
		this.balance = balance;
		this.accNo = ++allotNumber;
	}
	


	public Account(int accNo) {
		super();
		this.accNo = accNo;
	}


	public int getAccNo() {
		return accNo;
	}




	protected void setAccNo(int accNo) {
		this.accNo = accNo;
	}




	public double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	


	public String getName() {
		return name;
	}

	public String toString()
	{
		
		
		return "Account number : "+this.getAccNo()+"\nAccount holder name : "+this.getName()+"\nAccount balance :"
				+ " "+this.getBalance();
		
	}

	//abstract method
	public abstract boolean withdraw(double amt);
	public abstract void deposit(double amt);
	public abstract void transfer(double amt,Account toAccount);
}
