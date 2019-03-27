//Max Shaffer
//Final Exam

public class BookStore implements Notification
{
	int alarmInterval = 0;
	public BookStore (Notifier notifier)
	{
		alarmInterval = 2;
		this.setAlarm(notifier);
	}

	public void doAlarm()
	{
		System.out.println("This is the bookstore alarm.");
		return;
	}

	public void setAlarm(Notifier notifier)
	{
		notifier.register(this, alarmInterval);
		return;
	}
}
