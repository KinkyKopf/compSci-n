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
	public Fraction( double d) throws InterruptedException
	{
		num=(int)(d*100000000);
		denom=100000000;
		simplify();
	}
	//____________________________
	
	private void simplify()
	{
		int temp;
		
		if(num>denom)
			temp=num;
		else 
			temp=denom;
	
		for(int i=temp;i>0;i--)
		{
//			System.out.println(num%i&&denom%temp==0);
//			System.out.println(num%i==0&&denom%temp==0);
			if(num%i==0&&denom%i==0)
			{
				System.out.println("True");
				num=num/i;
				denom/=i;
			}
		}
	}
	
	public String toString()
	{	
		return num+"/"+denom;
	}
	//_____________________
	public int getDenominator()
	{
		return denom;
	}
	public int getNumerator()
	{
		return num;
	}
	public Fraction add(Fraction f)
	{
		int tempN=f.getNumerator();
		if(f.getDenominator()==denom)
			return(new Fraction(f.getNumerator()+num,denom));
		else
		{
			f.getNumerator()
		}
	}
}