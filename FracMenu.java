package unit5;
/*
 * Zachary kinkopf
 * april second
 * make a menu for the fraction list
 */
import java.util.ArrayList;
import java.util.Scanner;

public class FracMenu {

	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		int selection;
		int num,denom;
		boolean exit=false;
		ArrayList<Fraction> fracArray = new ArrayList<Fraction>();
		do
		{
			System.out.println("Menu:\n1.Display the lis of fractions\n2.Add a fraction to the end of the list\n3.Insert a fraction at a specific location\n4.Remove a fraction from a specific location\n5.Remove a fraction by value\n6.Replace a fraction at a specific location\n0.Exit");
			selection =input.nextInt();
			switch(selection)
			{
			case 0:
				System.out.print("Exiting");
				exit=true;
				break;
			case 1: 
				System.out.println("The list currently contains:");
				if(fracArray.size()<=0)
				{
					System.out.println("\tNo fractions.");
				}
				else
				{
					int i=1;
					for(Fraction f:fracArray)
					{
						System.out.println("\t"+i+". "+f);
						i++;
					}
				}
				break;
			case 2:
				//add fraction
				
				System.out.print("Enter the numerator of the fraction to add: ");
				num=input.nextInt();
				System.out.print("Enter the denominator of the fraction to add: ");
				denom=input.nextInt();
				
				fracArray.add(new Fraction(num,denom));
				System.out.println("The fraction "+new Fraction(num,denom)+" has been sucessfully added to the list");
				break;
			case 3:
				System.out.print("Enter the location where you would like to enter the fraction: ");
				selection=input.nextInt()-1;
				if(selection>fracArray.size()-1||selection<0)
					System.out.println("You may only insert fractions between the locations 1 and "+fracArray.size()+". Please try again");
				else
				{
					System.out.print("Enter the numerator of the new fraction: ");
					num=input.nextInt();
					System.out.print("Enter the denominator of the new fraction: ");
					denom=input.nextInt();
					fracArray.add(selection,new Fraction(num,denom));
					System.out.println("The fraction "+new Fraction(num,denom)+" has been sucessfully added to the list");
				}
				//insert a fraction 
				break;
			case 4:
				System.out.print("Enter the location where you would like to enter the fraction: ");
				selection=input.nextInt()-1;
				if(selection>fracArray.size()-1||selection<0)
					System.out.println("You may only remove fractions between the locations 1 and "+fracArray.size()+". Please try again");
				else
				{
					System.out.println("The fraction "+fracArray.remove(selection)+" has been sucessfully removed from the list");
				}
				
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
