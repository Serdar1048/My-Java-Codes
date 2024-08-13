import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scanner = new Scanner(System.in);

	public void login() {

		System.out.println("Welcome to the Adventure Game");
		System.out.println("Please enter your name before starting the game: a");// ln kaldır a kaldır!!!
//		String playerName = scanner.nextLine();
		player = new Player("a");
		player.selectChar();
		start();
	}

	public void start() {
		while (true) {
			System.out.println();
			System.out.println("==========================================================");
			System.out.println();
			System.out.println("Place List");
			System.out.println("1. Safe House ---> A safe place that belongs to you. There are no enemies.");
			System.out.println("2. Cave ---> A !ZOMBIE! may appear in front of you!!");
			System.out.println("3. Forest ---> A !VAMPIRE! may appear in front of you!!");
			System.out.println("4. River ---> A !BEAR! may appear in front of you!!");
			System.out.println("5. Toolstore ---> You can buy weapons or armor.");
			System.out.print("Please select the place you want to go: ");
			int selLoc = scanner.nextInt();

			while (selLoc > 5 || selLoc < 1) {
				System.out.println("Invalid Place");
				System.out.print("Please select again: ");
				selLoc = scanner.nextInt();
			}
			switch (selLoc) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new Cave(player);
				break;
			case 3:
				location = new Forest(player);
				break;
			case 4:
				location = new River(player);
				break;
			case 5:
				location = new ToolStore(player);
				break;

			default:
				location = new SafeHouse(player);
				break;
			}
			if (location.getClass().getName().equals("SafeHouse")) {
				if (player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {
					System.out.println("Congratulations YOU WIN");
					break;
				}
			}
			if (!location.getLocation()) {
				System.out.println("Game Over!");
				break;
			}

		}
	}
}
