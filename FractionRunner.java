package fractions;

public class FractionRunner
{

	public static void main(String[] args) throws InterruptedException 
	{
		Fraction uno=new Fraction(1,4);
		Fraction dos = new Fraction(.5);
		System.out.println("Uno es: "+ uno);
		System.out.println("Dos es: "+ dos);
		
		System.out.println(uno.add(dos));
		System.out.println(uno.multiply(dos));
		System.out.println(uno.subtract(dos));
		System.out.println(uno.divide(dos));
		System.out.println(uno.compareTo(dos));

	}

}
