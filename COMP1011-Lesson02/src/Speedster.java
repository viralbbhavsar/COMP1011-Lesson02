
public class Speedster extends Hero {

	public Speedster(String name) {
		super(name);
		this.boostSpeed();
	}

	//private method
	private void boostSpeed() {
		this.speed += 50;
		if (this.speed >100)
		{
			this.speed = 100;
		}
	}
}
