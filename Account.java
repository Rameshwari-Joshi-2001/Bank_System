package logic;

public class Account 
{
	//Attributes
	//using encapsulation so make Fields private
	private String AccNumber;
	private String AccOwenerName;
	private double AccBalance;
	//parameterized constructor
	public Account(String AccNo,String AccOwN)
	{
		this.AccNumber= AccNo;
		this.AccOwenerName = AccOwN;
		this.AccBalance=0;           //Innitially set balance= 0
	}
	//getters
	public String getAccNumber() {
		return AccNumber;
	}
	public String getAccOwenerName() {
		return AccOwenerName;
	}
	public double getAccBalance() {
		return AccBalance;
	}
	//Methods Encapsulaton: making methods public
	public boolean deposite(double Amount)
	{
		if(Amount>0)
		{
			this.AccBalance = this.AccBalance+Amount;
			return true;
		}
		else
		{
			System.out.println("Please Enter valid Amount");
			return false;
		}
	}
	public boolean withdraw(double Amount)
	{
		int minBalance = 500;
		if((this.AccBalance-Amount)>minBalance)   //condition for min balance
		{
			this.AccBalance= this.AccBalance-Amount;
			return true;
		}
		else
		{
			System.out.println("You don't have sufficient Ammount to withdraw");
			return false;
		}
	}

	   public static void main(String[] args) {
		   	Account Holder1 = new Account("111111", "Rameshwari Uddhav Joshi");

		   	System.out.println(Holder1.getAccBalance()); //0
		   	Holder1.deposite(5000);

		   	System.out.println("Balance is: " + Holder1.getAccBalance()); // 5000

		   	Holder1.withdraw(500);

		   	System.out.println("Balance is: " + Holder1.getAccBalance()); // 4500
		   }
}

