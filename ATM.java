import java.util.*;
class ATM
{
	private double balance;



    public ATM(double initialbalance)
	{
		this.balance = initialbalance;
	}
	 public void deposit(double amount)
	{
		 if(amount > 0)
		{
             balance += amount;
			 System.out.println("Deposit Successfull!");
             System.out.println("Now your Balance is RS:  " + balance);
		}
		else {
			System.out.println("Please enter a valid amount.");
		}
	}

	public void withdraw(double amount)
	{
		if(amount > 0 && amount <= balance)
		{
			balance -= amount;
			System.out.println("Please collect your cash");
			System.out.println("Now your balance is RS:  " + balance);
		}
		else{
			System.out.println("You have insufficient balance to withdraw.");
		}
	}
	public double checkbalance()
	{
		return balance;
	}

	public static void main(String[] args)
	{
		ATM atm =new ATM(100000.00);
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("************WELCOME**************");

			System.out.println(" ATM Menu:  ");

			System.out.println("1. Deposit");

			System.out.println("2. Withdraw");

			System.out.println("3. Checkbalance");

			System.out.println("4. Exit");

			System.out.print(" Please Select Your Option  : ");
			int choice = sc.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Enter the deposit amount :  ");
				    double amount = sc.nextDouble();
					atm.deposit(amount);
					break;
				case 2:
                   System.out.println("Enter the Withdraw amount :  ");
				   amount = sc.nextDouble();
				   atm.withdraw(amount);
				   break;
				case 3:
					System.out.println("Your Account Balance is RS :  "+ atm.checkbalance());
				   break;
				case 4:
					System.out.println("Thanks for Using ATM ");
				    System.exit(0);
				default:
					System.out.println("Choose a valid Option");
			}
		}
	}


} 
