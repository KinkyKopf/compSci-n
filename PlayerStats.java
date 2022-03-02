package gameprototypes;

import java.util.Scanner;
public class PlayerStats 
{
	
	/*
	 * Notes:
	 * ________________
	 * 
	 * 
	 * To do:
	 * ________________________
	 * make a minigame that allows you to increase your intelligence by solving math problems.
	 * allow you to sacrifice some health for magic
	 * when using a spell, if it kills the troll it says the damage was zero.
	 * 
	 * 
	 * make it so two handed weapons need to have a certian strength in order to properly weild them
	 * add an attack method
	 * make a chain lightning method for trolls
	 * Done:
	 * _________________________________
	 * Allow the player to choose how much magic they want to cast the spell for
	 * make a check magic method to make sure you can't cast spells at 0 magic
	 * get rid of of the spell base and put all the spells in this class
	 * revise the spells to they take the enemy type as input and deal damage through the method directly.
	 * add an attack method so I can attack trolls or goblins directly.
	 */
	private int floor, evasion,health,strength,maxHealth,armorClass,magic,intelligence,maxMagic;
	private boolean alive,nearDeath;
	Weapon characterWeapon;
	Inventory bag;

	public PlayerStats(int e,int h,int mh,Weapon w,int mm)//constructor
	{
		characterWeapon=w;
		setEvasion(e+characterWeapon.evasionBuff);
		setHealth(h);
		setMaxHealth(mh);
		setMaxMagic(mm);
		alive = true;
		//armorClass=characterWeapon.protection;
	}
	public PlayerStats(Weapon w)
	{
		this(7,25,25,w,100);
	}
	//getters______________________________
	
	public void printHealth() throws InterruptedException
	{
		Rpg1_18.slowPrintln("Player health: "+health);
	}
	
	public int getHealth() throws InterruptedException
	{
		return health;
	}
	public int getMaxHealth()//
	{
		return maxHealth;
	}
	public int getEvasion()
	{
		if (nearDeath)
			return evasion+3;
		return evasion;
	}
	public boolean isAlive()
	{
		return alive;
	}
	public int getFloor()
	{
		return floor;
	}
	public int getMaxMagic()
	{
		return maxMagic;
	}
	public int getMagic()
	{
		return magic;
	}
	//Mutators_______________________________________
	public void die() throws InterruptedException
	{
		alive=false;
	
		//Thread.sleep(100);
	}
	public void setHealth(int h)
	{
		health=h;
	}
	public void setEvasion(int e)
	{
		evasion=e;
	}
	public void setMaxHealth(int mh)
	{
		maxHealth=mh;
	}
	public void setMaxMagic(int m)
	{
		magic=m;
		maxMagic=m;
	}
	
	public void addMaxMagic(int m)
	{
		maxMagic+=m;
	}
	public void addHealth(int adder)
	{
		health+=adder;
	}
	public void addMaxHealth(int adder)
	{
		maxHealth+=adder;
	}	
	public void addEvasion(int plus)
	{
		evasion+=plus;
	}
	
	
	public void refillMagic()
	{
		magic=maxMagic;
	}
	public void refillHealth()
	{
		health=maxHealth;
	}
	
	public void useMagic(int m) throws InterruptedException
	{
		if(magic-m<0)
			Rpg1_18.slowPrintln("you can't cast that spell, you don't have enought magic!");
		else
			magic-=m;
	}
	
	public void takeDamage(int damage) throws InterruptedException
	{
//		Rpg1_18.slowPrintln("and hits you for "+damage);
		health-=damage;
		if(health<=0)
			die();
	}
	public void nextFloor() throws InterruptedException
	{
		floor++;
		//add some cool message here, or maybe a funny one
		Rpg1_18.slowPrintln("You leave the relative comfort of the shop behind and begin decending lower into the dungeon");
		magic=maxMagic;
	}
	
	
	//Miscelanious methods______________________________
	public void attack( TrollStats troll) throws InterruptedException
	{
		String s="";
		int damage;
		damage=characterWeapon.rollDamage(1);
		troll.takeDamage(damage);
		Rpg1_18.slowPrintln("You hit the troll, dealing "+damage+" damage to it!");
	}
	public void attack(Goblin goblin) throws InterruptedException
	{
		String s="";
		int damage;
		damage=characterWeapon.rollDamage(1);
		goblin.takeDamage(damage);
		Rpg1_18.slowPrintln("You hit the goblin, dealing "+damage+" damage to it!");
	}
	
	public boolean rollToHit(int enemyAccuracy) throws InterruptedException//roll to see if you can dodge
	{
		
		int enemyRoll=Rpg1_18.randomGen(1,20)+enemyAccuracy;
		
//		System.out.println("Enemy ROll: "+ enemyRoll);

		if(evasion>enemyRoll)
			return true;
		return false;
	}
	
	public void buyMaxPotion(int num,Inventory stuff) throws InterruptedException
	{
		int maxCst;
		maxCst=100+(floor*50);
		if(maxCst>500)
			maxCst=500;
		if(stuff.getGold()<maxCst*num)
		{
			Rpg1_18.slowPrintln("You don't have enough gold to buy "+num+" potions");
			if(Rpg1_18.randomGen(1, 20)==20)
				Rpg1_18.slowPrintln("A good video to help with adding is: https://www.youtube.com/watch?v=dQw4w9WgXcQ");
		}
		else
		{
			stuff.addGold(-maxCst*num);
			addMaxHealth(num*10);
			refillHealth();
			Rpg1_18.slowPrintln("You bought "+num+" potions and now have "+stuff.getGold()+" gold remaining");
		}
		
		
	}
	
	public void castFireball(Scanner input,TrollStats troll) throws InterruptedException
	{
		int damage;
		int magicCost=20;
		
		Rpg1_18.slowPrint("How much magic do you want to use to cast this?");
		magicCost=input.nextInt();
		input.nextLine();
		if(!checkMagic(magicCost))
			return;
		useMagic(magicCost);
		
		damage=(int)(magicCost*.5+Rpg1_18.randomGen( (int)(magicCost*.25+intelligence),(magicCost*intelligence) ));
		
		Rpg1_18.slowPrintln("You cast fireball for "+magicCost+" magic, you have "+ magic+" magic left.");
		troll.takeDamage(damage);
		Rpg1_18.slowPrintln("The fireball rockets out of your palm and slams into the chest of the troll, dealing "+damage+" damage to him");
		
	}
	public void castFireball(Scanner input,Goblin goblin) throws InterruptedException
	{
		int damage;
		int magicCost=20;
		
		Rpg1_18.slowPrint("How much magic do you want to use to cast this?");
		magicCost=input.nextInt();
		input.nextLine();
		if(!checkMagic(magicCost))
			return;
		useMagic(magicCost);
		
		damage=(int)(magicCost*.5+Rpg1_18.randomGen( (int)(magicCost*.25+intelligence),(magicCost*intelligence) ));
		
		Rpg1_18.slowPrintln("You cast fireball for "+magicCost+" magic, you have "+ magic+" magic left.");
		goblin.takeDamage(damage);
		Rpg1_18.slowPrintln("The fireball rockets out of your palm and slams into the chest of the goblin, dealing "+damage+" damage to him");
	}
	
	public void castChainLightning(Scanner input, Goblin[] goblins) throws InterruptedException
	{
		int damageMin;
		int damageMax;
		int level;
		int spellCost;
		double stunChance;
		if(intelligence>9)
			level=4;
		else if(intelligence>5)
			level=3;
		else if (intelligence>3)
			level=2;
		else
			level=1;
		
		spellCost=level*5;
		stunChance=level*.10;
		if(!checkMagic(spellCost))
			return;
		useMagic(spellCost);
		
		damageMin=level;
		damageMax=level*2;
		
		
		for(Goblin g:goblins)
		{
			g.takeDamage(Rpg1_18.randomGen(damageMin, damageMax));
			if(Math.random()<stunChance)
			{	
			g.stunned=true;
			Rpg1_18.slowPrintln("You stun goblin "+g.goblinNum+"!");
			}
		}
		
		
	}
	
//	public void attack()

	public boolean checkMagic(int c) throws InterruptedException
	{
		if(c>magic)
		{
			Rpg1_18.slowPrintln("You begin casting the spell but then suddenly it fizzles out, leaving only a faint warmth behind");
			
			return false;
		}
		if(c<0)
		{
			Rpg1_18.slowPrintln("You attempt to draw in magic from outside yourself but as you do, \n\tsomething changes and the spell explodes in your hand. You take 2 damage");
			takeDamage(2);
			return false;
		}
		if(c==0)
		{
			Rpg1_18.slowPrintln("You make a FWSSHHHH sound with your mouth as you thrust you hands towards your opponent");
			return false;
		}
		return true;
	}
	
	
	public String toString()
	{
		return "Current Health: "+health+"   Max Health: "+maxHealth+"   Evasion: "+evasion;
	}
}