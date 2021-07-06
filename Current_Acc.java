package logic;


public class Current_Acc  extends Account{
	//Attributes
	private int trans_count=0;
	private static final int  Min_trans=3;
	private static final double trans_Fee= 40.0;

	public Current_Acc(String AccNo, String AccOwN) {
		super(AccNo, AccOwN);
		trans_count=0;
	}	
	//method Override
	public boolean withdraw(int Amount)
	{
		boolean ret; 
		if(super.withdraw(Amount))   //callng a method of super class
		{
			trans_count++;
			ret=true;
		}
		else
		{
			System.out.println("Not have sufficient Amount Re-enter the Amount!");
			ret = false;
		}
		return ret;
	}
	public boolean deposite(int Amount)
	{
		boolean ret;
		if(super.deposite(Amount))
		{
			trans_count++;
			ret=false;
		}
		else
		{
			System.out.println("Please enter valid Amount!");
			ret=false;
		}
		return ret;
	}
	public void fee_deduction()
	{
		if(trans_count > Min_trans)
		{
			super.withdraw((trans_count-Min_trans)*40.0);
			System.out.println("Fee deducted for your transactions!");
		}
		else 
		{			
				System.out.println("No fee deducted! Happy transactions!");
		}
	}
	public static void main(String[] args) {
		Current_Acc Cur_Acc_Holder1 = new Current_Acc("11111",
	   			"Ram Raju Rakhi");

		Cur_Acc_Holder1.deposite(5000);
		Cur_Acc_Holder1.withdraw(2000);
		Cur_Acc_Holder1.deposite(7000);
	   	// No deduction fee (only 3 transactions)
		Cur_Acc_Holder1.fee_deduction();
	   	System.out.println("transactions less than Min_trans: " + Cur_Acc_Holder1.getAccBalance());
	   	
	   	Cur_Acc_Holder1.deposite(4000);
	   	// Deduction of fee (4 transactions)
	   	Cur_Acc_Holder1.fee_deduction();
	   	System.out.println("transactions grater than Min_trans " + Cur_Acc_Holder1.getAccBalance());
	   }
}









