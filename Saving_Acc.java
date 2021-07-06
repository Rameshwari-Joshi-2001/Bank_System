package logic;

public class Saving_Acc  extends Account
{
	//Attributes
	private double Interest_Rate;
	//parameterized constructor
	public Saving_Acc(String AccNo, String AccOwN,double IR) {
		super(AccNo, AccOwN);
		this.Interest_Rate = IR;
	}
	// Methods
	public void getInterest()
	{
		super.deposite(getAccBalance()*Interest_Rate/100);
	}
	public static void main(String[] args) {
		Saving_Acc Sav_Acc_Holder1 = new Saving_Acc("22222",
	   			"Raja Ram Mohanroi", 9.0);
		Sav_Acc_Holder1.deposite(5000);
	   	System.out.println("Balance Before Interest: " + Sav_Acc_Holder1.getAccBalance());

	   	Sav_Acc_Holder1.getInterest();
	   	System.out.println("Balance After Interest: " + Sav_Acc_Holder1.getAccBalance());
	   }

}
