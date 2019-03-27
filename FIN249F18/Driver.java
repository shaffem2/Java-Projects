//Max Shaffer
//Final Exam

public class Driver
{
	public static void main(String[] args)
	{
		Notifier notifier = new Notifier();
		Student max = new Student(notifier);
		Faculty scott = new Faculty(notifier);
		BookStore bookstore = new BookStore(notifier);

		for (int i = 0; i < 50; i++)
		{
			notifier.tick();
		}
	}
}
