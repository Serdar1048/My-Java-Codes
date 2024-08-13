import java.util.Scanner;

import javax.swing.plaf.multi.MultiInternalFrameUI;

public class Player {
	private int damage, healthy, money, rHealthy;
	private String name, cName;
	private Inventory inv;
	Scanner scanner = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
		this.inv = new Inventory();
	}

	public void selectChar() {
		switch (charMenu()) {
		case 1:
			// the samurai was chosen
			initPlayer("Samurai", 5, 21, 15);
			break;
		case 2:
			// the Archer was chosen
			initPlayer("Archer", 7, 18, 20);
			break;
		case 3:
			// the Knight was chosen
			initPlayer("Knight", 8, 24, 5);
			break;
		default:
			// the samurai is default
			initPlayer("Samurai", 5, 21, 15);
			break;
		}
		System.out.println("Your Character:");
		System.out.println(this.getcName() + "-->" + " damage:" + this.getDamage() + "\thealthy:" + this.getHealthy()
				+ "\tmoney: " + this.getMoney());

	}

	public int charMenu() {

		System.out.println("Character List");
		System.out.println("1- Samurai-> \t damage:5 \t healthy:21 \t money:15");
		System.out.println("2- Archer--> \t damage:7 \t healthy:18 \t money:20");
		System.out.println("3- Knight--> \t damage:8 \t healthy:24 \t money:5");
		System.out.print("Please select a character ID: ");

		int charId = scanner.nextInt();
		while (charId > 3 || charId < 1) {
			System.out.println("Invalid ID");
			System.out.print("Please select again: ");
			charId = scanner.nextInt();
		}

		return charId;
	}

	public int getTotalDamage() {
		return this.getDamage() + this.getInv().getDamage();
	}

	public void initPlayer(String cName, int damage, int healthy, int money) {
		setcName(cName);
		setDamage(damage);
		setHealthy(healthy);
		setMoney(money);
		setrHealthy(healthy);
	}

	public int getrHealthy() {
		return rHealthy;
	}

	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

}
