import java.util.*
class Current extends Account
{
	void Current()
	{
		super();
			}
	public void deposit()
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.print("Enter the deposit amount");
	 	double depobalance=sc.nextDouble();
	 	Balance=Balance+depobalance;
	}
	public void withdrawn()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the withdrawl amount");
		double witbalance=sc.nextDouble();
		if(witbalance<=(Balance-5000))
	{ 
		int note[]={1000,500,100,50,20,10,5,2,1};
		Balance-=witbalance;
	        int i=0;
	        while(witbalance>0)
	        {
			int d=(int)wbalance / note[i];
			if(d>0)
			System.out.println(note[i]+"\tX\t"+d+"\t=\t"+(note[i]*d));
			System.out.println();
			witbalance%=note[i];
			i++;
		}		

	}
	else
	 System.out.println("The Withdrawl is't possible !!!!");
 
}
