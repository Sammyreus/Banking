import java.util.*;
class Loan extends Savings
{
	
	public double loanbal;
	public int terms;
	Loan()
	{
		super();
		loanbal=0;
		terms=0;
	}
	public void amount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Balance "+Balance);
		System.out.print("Enter the loan Amount ");
		loanbal=sc.nextDouble();
		if(loanbal<=(Balance*(90/100.0)))
		{
			System.out.println("Congratulation!! Loan is possible");
			System.out.println("Enter the term possible");
			System.out.println("Enter 1 to select 6%");
			System.out.println("Enter 2 to select 8%");
			System.out.println("Enter 3 to select 12%");
			System.out.print("Enter Your choice");
			terms=sc.nextInt();
			double interest=0.0;
                        if(terms==1)
				interest=6;
			else if(terms==2)
				interest=8;
			else if(terms==3)
				interest=12;

			System.out.println("your interest is "+interest+"%");
			double loanbaln=loanbal+(interest*loanbal)/100.0;
			double EMI=loanbaln/interest;
			System.out.println("Your interest= "+(interest*loanbal/100.0));
			System.out.println("Your EMI = "+EMI);
					
				
		}	

			else 
			System.out.println("Sry!! loan is not possible");
	}
}	