public class Tickcount
{
	private int tick = 0;
	public Tickcount()
	{
	}

	public void incrementTick()
	{
		tick++;
		return;
	}

	public int getTick()
	{
		return tick;
	}
}
