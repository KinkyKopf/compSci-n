package narrative;

public class Zach
{
	private int strength,health,tranquility,intelligence,friendship,purpose,time;
	private int happiness;
	public Zach()
	{
		strength=50;
		health=50;
		tranquility=50;
		intelligence=50;
		friendship=50;
		purpose=50;
		time=6;
	}
	
	public void newDay()
	{
		time=6;
		strength-=10;
		health-=10;
		tranquility-=10;
		intelligence-=10;
		friendship-=10;
		purpose-=10;//add some if-statement to lower happiness if some stats are below a certian level
	}
	
	public int getTime()
	{
		return time;
	}
	public int getStrength()
	{
		return strength;
	}
	public int getIntelligence()
	{
		return intelligence;
	}
	public String toString()
	{
		return "Time: "+time+"\tHealth: "+health+"\nStr: "+strength+"\tInt: "+intelligence+"\tTrq: "+tranquility+"\tFnd: "+friendship+"\tPur: "+purpose;
	}
	public void exercise()
	{
		strength+=5;
		intelligence-=5;
		time--;
	}
	public void walk()
	{
		tranquility+=5;
		purpose+=5;
		strength-=5;
		time--;
	}
	public void program()
	{
		intelligence+=5;
		purpose+=5;
		time--;
	}
}
