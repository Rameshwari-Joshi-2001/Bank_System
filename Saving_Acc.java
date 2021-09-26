package logic;
//package abstractBank;

public class SavingAccount extends Account{
	private static double interestRate = 0.03;

	public SavingAccount(double balance,String name) {
		super(balance,name);
		
	}
	

	public SavingAccount(int accNo) {
		super(accNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean withdraw(double amt) {
	
		double checkBalance = this.getBalance() - amt;	
		if(checkBalance >= 500)
		{
			this.setBalance(checkBalance);
			return true;
		}
		else
		{
			
			System.out.println("Withdrawal of ammount = "+amt+" is not allowed. " +
					"you can withdraw maximum " +
					""+(this.getBalance()-500));
			return false;
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
