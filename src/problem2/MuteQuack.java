package problem2;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack()
	{
		System.out.println("I don't know how to quack");
	}
	
}
