package problem2;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks={new MallardDuck(), new DecoyDuck(), new RubberDuck(),new RedheadDuck()};
		for (Duck d:ducks){
	    	System.out.println(d.getClass().getSimpleName());
			d.Display();
			d.fly();
			d.quack();
			d.Swim();
		}
			
	}
}
