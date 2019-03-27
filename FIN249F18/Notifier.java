//Max Shaffer
//Final Exam
import java.util.*;

public class Notifier
{
	public Notifier() {}

	Tickcount tickCount = new Tickcount();
	public void tick()
	{
		tickCount.incrementTick();
		for(Notification name : alarmMap.keySet())
		{
			if(sinceLast.get(name) == alarmMap.get(name))
			{
				name.doAlarm();
				sinceLast.replace(name, 0);
			}
			else
			{
				sinceLast.replace(name, sinceLast.get(name) + 1);
			}
		}
	}

	HashMap<Notification, Integer> alarmMap = new HashMap<Notification, Integer>();
	HashMap<Notification, Integer> sinceLast = new HashMap<Notification, Integer>();
	public void register(Notification name, int alarmInterval)
	{
		alarmMap.put(name, alarmInterval);
		sinceLast.put(name, 0);
	}

	
}
