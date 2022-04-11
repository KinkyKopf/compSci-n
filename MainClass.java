package narrative;

import java.util.Scanner;

/*
 * Zachary Kinkopf 
 * april 7
 * this might be my senior narrative?
 */
public class MainClass 
{
	/*
	 * Notes/ideas
	 * 
	 * I want to divide the game into chapters and have each one be a different part of my life
	 * 
	 */
	static boolean aiAutoRun;
	static int printSpeed=40;	
	static Scanner input =new Scanner(System.in);
	
	public static void slowPrint(String text,int printingSpeed) throws InterruptedException//This slow prints, but you can set the print speed, good for counting.
	{
		//this is for multi-testing where I want it to go as fast as possible
		for (int i=0;i<text.length();i++)
		{
			System.out.print(text.charAt(i));
			if(!aiAutoRun)
				Thread.sleep(printingSpeed);
		}
	}
	public static void slowPrintln(String text,int printingSpeed) throws InterruptedException//This slow prints, but you can set the print speed, good for counting.
	{
		//this is for multi-testing where I want it to go as fast as possible
		for (int i=0;i<text.length();i++)
		{
			System.out.print(text.charAt(i));
			if(!aiAutoRun)
				Thread.sleep(printingSpeed);
		}
		System.out.println();
	}
	public static void slowPrintln(String text) throws InterruptedException//This is the same as the others but goes down one line after.
	{	
		for (int i=0;i<text.length();i++)
		{
			System.out.print(text.charAt(i));
			if(!aiAutoRun)
				Thread.sleep(printSpeed);
		}
		System.out.println();
	}
	public static void slowPrint(String text) throws InterruptedException
	{
		
		
		for (int i=0;i<text.length();i++)
		{
			System.out.print(text.charAt(i));
			if(!aiAutoRun)
				Thread.sleep(printSpeed);
		}
	}
	
	public static void narratorPrintln(String text) throws InterruptedException
	{
		
		
		for (int i=0;i<text.length();i++)
		{
			System.err.print(text.charAt(i));
			if(!aiAutoRun)
				Thread.sleep(printSpeed);
		}
		System.out.println();
	}
	public static void narratorPrint(String text) throws InterruptedException
	{
		
		
		for (int i=0;i<text.length();i++)
		{
			System.err.print(text.charAt(i));
			if(!aiAutoRun)
				Thread.sleep(printSpeed);
		}
	}
	public static void narratorPrint(String text,int printingSpeed) throws InterruptedException//This slow prints, but you can set the print speed, good for counting.
	{
		//this is for multi-testing where I want it to go as fast as possible
		for (int i=0;i<text.length();i++)
		{
			System.err.print(text.charAt(i));
			if(!aiAutoRun)
				Thread.sleep(printingSpeed);
		}
	}
	public static void narratorPrintln(String text,int printingSpeed) throws InterruptedException//This slow prints, but you can set the print speed, good for counting.
	{
		//this is for multi-testing where I want it to go as fast as possible
		for (int i=0;i<text.length();i++)
		{
			System.err.print(text.charAt(i));
			if(!aiAutoRun)
				Thread.sleep(printingSpeed);
		}
		System.out.println();
	}
	
	public static void sleep(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		boolean skipIntro=false;
		String user;
		
		if(!skipIntro)
		{
			narratorPrintln("Hi I'm Zach, I will be your narrator/guide through my mind for the duration of this game.\n\n My personal thoughts and fourth wall breaks will be in red, evertyhing else will be in black"
					+ "\n\nFeel free to type help at any time if you don't know what to do"
					+ "\n\n A colon\":\" will indicate that your input is required\n\n ");
			slowPrint("Does this make sense?(y/n): ");
			user=input.nextLine();
			if(user.equals("y")||user.equals("yes"))
				narratorPrintln("Great so glad to see that makes sense!");
			else if(user.equals("help"))
			{
					narratorPrintln("Really, just type 'y' or 'n' but too late now, you lost your chance. ");
					Thread.sleep(3000);
			}
			else
			{//replace this funny message with a different explanation, to actually be useful
				narratorPrint("Too bad, you're already strapped in for the ride and I gave the drunken monkey I call my brain the keys.");
				Thread.sleep(3000);
				narratorPrintln("OFF WE GO!");
			}
		}
//		chapterOne();
		chapterOneV2();
		
		
	}
	
	public static void chapterOneV1() throws InterruptedException
	{
		boolean validAnswer=true;
		String user;
		int times=0;
		
		
		slowPrintln("Chapter 1: \n\tPreschool-Second Grade",0);
		slowPrintln("Welcome Zach, let me introduce you to some kids, this young lady is Vivian cox, Next to her Is Will Ott and this last boy is Fletcher");
		Thread.sleep(2000);
		narratorPrintln("Wanna guess which one is the \"antagonist\"?",printSpeed-15);
		Thread.sleep(2000);
		
		slowPrint("Type who you want to introduce yourself to or type leave to move on: " );
		user=input.nextLine().toLowerCase();
		do
		{
			
			switch(user.charAt(0))
			{
			case 'v':
				slowPrintln("You introduce yourself to Vivian, she seems super nice but she's a girl so gross, cooties");
				narratorPrintln("Based");
				break;
			case 'w':
				slowPrintln("You introduce yourself to Will,he has blonde hair and is super cool, he will probably become a surfer bro later on");
				
				break;
			case 'f': 
				slowPrintln("You introduce yourself to Fletcher, he has a cleft lip and seems rather annoying\n");
				narratorPrintln("In case you didn't get the hint earlier, fletcher is the antagonist for chapter one");
				break;
			case 'l':
				if(times<0)
					narratorPrintln("Classic Zach move not introducing yourself, I like it");
				
			}
			
					slowPrint("You can type the name of the person to introduce yourself to them.\n\nWho would you like to talk to:");
					user=input.nextLine().toLowerCase();
					times++;
		}
		while(!validAnswer);
		slowPrintln("After introducing yourself, you decide to go and play and some toys\n\nBefore you is a hammer, blocks and a bird's nest on the wall. ");
		
	}
	
	public static void chapterOneV2()throws InterruptedException
	{
		String user;
		boolean quit=false;
		
		
//		slowPrintln("\t\tChapter One: Ignorance");
//		narratorPrintln("\tThe only thing more dangerous than ignorance is arrogance.");
//		Thread.sleep(1500);
//		narratorPrintln("\t-Albert Einstein\n\n",printSpeed+15);
//		Thread.sleep(1500);
//		printSpeed=150;
		slowPrintln("White...\n");
		sleep(1000);
		slowPrintln("All around you is white\n"); 
		sleep(2000);
		slowPrintln("But slowly, two figure start to fade in from the distane");
		sleep(1000);
		
		slowPrintln("One figure is on the left, while the other on resides on the right of your view:");
		user=input.nextLine().toLowerCase();
		do
		{
			if(user.equals("help"))
			{
				narratorPrintln("Enter the direction you want to look (left or right)");
			}
			else 
			{
				if(user.contains("left"))
				{
					slowPrintln("As you turn left, the white void darkens to a deep velvet red\n\n The figure on the left snaps into the form of a snarling, gowing-eyed wolf.\n");
					sleep(1500);
					slowPrintln("The wolf howls, exposing its razor-sharp, red-stained teeth.");
				}
				else if(user.contains("right"))
				{
					slowPrintln("As you turn to the right, a blue sky and clouds start to appear.\n\nThe creature on the right slowly molds itself into a buck, grazing on nonexistant grass.");
					sleep(1500);
				}
			}
		}
		while(!quit);
		
		
		
	}

}
