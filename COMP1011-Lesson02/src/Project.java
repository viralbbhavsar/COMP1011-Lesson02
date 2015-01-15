
public class Project {

	public static void main(String[] args) {
		
		//Instantiate Hero
		
		StrongMan hero = new StrongMan("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();
		
		//Instantiate villian
		
		Villian villian = new Villian("Sly Man");
		villian.run();
		villian.steals();
		villian.showAbilities();
		
		//Instantiate vigilante-------------------
		
		Vigilante vigilante = new Vigilante("Arrow");
		vigilante.kills();
		vigilante.run();
		vigilante.steals();
		vigilante.dealsJustice();
		vigilante.showAbilities();
		

	}

}
