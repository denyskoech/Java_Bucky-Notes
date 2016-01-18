public class Soldier {

	private int lives;
	private int hitpoints;
	public Soldier(int lives, int hitpoints) {
		this.lives = lives;
		this.hitpoints = hitpoints;
	}
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public int getHitpoints() {
		return hitpoints;
	}
	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}
	public int takeDamage(int damage){
		int remainingHitpoints = getHitpoints() - damage;
		return remainingHitpoints;
	}
}
