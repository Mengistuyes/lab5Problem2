package problem2;

public abstract class Duck implements FlyBehavior,QuackBehavior {
	public abstract void Display();
	public void Swim(){
		System.out.println("I know how to swim");
	}
	/* we don't have to use this
	 * public void fly(){
		System.out.println("I know how to fly");
	}
	public void quack()
	{
		System.out.println("Quack by squeaking");
	}*/

}
