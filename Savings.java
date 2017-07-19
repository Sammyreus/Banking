import java .util.*;
class Savings extends Account
{
 	private double interest;
	Savings()
	{
	       super();
	       interest=4.8;
	}
	public void deposit()
	{
          Scanner sc=new Scanner(System.in);
	 System.out.print(" enter the deposit amount ");
	 double dbalance=sc.nextDouble();
	  Balance=Balance+dbalance;
	}
	public void withdrawl()
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the withdrawn amount ");
	 double wbalance=sc.nextDouble();
	 if(wbalance<=(Balance-1000))
	{ 
		int note[]={1000,500,100,50,20,10,5,2,1};
		Balance-=wbalance;
	                  int i=0;
		while(wbalance>0)
		{
		  int d=(int)wbalance / note[i];
		  if(d>0)
		  System.out.println(note[i]+"\tX\t"+d+"\t=\t"+(note[i]*d));
		  System.out.println();	
		wbalance%=note[i];
		i++;
		}		

	}
	else
	 System.out.println("The Withdrawl is't possible !!!!");
 
	}

	public void find()
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the days \t");
	   int time=sc.nextInt();
	   double si=(Balance*  interest*time)/100.0;
	   Balance+=si;
	   System.out.println("Interest credited "+si);
	}
	public void disp()
	{
	   
	   System.out.println("New Balance "+Balance);
	}
}
     	
	
    