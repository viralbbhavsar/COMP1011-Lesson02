
public class Hero implements Action {
	// PRIVATE PROPERTIES---------------------------------
	protected int strength;
	protected int speed;
	private int health;
	
	//PUBLIC PROPERTIES-----------------------------------
	public String name;
	
	// GETTERS-----------------------------------
	public int getStrength() {
		return strength;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getHealth() {
		return health;
	}
	
	//constructor-------------------------------------------------------------
	
	public Hero(String name) {
		this.name = name;
		generateAbilities();
		
	}
	
	//public methods---------------------------------
	public void showAbilities() {
		System.out.println("Strength:" + this.strength);
		System.out.println("Speed:" + this.speed);
		System.out.println("health:" + this.health);
		
	}
	
	//PRIVATE METHODS---------------------------------------
	
	private void generateAbilities() {
		
		this.strength = (int)(Math.random()*100+1);
		this.speed = (int)(Math.random()*100+1);
		this.health = (int)(Math.random()*100+1);
	}
	
	public void fight() {
		System.out.println(this.name+ " is fighting");
		
	}
	
	public void run() {
		System.out.println(this.name+ " is running");
	}
}
