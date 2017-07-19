import java.util.*;
class Account
{
 	private String Customer_name;
	private long Phone_no;
	public double Balance;
  	private int account_no;
	
	Account()
	{
		Balance=1000;
		Customer_name="";
		Phone_no=0; 
	}
	public void input()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Customer Name ");
		Customer_name=sc.nextLine();
		System.out.print("Enter the Customer Phone number ");
		Phone_no=sc.nextLong();
		account_no=(int)(Math.random()*10000)+1000;
	}
	public void show()
	{

		System.out.println("Customer name "+Customer_name+"\n Contact Number "+Phone_no+"\n Account Number "+account_no+"\n Initial Balance "+Balance);
	}
}

 