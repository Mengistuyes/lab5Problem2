package problem2;

public class RubberDuck extends Duck {
	@Override
	public void Display() {
		System.out.println("Display");
	}
	@Override
	public void fly() {
		new CannotFly().fly();
	//	CannotFly f=new CannotFly();
	//	f.fly();
		
	}

	@Override
	public void quack() {		
		new Squeak().quack();
	}

	

}
