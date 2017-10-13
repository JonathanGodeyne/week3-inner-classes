package be.pxl.week3.opdracht2;

public class HorrorShow {

	public static void main(String[] args) {

		class Vampire implements Monster {

			public void menace() {
				System.out.println("'ll drink your blood!");
			}
		}

		class Werewolf implements DangerousMonster {

			public void menace() {
				System.out.println("I'll destroy you.");

			}

			public void destroy(Monster monster) {
				monster.menace();
				System.out.println("Big fight...");
				System.out.println(getClass().getSimpleName() 
									+ " killed one" + " " 
									+ monster.getClass().getName());
			}
		}
		
		
		Vampire vamp = new Vampire();
		//vamp.menace();
		
		Werewolf wolf = new Werewolf();
		//wolf.menace();	
		wolf.destroy(vamp);
		
		wolf.destroy(new Monster() {
			@Override
			public void menace() {
				System.out.println("You smell like wet dog");
			}
			
		});

	}

}
