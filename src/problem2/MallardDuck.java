package problem2;

public class MallardDuck extends Duck{

	@Override
	public void Display() {
		System.out.println("Display");
	}
	
	@Override
	public void fly() {
		new FlyWithWings().fly();
		
	}

	@Override
	public void quack() {
		new Quack().quack();
		
	}

}
