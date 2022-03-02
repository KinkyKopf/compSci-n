package gameprototypes;


public class TrollStats extends Creature 
{
	private int health,damage,accuracy,floor,damageOut,armor;
	private double hlthMultiplier,dmgMultiplier;
	boolean quickBuild=true;
	boolean stunned;

	private String name;
	/*   Notes:
	 *make the troll get bonus evasion if he has glasses on
	 *more damage if there are tubs of pre-workout 
	 *bonus health be some quip about him being "big but not like in a bad way"
	 *
	 *to Fix:
	 *I want to revamp the combat so most of it happens inside methods, that way if I want to add more things, it will make it much easier.
	 *The prompts are printing in a weird order, I need to tweak the printing so it comes out in the right order.  Like you kill the troll and it says you deal 0 damage.
	 */
	
	public TrollStats(int f) throws InterruptedException
	{
		super(20,f,"the troll");
		
		double dmgMultiplier=.25+.25*f;
		double hlthMultiplier=.5+.5*f;
		
		nameGen();
		
		if(!quickBuild)
		{
		Rpg1_18.slowPrintln("As you go down the hallway, a rank scent of what you can only decsribe as teenage man-musk floods your nostrills ");
		Rpg1_18.slowPrint("...\n",500);
		Rpg1_18.slowPrintln("A troll is near.\nYou see a door labeled: "+name+". \nBrave yourself, "+name+" the troll is behind here.\n");
		}
		else 
			Rpg1_18.slowPrintln("A new troll appepared!");
		
		setFloor(f);
		
		setDamage((int)(2*dmgMultiplier),(int)(6*dmgMultiplier),dmgMultiplier);
		setHealth(20+(int)(floor*hlthMultiplier),hlthMultiplier);	
		setAccuracy(Rpg1_18.randomGen(-3, 3));
	}

	
//Setters______________
	public void setAccuracy(int a) throws InterruptedException
	{
		super.setAccuracy(a);

		if(a>0)
			Rpg1_18.slowPrintln("It appears that "+super.getName()+" is wearing glasses\n");
		if (a<=0)
			Rpg1_18.slowPrintln(super.getName()+" squints at you.\n");
	}
	public void setDamage(int d) throws InterruptedException
	{		
		if(!quickBuild)
		{
			if (d>2)
				Rpg1_18.slowPrintln("You see a truly staggering ammount of what you can only assume is empty tubs of preworkout scattered around "+name+"'s lair\n");
			if(d<1)
				Rpg1_18.slowPrintln("You notice a stack of books labled \"Computer Science: The Anylitical Studies Of Computational Electronics\" in the corner of "+name+"'s lair\n");
		}
	}
	public void setHealth(int h,double hM) throws InterruptedException
	{
		int bonusHealth=Rpg1_18.randomGen((int)(-7*hM),(int)(10*hM));
		
		super.setHealth(h,bonusHealth,hM);
		
		if(!quickBuild)
		{
			if(bonusHealth>5)
				Rpg1_18.slowPrintln(super.getName()+" appears to be abnormally large. But not like in a bad way or anything,he's still in shape for a troll");
			if(bonusHealth<0)
				Rpg1_18.slowPrintln(super.getName()+" is way smaller than your average troll but it is best not to metion it, he is probably insecure\n");
		}
	}
	public void setName(String n)
	{
		name=n;
	}
//Getters_________________
	
	public void printHealth() throws InterruptedException
	{
		Rpg1_18.slowPrintln("Troll health: "+health);
	}
	//misc methods_________________________	
	public void giveLoot(PlayerStats player) throws InterruptedException
	{
		int loot=Rpg1_18.lootMaker(floor);
		Rpg1_18.slowPrintln("You got "+loot+" gold!");
		player.bag.addGold(loot);
		loot=Rpg1_18.randomGen(1,3);
		Rpg1_18.slowPrintln("You also got "+loot+" upgrade tokens!");
		player.bag.addUpgrades(loot);
	}
	public void nameGen()
	{
		String n;
		switch(Rpg1_18.randomGen(1,11))
		{
		case 1:
			n="Jeff";
			break;
		case 2:
			n="Phill";
			break;
		case 3:
			n = "Gary";
			break;
		case 4:
			n="Hok'no'Ragut'Hum";
			break;
		case 5:
			n ="Fus Ro Dah";
			break;
		case 6:
			n ="Al Dente'";
			break;
		case 7:
			n="Gene Poole";
			break;
		
		case 9:
			n="Neil McNeil";
			break;
		case 10:
			n="Sam Sung";
			break;
		case 11:
			n="Linguini";
			break;
			
		default:
			n="Jorge Lopez";
		}
		setName(n);
	}
//	public void attack(int times,PlayerStats player) throws InterruptedException
//	{
//		if(stunned)
//		{
//			Rpg1_18.slowPrintln(name+" brings his arm back, ready to swing but staggers and falls to the ground.");
//			return;
//		}
//		else if(!alive)
//		{
//			return;
//		}
//		for(int i=0;i<times;i++)
//		{
//		damageOut = (Rpg1_18.randomGen((int)(2*dmgMultiplier), (int)(5*dmgMultiplier)))-player.characterWeapon.getProtection();
//		}
//		//System.out.println("DamageValue: "+damageOut);
//		if(damageOut<=0)
//		{
//			Rpg1_18.slowPrintln("The troll swings but you blocked the attack!");
//			return;
//		}
//		
//		Rpg1_18.slowPrint("The troll hits you for "+damageOut+" damage");
//		
//		player.takeDamage(damageOut);
//		if(!player.isAlive())
//			Rpg1_18.slowPrintln(", destroying your "+Rpg1_18.partGen()+", killing you instntly");
//		else 
//			Rpg1_18.slowPrintln("!");
//	}
	

	public String toString()
	{
		return name+" currently has "+health+" health.";
	}
}