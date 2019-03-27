//Max Shaffer
//Final Exam

public class Student implements Notification
{
	int alarmInterval = 0;
	public Student (Notifier notifier)
	{
		alarmInterval = 5;
		this.setAlarm(notifier);
	}

	public void doAlarm()
	{
		System.out.println("This is the student alarm.");
		return;
	}

	public void setAlarm(Notifier notifier)
	{
		notifier.register(this, alarmInterval);
		return;
	}
}
