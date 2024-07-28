public class RangedWeapon extends Weapon{
    private double effectiveRange;
    private int bulletInMagazine;

    public double getEffectiveRange() {
        return effectiveRange;
    }

    public void setEffectiveRange(double effectiveRange) {
        this.effectiveRange = effectiveRange;
    }

    public int getBulletInMagazine() {
        return bulletInMagazine;
    }

    public void setBulletInMagazine(int bulletInMagazine) {
        this.bulletInMagazine = bulletInMagazine;
    }
}
