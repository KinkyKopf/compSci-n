package unit5;

import java.util.Scanner;

public class FracMenu {

	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		int selection;
		boolean exit=false;
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
				//insert a fraction 
				break;
			case 4:
				///remove fraction
				break;
			case 5:
				
			}
			
		}
		while(exit);
	}

}
