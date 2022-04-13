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
	static int printSpeed=15;
	static int day=1;
	static Scanner input =new Scanner(System.in);
	static Zach player=new Zach();
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
		String user;
//		printNewspaper(new String[]{"The latest news has revealed ","that this test works"});
//		narratorPrintln("Hi I'm Zach, I will be your narrator/guide through my mind for the duration of this game.\n\nFor reference, the narration and my personal thoughts will be in red, evertyhing else will be in black\n\nTry to answer things, clearly and be careful of things like numbers being where they shouldn't\n\nI will try to put things in an easy order but I have a week to to make this so I mean ¯\\_(ツ)_/¯\n\n ");
//		slowPrint("Does this make sense?(y/n): ");
//		user=input.nextLine().toLowerCase();
//		if(user.equals("y")||user.equals("yes"))
//			narratorPrintln("Great so glad to see that makes sense!");
//		else
//			narratorPrintln("Too bad, you're already strapped in for the ride and I gave the drunken monkey I call my brain the keys OFF WE GO!");
//		chapterOneV2();
		dayOne();
		
		
	}
	
	public static void chapterOneV1() throws InterruptedException
	{
		boolean quit=false;
		
		String user;
		slowPrintln("Chapter 1: \n\tPreschool-Second Grade",0);
		slowPrintln("Welcome Zach, let me introduce you to some kids, this young lady is Vivian cox, Next to her Is Will Ott and this last boy is Fletcher");
		Thread.sleep(2000);
		narratorPrintln("Wanna guess which one is the \"antagonist\"?",printSpeed+15);
		Thread.sleep(2000);
		
		slowPrint("Type the name of the person you want to introduce yourself to or type leave to move on: ");
		user=input.nextLine().toLowerCase();
		{ int timesDone=0;
		do
		{
			
			switch(user.charAt(0))
			{
			case 'v':
				slowPrintln("You introduce yourself to Vivian, she seems super nice but shes a girl so thats like totally gross");				
				break;
			case 'w':
				slowPrintln("You introduce yourself to Will,he has blonde hair and is super cool, he will probably become a surfer bro later on");
				
				break;
			case 'f': 
				slowPrintln("You introduce yourself to Fletcher, he has a cleft lip and seems rather annoying\n");
				narratorPrintln("In case you didn't get the hint earlier, fletcher is the antagonist for chapter one");
				break;
			case 'l':
				if(timesDone==0)
					narratorPrintln("Ha, I probably wouldn't introduce myself either");
			}
					slowPrint("Enter who you would like to talk to:");
					user=input.nextLine().toLowerCase();
					
			
		}
		while(!quit);
		}
//		
//		slowPrint("After introducing yourself to the other kids, its time to play with toys\n\nNear you are a robin's nest, blocks, and a hammer.\nEnter what you would like to play with: ");
//		user=input.nextLine().toLowerCase();
//		do
//		{
//			switch(user)
//			{
//			case "blocks":
//				slowPrintln("You play with the blocks for a little bit but the square peg doesn't fit inside the round hole so you throw them at some idiot toddler");
//				quit=true;
//				break;
//			case 'w':
//				quit=true;
//				break;
//			case 'f': 
//				
//				quit=true;
//				break;
//				default:
//					user=input.nextLine();
//					quit=false;
//			}
//		}
//		while(!validAnswer);
		
	}

	public static void chapterOneV2()throws InterruptedException
	{
		String user;
		boolean quit=false;
	
	
		// slowPrintln("\t\tChapter One: Ignorance");
		// narratorPrintln("\tThe only thing more dangerous than ignorance is arrogance.");
		// Thread.sleep(1500);
		// narratorPrintln("\t-Albert Einstein\n\n",printSpeed+15);
		// Thread.sleep(1500);
		// printSpeed=150;
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
				narratorPrintln("Enter the direction you want to look (left or right)");
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
	
	public static void dayOne() throws InterruptedException 
	{
		String[] s= {"Welcome back to highschool!","Incoming freshmen, get ready for a great time!","Upcoming events: ","","Asian sun Interschool Tournament: ","This will be my third tournament so I am super excited to try and win.","The way an interschool tournament works is pretty simple,","There are four events: Breaking,Sparring, Forms and Swords.","If you get gold in all four events,"," you have a chance to win the grand champion trophy so train hard!"};
		printNewspaper(s);
		
//		slowPrintln("_______________________________________________________________________\n");
		slowPrintln("\n\n"+player.toString());
	}
	private static void printNewspaper(String[] s) throws InterruptedException
	{
		int maxSpaces=70;
		slowPrintln("_______________________________________________________________________");
		slowPrintln("|\t\t\t\tTHE GAMBIT\t\t\t\t|");
		slowPrintln("|Day: "+day+"\t\t\t\t\t\t\t\t\t|");
		slowPrintln("|_______________________________________________________________________|");
		for(int i=0;i<s.length;i++)
		{
			int indentLength=0;
			String indent="";
			indentLength=maxSpaces-s[i].length();
			if(s[i].length()%2!=0)
				indentLength+=1;
			for(int k=0;k<(indentLength)/2;k++)
				indent+=" ";
			slowPrint("|"+indent+s[i]+indent);
			
			if(s[i].length()%2==0)
				slowPrint(" ");
			slowPrintln("|");
		}
		slowPrintln("|      ____              ____________       ____________     ___________|");
		slowPrintln("|_____|    |_____/\\_____/            \\_____/            \\___|           ");
	}
}



