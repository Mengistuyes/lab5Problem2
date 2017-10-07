package problem2;

public class DecoyDuck extends Duck {

	@Override
	public void Display() {
		System.out.println("Display");
	}
	@Override
	public void fly() {
		new CannotFly().fly();		
	}
 
	@Override
	public void quack() {
		new MuteQuack().quack();
	}

}
