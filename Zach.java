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
	}
	public void exercise()
	{
		strength+=5;
		intelligence+=5;
	}
	public void newDay()
	{
		time=12;
		strength-=10;
		health-=10;
		tranquility-=10;
		intelligence-=10;
		friendship-=10;
		purpose-=10;//add some if-statement to lower happiness if some stats are below a certian level
	}
	
}
