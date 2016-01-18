
public class Soldier {
	protected int lives,hitpoints;
	
	public Soldier(int lives,int hitpoints){
		this.lives=lives;
		this.hitpoints=hitpoints;
	}

	
   
 
   
    public  int takeDamage (int damage){
    	int remainingHitpoints=hitpoints-damage;
    	return remainingHitpoints;
    }

}
