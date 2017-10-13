package be.pxl.week3.opdracht2;

public class HorrorShow {

	public static void main(String[] args) {

		class Vampire implements Monster {

			public void menace() {
				System.out.println("'ll drink your blood!");
			}
		}
		
		class Werewolf implements DangerousMonster{

			public void menace() {
				System.out.println("I'll destroy you.");
				
			}

			public void destroy(Monster monster) {
				monster.menace();
				System.out.println("Big fight...");
				
				
			}
			
		}

	}

}
