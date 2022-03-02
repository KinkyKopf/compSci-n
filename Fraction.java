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
//				System.out.println("True");
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
		int tempN1=f.getNumerator()*denom;
		int tempD1=f.getDenominator()*denom;
		int tempD2=denom*f.getDenominator();
		int tempN2=num*f.getDenominator();
		
		return(new Fraction(tempN2+tempN1,tempD2));
	}
	public Fraction subtract(Fraction f)
	{
	int tempN1=f.getNumerator()*denom;
	int tempD1=f.getDenominator()*denom;
	int tempD2=denom*f.getDenominator();
	int tempN2=num*f.getDenominator();
		
		return(new Fraction(tempN1-tempN2,tempD2));
	}
	public Fraction multiply(Fraction f)
	{
		return new Fraction(f.getNumerator()*num,f.getDenominator()*denom);
	}
	public Fraction divide(Fraction f)
	{
		return new Fraction(f.getNumerator()*denom,f.getDenominator()*num);
	}
	public int compareTo(Fraction f)
	{
		int tempN1=f.getNumerator()*denom;
		int tempN2=num*f.getDenominator();
		
		if(tempN1==tempN2)
		{
			return 0;
		}
		else if(tempN1<tempN2)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public boolean equals(Fraction f)
	{
		return(compareTo(f)==0);
	}
	public boolean equals(double dd)
	{
		return equals(new Fraction(dd));
	}
	

}