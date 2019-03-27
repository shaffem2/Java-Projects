//Max Shaffer
//Final Exam

public class Faculty implements Notification
{
	int alarmInterval = 0;
	public Faculty (Notifier notifier)
	{
		alarmInterval = 2;
		this.setAlarm(notifier);
	}

	public void doAlarm()
	{
		System.out.println("This is the faculty alarm.");
		return;
	}

	public void setAlarm(Notifier notifier)
	{
		notifier.register(this, alarmInterval);
		return;
	}
}
