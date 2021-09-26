package uselogic;
//package abstractBank;

import java.util.HashMap;
import java.util.Scanner;
import logic.Account;
import logic.SavingAccount;
//import logic.CurrentAccount;


public class Test {

	public static void main(String[] args) {
		HashMap<Integer,Account> data = new HashMap<Integer, Account>();
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int ch = 0;
		do
		{
			System.out.println("_______WElcome to bank_______");
			System.out.println("1 create savings account");
			System.out.println("2 create current account");
			System.out.println("3 Open savings account");
			System.out.println("4 opne current account");
			System.out.println("5 EXit");
			System.out.println("Enter your choice = ");
			ch =  sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter your name :");
				String s = sc.next();
				System.out.println("Deposite balance (at least 500) = ");
				int b = sc.nextInt();
				SavingAccount s1 = new SavingAccount(b,s);
				System.out.println(s1.toString());
				data.put(s1.getAccNo(), s1);
				System.out.println("Your savings account has been created");
				System.out.println();
				break;
			case 2:
				System.out.println("Enter name of your company :");
				String c = sc.next();
				System.out.println("Deposite balance (at least 5000) = ");
				int b1 = sc.nextInt();
				SavingAccount c1 = new SavingAccount(b1,c);
				System.out.println(c1.toString());
				data.put(c1.getAccNo(), c1);
				System.out.println("Your current account has been created");
				System.out.println();
				break;
			case 3: 
				System.out.println("Enter your Account number :");
				int an = sc.nextInt();
				Account savings = data.get(an);
				int ns = 0;
				if(data.containsKey(an))
				{
					do
					{
						System.out.println("1.Deposit amount");
						System.out.println("2.Withdraw amount");
						System.out.println("3.Check balance");
						System.out.println("4.Transfer to another account");
						System.out.println("0. Exit");
						System.out.println("Enter your choice =  ");
						ns = sc.nextInt();
						switch(ns)
						{
						case 1:
							System.out.println("Enter amount to be deposited = ");
							int dep = sc.nextInt();
							savings.deposit(dep);
							System.out.println("Done");
							System.out.println();
							break;
						case 2:
							System.out.println("Enter amount to be withdrawed = ");
							int with = sc.nextInt();
							savings.withdraw(with);
							System.out.println("Done");
							System.out.println();
							break;
						case 3:
							System.out.println("Your balance is "+savings.getBalance());
							System.out.println();
							break;
						case 4:
							System.out.println("Enter account number for transfering = ");
							int tr = sc.nextInt();
							Account tran = data.get(tr);
							System.out.println("Enter amount to be transfered = ");
							int am = sc.nextInt();
							savings.transfer(am, tran);
							System.out.println("Done");
							System.out.println();
							break;
						case 0:System.out.println("Thank you");
						     System.out.println();
							break;
						}
						
					}while(ns != 0);
				}
				else
				{
					System.out.println("There is no such account exist.You may create new account");
				}
				System.out.println();
				break;
			case 4:
				System.out.println("Enter your Account number :");
				int cu = sc.nextInt();
				Account current = data.get(cu);
				int nc = 0;
				if(data.containsKey(cu))
				{
					do
					{
						System.out.println("1.Deposit amount");
						System.out.println("2.Withdraw amount");
						System.out.println("3.Check balance");
						System.out.println("4.Transfer to another account");
						System.out.println("0. Exit");
						System.out.println("Enter your choice =  ");
						nc = sc.nextInt();
						switch(nc)
						{
						case 1:
							System.out.println("Enter amount to be deposited = ");
							int dep = sc.nextInt();
							current.deposit(dep);
							System.out.println("Done");
							System.out.println();
							break;
						case 2:
							System.out.println("Enter amount to be withdrawed = ");
							int with = sc.nextInt();
							current.withdraw(with);
							System.out.println("Done");
							System.out.println();
							break;
						case 3:
							System.out.println("Your balance is "+current.getBalance());
							System.out.println();
							break;
						case 4:
							System.out.println("Enter account number for transfering =");
							int tr = sc.nextInt();
							Account tran = data.get(tr);
							System.out.println("Enter amount to be transfered = ");
							int am = sc.nextInt();
							current.transfer(am, tran);
							System.out.println("Done");
							System.out.println();
							break;
						case 0:System.out.println("Thank you");
								System.out.println();
							break;
						}
						
					}while(nc != 0);
				}
				else
				{
					System.out.println("There is no such account exist.You may create new account");
				}
				System.out.println();
				break;
			case 5:System.out.println("Thank you!!!Have a good day");
				break;
			}
			
		}while(ch < 5);
	}

}
