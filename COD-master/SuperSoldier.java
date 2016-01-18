
public class SuperSoldier extends Soldier{

	 int points;
	public SuperSoldier (int lives,int hitpoints){
		super (lives,hitpoints);
		this.lives=lives;
		this.hitpoints=hitpoints;
	}
	
	public  int takeDamage (int damage,int bonus){
		points=bonus/2;
    	int remainingHitpoints=hitpoints-damage+ bonus;
    	if(remainingHitpoints<3000){
    		System.out.print("you are dead");
    	}
    	return remainingHitpoints;
}
}