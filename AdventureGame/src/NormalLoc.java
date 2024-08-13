
public abstract class NormalLoc extends Location {
	
	NormalLoc(Player player, String name) {
		super(player);
		this.name = name;
	}

	@Override
	protected boolean getLocation() {
		return true;
	}

}
