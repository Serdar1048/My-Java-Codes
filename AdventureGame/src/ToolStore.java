
public class ToolStore extends NormalLoc {

	ToolStore(Player player) {
		super(player, "Tools Store");
	}

	@Override
	protected boolean getLocation() {
		System.out.println("Money: " + player.getMoney());
		System.out.println("1. Weapons");
		System.out.println("2. Armors");
		System.out.println("3. Exit");
		System.out.print("Select: ");
		int selTool = scan.nextInt();
		int selItemId;
		int selArmorId;
		switch (selTool) {
		case 1:
			selItemId = weaponMenu();
			buyWeapon(selItemId);

			break;
		case 2:
			selArmorId = armorMenu();
			buyArmor(selArmorId);
			break;
		case 3:
			System.out.println("Exiting..");
			break;
		default:
			break;
		}
		return true;
	}

	private int armorMenu() {
		System.out.println("1. Light Armor--> block:1 \t money:15");
		System.out.println("2. Medium Armor-> block:3 \t money:25");
		System.out.println("3. Heavy Armor--> block:5 \t money:40");
		System.out.println("4. Exit");
		System.out.print("Select: ");
		int selArmorId = scan.nextInt();
		return selArmorId;
	}

	private void buyArmor(int armorId) {
		int block = 0, price = 0;
		String aName = null;
		switch (armorId) {
		case 1:
			block = 1;
			aName = "Light Armor";
			price = 15;
			break;
		case 2:
			block = 3;
			aName = "Medium Armor";
			price = 25;
			break;
		case 3:
			block = 5;
			aName = "Heavy Armor";
			price = 40;
			break;
		case 4:
			System.out.println("Exiting..");
			break;
		default:
			System.out.println("Invalid ID");
			break;
		}

		if (price > 0) {
			if (player.getMoney() >= price) {
				player.getInv().setArmor(block);
				player.getInv().setaName(aName);
				player.setMoney(player.getMoney() - price);
				System.out.println("successful purchase of " + aName);
				System.out.println("blocked damage:" + player.getInv().getArmor());
				System.out.println("current money:" + player.getMoney());
			} else {
				System.out.println("insufficient balance!!");
			}
		}

	}

	public int weaponMenu() {
		System.out.println("1. Gun---> \t damage:2 \t money:25");
		System.out.println("2. Sword-> \t damage:3 \t money:35");
		System.out.println("3. Rifle-> \t damage:7 \t money:45");
		System.out.println("4. Exit");
		System.out.print("Select your weapon: ");
		int selWeaponId = scan.nextInt();
		return selWeaponId;
	}

	public void buyWeapon(int itemId) {
		int damage = 0, price = 0;
		String wName = null;
		switch (itemId) {
		case 1:
			damage = 2;
			wName = "Gun";
			price = 25;
			break;
		case 2:
			damage = 3;
			wName = "Sword";
			price = 35;
			break;
		case 3:
			damage = 7;
			wName = "Rifle";
			price = 45;
			break;
		case 4:
			System.out.println("Exiting..");
			break;
		default:
			System.out.println("Invalid ID");
			break;
		}
		if (price > 0) {
			if (player.getMoney() >= price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney() - price);
				System.out.println("successful purchase of " + wName);
				System.out.println("previous damage:" + player.getDamage() + "\tnew damage:" + player.getTotalDamage());
				System.out.println("Current money: " + player.getMoney());
			} else {
				System.out.println("insufficient balance!!");

			}
		}
	}
}
