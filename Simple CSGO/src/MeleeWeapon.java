public class MeleeWeapon extends Weapon {
    private boolean isFireAble;
    private boolean isFireActive;
    private static final double FIRE_EFFECT_ON_DAMAGE = 100;

    public boolean isFireAble() {
        return isFireAble;
    }

    public void setFireAble(boolean fireAble) {
        isFireAble = fireAble;
    }

    public boolean isFireActive() {
        return isFireActive;
    }

    public void turnFireOff() {

    }

    public void turnFireOn() {

    }
}
