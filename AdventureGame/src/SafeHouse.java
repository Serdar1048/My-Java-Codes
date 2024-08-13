
public class SafeHouse extends NormalLoc{

	SafeHouse(Player player) {
		super(player,"Safe House");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("Healthy is filled");
		System.out.println("You are in Safe Home");
		return true;
	}
	

}
