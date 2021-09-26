package logic;
//package abstractBank;

public class CurrentAccount extends Account {
	private static double overdraft = 5000;

	public CurrentAccount(double balance,String name) {
		super(balance, name);
	}
	public CurrentAccount(int accNo) {
		super(accNo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean withdraw(double amt) {
		
		double checkbalance  = this.getBalance()- amt;
		if(checkbalance < overdraft)
		{
			System.out.println("A letter is sent to the acc holder that overdraft limit" +
					" is crossed");
			return false;
		}
		else
		{
			this.setBalance(checkbalance);
			return true;
			
		}
		
	}

	@Override
	public void deposit(double amt) {
		double checkBalance = this.getBalance() + amt;
		this.setBalance(checkBalance);

	}

	@Override
	public void transfer(double amt, Account toAccount) {
		
		if(this.withdraw(amt) == true)
		{
			toAccount.deposit(amt);	
		}
		else
		{
			System.out.println("Transfer is not possible");
		}
		
		
	}
}
