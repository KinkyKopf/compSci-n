package fractions;

public class Fraction
{
	private int num;
	private int denom;
	 
	
	public Fraction()
	{
		num=0;
		denom=1;
	}
	public Fraction(int n, int d)
	{
		num=n;
		denom=d;
		simplify();
	}
	public Fraction( double d)
	{
	
	}
	
	private void simplify()
	{
		int temp;
		
		if(num>denom)
			temp=num;
		else 
			temp=denom;
	
		for(int i=1;i<=temp;temp++)
		{
			if(num%temp==0&&denom%temp==0)
			{
				num=num/temp;
				denom/=temp;
			}
		}
	}
	
	public String toString()
	{
		
		return num+"/"+denom;
	}
}