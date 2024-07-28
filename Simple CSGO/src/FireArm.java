public class FireArm {
    private static final double MISFIRE_RATE = 100;
    private static final int BULLET_IN_MAGAZINE = 100;

    private double misfireRate;

    public double getMisfireRate() {
        return misfireRate;
    }

    public void setMisfireRate(double misfireRate) {
        this.misfireRate = misfireRate;
    }
}
