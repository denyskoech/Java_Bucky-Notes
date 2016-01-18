
public class Demo { 
public static void main (String[]args){
	
Soldier ghost=new Soldier (25,5000);
System.out.println(ghost.takeDamage(500));

SuperSoldier Rick=new SuperSoldier (25,5000);
System.out.println(Rick.takeDamage(2500,5000));

}
}
