
public class Demo {
		public static void main(String[] args) {
			Soldier ghost = new Soldier(3,3000);
			ghost.takeDamage(500);
			SuperSoldier boss = new SuperSoldier(3, 1000);
			System.out.println("The boss has recieved: "+ boss.takeDamage(500) + " Damages to repair get more lives");
		}

}
