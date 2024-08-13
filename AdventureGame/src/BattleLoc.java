import java.util.Scanner;

public abstract class BattleLoc extends Location {
	protected Obstacle obstacle;
	protected String award;

	BattleLoc(Player player, String name, Obstacle obstacle, String award) {
		super(player);
		this.obstacle = obstacle;
		this.name = name;
		this.award = award;
	}

	public boolean getLocation() {
		int obsCount = obstacle.count();
		System.out.println("You are in " + this.getName());
		System.out.println("Be carefull! There " + isPlural(obsCount));
		System.out.print("<F>ight or <R>un: ");
		String selCase = scan.nextLine();
		selCase = selCase.toUpperCase();
		if (selCase.equals("F")) {
			if (combat(obsCount)) {
				System.out.println("You have defeated all the enemies in " + this.getName());

				if (this.award.equals("Food") && player.getInv().isFood() == false) {
					System.out.println("You won " + this.award);
					player.getInv().setFood(true);

				} else if (this.award.equals("Water") && player.getInv().isWater() == false) {
					System.out.println("You won " + this.award);
					player.getInv().setWater(true);

				} else if (this.award.equals("Firewood") && player.getInv().isFirewood() == false) {
					System.out.println("You won " + this.award);
					player.getInv().setFirewood(true);
				}
				return true;
			}
			if (player.getHealthy() <= 0) {
				System.out.println("!!YOU DEAD!!");
				return false;
			}
		}
		return true;
	}

	public boolean combat(int obsCount) {
		for (int i = 0; i < obsCount; i++) {
			int defObsHealth = obstacle.getHealthy();
			playerStats();
			System.out.println();
			enemyStats();
			System.out.println("------------------------");

			while (player.getHealthy() > 0 && obstacle.getHealthy() > 0) {

				System.out.print("<H>it or <R>un: ");
				String selCase = scan.nextLine();
				selCase = selCase.toUpperCase();
				if (selCase.equals("H")) {
					System.out.println("You Hit!");
					obstacle.setHealthy(obstacle.getHealthy() - player.getTotalDamage());
					afterHit();
					if (obstacle.getHealthy() > 0) {

						System.out.println();
						System.out.println("The " + obstacle.getName() + " Hit!");
						player.setHealthy(player.getHealthy() - (obstacle.getDamage() - player.getInv().getArmor()));
						afterHit();
					}
				} else {
					return false;
				}
			}

			if (obstacle.getHealthy() < player.getHealthy()) {
				System.out.println();
				System.out.println("You kill enemy");
				player.setMoney(player.getMoney() + obstacle.getAward());
				System.out.println("Current Money: " + player.getMoney());
				System.out.println();
				obstacle.setHealthy(defObsHealth);
			} else {
				return false;
			}
		}
		return true;
	}

	public void playerStats() {
		System.out.println("Player Values");
		System.out.println("Healthy:" + player.getHealthy());
		System.out.println("Damage:" + player.getTotalDamage());
		System.out.println("Money:" + player.getMoney());
		if (player.getInv().getDamage() > 0) {
			System.out.println("Weapon: " + player.getInv().getwName());
		}
		if (player.getInv().getArmor() > 0) {
			System.out.println("Armor: " + player.getInv().getaName());
		}

	}

	public void enemyStats() {
		System.out.println(obstacle.getName() + " Values");
		System.out.println("Healthy:" + obstacle.getHealthy());
		System.out.println("Damage:" + obstacle.getDamage());
		System.out.println("Award:" + obstacle.getAward());

	}

	public void afterHit() {
		System.out.println("Player's Healthy:" + player.getHealthy());
		System.out.println(obstacle.getName() + "'s Healthy:" + obstacle.getHealthy());
	}

	// buraya bak
	public String isPlural(int obsCount) {
		return obsCount == 1 ? "is 1 " + obstacle.getName() : "are " + obsCount + " " + obstacle.getName() + "s";
	}

}
