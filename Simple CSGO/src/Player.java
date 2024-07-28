public class Player {
    private static final double MAX_LIMIT_ON_X_AXIS = 100;
    private static final double MAX_LIMIT_ON_Y_AXIS = 50;
    private static final double MIN_LIMIT_ON_X_AXIS = 0;
    private static final double MIN_LIMIT_ON_Y_AXIS = 0;
    private static final double INITIAL_HEALTHY = 100;
    private String nick;
    private double health;
    private double money;
    private boolean isTerrorist;

    private Weapon[] weapons;
    private double xPos;
    private double yPos;

    public String getNick() {
        return nick;
    }

    public boolean isTerrorist() {
        return isTerrorist;
    }

    public double getHealth() {
        return health;
    }

    public double getMoney() {
        return money;
    }

    public Weapon[] getWeapons() {
        return weapons;
    }

    public void printNonAffordableMessage() {

    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setMoney(double money) {
        if (money <= 1000 && money >= 0) {
            this.money = money;
        }
    }
    public void setTerrorist(boolean terrorist) {
        isTerrorist = terrorist;
    }

    public void setWeapons(Weapon[] weapons) {
        this.weapons = weapons;
    }
}
