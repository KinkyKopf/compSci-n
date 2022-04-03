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
		boolean exit=false,exists=false;
		ArrayList<Fraction> fracArray = new ArrayList<Fraction>();
		do
		{
			System.out.println("Menu:\n1.Display the list of fractions\n2.Add a fraction to the end of the list\n3.Insert a fraction at a specific location\n4.Remove a fraction from a specific location\n5.Remove a fraction by value\n6.Replace a fraction at a specific location\n0.Exit");
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
				addFraction(fracArray,input);
				break;
			case 3:
				insertFraction(fracArray,input);
				//insert a fraction 
				break;
			case 4:
				System.out.print("Enter the location where you would like to remove the fraction: ");
				selection=input.nextInt()-1;
				if(selection>fracArray.size()-1||selection<0)
					System.out.println("You may only remove fractions between the locations 1 and "+fracArray.size()+". Please try again");
				else
					System.out.println("The fraction "+fracArray.remove(selection)+" has been sucessfully removed from the list");
				break;
			case 5:
				System.out.println("Enter the numerator of the fraction to remove: ");
				num=input.nextInt();
				System.out.println("Enter the denominator of the fraction to remove: ");
				denom=input.nextInt();
				Fraction temp=new Fraction(num,denom);
//				System.out.println(temp);
				for(int i=0;i<fracArray.size();i++)//this isn't working for some reason I have no idea why it isn't but I don''t know what to do
				{
//					System.out.println(fracArray.get(i));
					if(fracArray.get(i).equals(temp))
					{
						System.out.println("The fraction "+fracArray.remove(i)+" has bene succesfully removed from the list at location "+i+".");
						exists=true;
						break;
					}
				}
				if(!exists)
					System.out.println("Error: The fraction "+temp+" is not in the list");
//				System.out.println(exists);
//					if(fracArray.remove(new Fraction(num,denom)))
//					{
//						System.out.println("The fraction "+new Fraction(num,denom)+" has been sucessfully removed from the list.");
//					}
//					else
//						System.out.println("Error: The fraction "+new Fraction(num,denom)+" is not in the list.");
//			
				break;
			case 6:
				System.out.println("Enter the location of the fraction you would like to replace:");
				selection=input.nextInt()-1;
				
				if(selection>fracArray.size()-1||selection<0)
					System.out.println("You may only replace fractions between the locations 1 and "+fracArray.size()+". Please try again");
				else
				{
				System.out.println("Enter the denominator of the new fraction:");
				num=input.nextInt();
				System.out.println("Enter the denominator of the new fraction:");
				denom=input.nextInt();
				
				System.out.println("The fraction "+fracArray.remove(selection)+" has been sucessfully replaced with "+new Fraction(num,denom) ) ;
				fracArray.add(selection,new Fraction(num,denom));
				}
				break;
				default:
					System.out.println("That is not a valid command, please be better next time");
			}
			
		}
		while(!exit);
		input.close();
	}

	private static void insertFraction(ArrayList<Fraction> fracArray, Scanner input) 
	{
		int selection,num,denom;
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
		
	}

	private static void addFraction(ArrayList<Fraction> fracArray, Scanner input) {
		int num,denom;
		System.out.print("Enter the numerator of the fraction to add: ");
		num=input.nextInt();
		System.out.print("Enter the denominator of the fraction to add: ");
		denom=input.nextInt();
		
		fracArray.add(new Fraction(num,denom));
		System.out.println("The fraction "+new Fraction(num,denom)+" has been sucessfully added to the list");
		
	}

}
