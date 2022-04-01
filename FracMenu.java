package unit5;

import java.util.ArrayList;
import java.util.Scanner;

public class FracMenu {

	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		int selection;
		boolean exit=false;
		ArrayList<Fraction> fracArray = new ArrayList<Fraction>();
		System.out.println("Welcome to my thing please enter what you would like to do!");
		do
		{
			selection =input.nextInt();
			switch(selection)
			{
			case 0:
				System.out.print("Exiting");
				exit=true;
				break;
			case 1: 
				System.out.println("Displaying fractions");
				//display fractions
				break;
			case 2:
				//add fraction
				break;
			case 3:
				System.out.print("Enter the location where you would like to enter the fraction: ");
				try
				{
					fracArray.add(input.nextInt(),new Fraction(.5));
					fracArray.remove(input.nextInt());
					input.nextLine();
				}catch(  java.lang.IndexOutOfBoundsException e)
				{
					System.out.println("You may only insert fractions between the locations 1 and "+fracArray.size()+". Please try again");
				}
				
				//temp block
				{
					int num,denom;
					System.out.print("Enter the numerator of the new fraction: ");
					num=input.nextInt();
					System.out.print("Enter the denominator of the new fraction: ");
					denom=input.nextInt();
					fracArray.add(input.nextInt(),new Fraction(.5));
				}
				//insert a fraction 
				break;
			case 4:
				///remove fraction at location
				break;
			case 5:
				//remove fraction by value
				break;
			case 6:
				//replace a fraction at a specific location
				break;
				default:
					System.out.println("That is not a valid command, please be better next time");
			}
			
		}
		while(!exit);
	}

}
