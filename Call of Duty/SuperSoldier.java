public class SuperSoldier extends Soldier{
	
	public SuperSoldier(int lives, int hitpoints) {
		super(lives, hitpoints);
	}

	public int takeDamage(int damage){
		damage = damage/2; 
		if(getHitpoints() < 3000){
			System.out.println("The Boss is about to die");
		}
		int remainingHitpoints = super.getHitpoints() - damage;
		return remainingHitpoints;
	}
	

}
